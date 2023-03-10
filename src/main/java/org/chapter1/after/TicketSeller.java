package org.chapter1.after;

public class TicketSeller {
  private final TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public void sellTo(Audience audience) {
    ticketOffice.sellTicketTo(audience);
  }
}
