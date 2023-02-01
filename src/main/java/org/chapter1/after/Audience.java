package org.chapter1.after;

public class Audience {
  private final Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }

  public long buy(Ticket ticket) {
    return bag.hold(ticket);
  }
}
