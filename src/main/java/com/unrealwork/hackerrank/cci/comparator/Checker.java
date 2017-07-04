package com.unrealwork.hackerrank.cci.comparator;

import java.util.Comparator;


class Checker implements Comparator<Player> {
  @Override
  public int compare(Player p1, Player p2) {
    return (p2.score > p1.score) ? 1 : (p2.score == p1.score) ? p1.name.compareTo(p2.name) : -1;
  }
}
