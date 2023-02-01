package org.chapter1.before;

public class Theather {
  private TicketSeller ticketSeller;

  public Theather(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  public void enter(Audience audience) {
    if (audience.getBag().hasInvitation()) {
      Ticket ticket = ticketSeller.getTicketOffice().getTicket();
      audience.getBag().setTicket(ticket);
      return;
    }

    Ticket ticket = ticketSeller.getTicketOffice().getTicket();
    audience.getBag().minusAmout(ticket.getFee());
    ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
    audience.getBag().setTicket(ticket);
  }
}
