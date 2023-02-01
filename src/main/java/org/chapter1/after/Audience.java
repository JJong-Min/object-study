package org.chapter1.after;

public class Audience {
  private final Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }

  public long buy(Ticket ticket) {
    if (bag.hasInvitation()) {
      bag.setTicket(ticket);
      return 0L;
    }

    bag.setTicket(ticket);
    bag.minusAmout(ticket.getFee());
    return ticket.getFee();
  }
}
