package com.csc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ZipperTest {
  Zipper zipper;
  @BeforeEach
  void setUp() {
    zipper = new Zipper();
  }
  @Test
  void itWorks() {
    assertEquals(true, true);
  }
    @Test
    void testzipwithintegers() {
        List<Integer> list1 = List.of(1, 3,5);
        List<Integer> list2 = List.of(2, 4, 6);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = zipper.zip(list1, list2);
        assertEquals(expected, result);
    }
    @Test
    void testzipwithstrings() {
        List<String> list1 = List.of("Red", "Yellow", "Blue");
        List<String> list2 = List.of("Orange", "Green", "Purple");
        List<String> expected = List.of("Red", "Orange", "Yellow", "Green", "Blue", "Purple");
        List<String> result = zipper.zip(list1, list2);
        assertEquals(expected, result);
    }

    @Test
    void testzipwithdifferentsizes() {
        List<Integer> list1 = List.of(1, 3);
        List<Integer> list2 = List.of(2, 4, 6, 8);
        List<Integer> expected = List.of(1, 2, 3, 4, 6, 8);
        List<Integer> result = zipper.zip(list1, list2);
        assertEquals(expected, result);
    }
    @Test
    void testzipwithonelist() {
        List<Integer> list1 = List.of(1, 2);
        List<Integer> list2 = List.of();
        List<Integer> expected = List.of(1, 2);
        List<Integer> result = zipper.zip(list1, list2);
        assertEquals(expected, result);
    }
    @Test
    void testzipwithoutlists() {
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of();
        List<Integer> expected = List.of();
        List<Integer> result = zipper.zip(list1, list2);
        assertEquals(expected, result);
    }
  }