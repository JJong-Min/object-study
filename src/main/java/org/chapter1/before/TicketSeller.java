package org.chapter1.before;

public class TicketSeller {
  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public TicketOffice getTicketOffice() {
    return ticketOffice;
  }
}
