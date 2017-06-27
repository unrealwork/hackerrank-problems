package com.unrealwork.hackerrank.thirtydays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DictMaps {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map<String, Integer> phonebook = new HashMap<>();
    for (int i = 0; i < n; i++) {
      String name = in.next();
      int phone = in.nextInt();
      phonebook.put(name, phone);
    }
    while (in.hasNext()) {
      String s = in.next();
      if (phonebook.containsKey(s)) {
        System.out.println(String.format("%s=%d", s, phonebook.get(s)));
      } else {
        System.out.println("Not found");
      }
    }
    in.close();
  }
}

