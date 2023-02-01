package org.chapter1.after;

public class Theather {
  private final TicketSeller ticketSeller;

  public Theather(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  public void enter(Audience audience) {
    ticketSeller.sellTo(audience);
  }
}
