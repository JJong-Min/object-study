package org.chapter1.after;

public class Bag {
  private long amount;
  private Invitation invitation;
  private Ticket ticket;

  public long hold(Ticket ticket) {
    this.ticket = ticket;
    if (hasInvitation()) {
      return 0L;
    }

    minusAmount(ticket.getFee());
    return ticket.getFee();
  }

  private boolean hasInvitation() {
    return invitation != null;
  }

  private void minusAmount(long amount) {
    this.amount -= amount;
  }
}
