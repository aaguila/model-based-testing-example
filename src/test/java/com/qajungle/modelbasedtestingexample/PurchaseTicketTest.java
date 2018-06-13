package com.qajungle.modelbasedtestingexample;

import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@GraphWalker(value = "quick_random(edge_coverage(100))", start = "e_CreateUser")
@SpringBootTest
public class PurchaseTicketTest extends ExecutionContext implements com.qajungle.modelbasedtestingexample.PurchaseTicket {

    private static final Logger LOGGER = LoggerFactory.getLogger(PurchaseTicketTest.class);

    @Override
    public void e_CreateUser() {
        LOGGER.info("EDGE: e_CreateUser");
    }

    @Override
    public void v_ShoppingCart() {
        LOGGER.info("VERTEX: v_ShoppingCart");
    }

    @Override
    public void e_AddPaymentMethod() {
        LOGGER.info("EDGE: e_AddPaymentMethod");
    }

    @Override
    public void v_Purchase() {
        LOGGER.info("VERTEX: v_Purchase");
    }

    @Override
    public void v_TicketAdded() {
        String type = getAttribute("type").toString();
        Boolean validTicket = (Boolean) getAttribute("validTicket");
        LOGGER.info("VERTEX: v_AddTicket with type value " + type + " and validTicket value " + validTicket);
    }

    @Override
    public void v_UserPaymentMethodAdded() {
        String paymentMethod = getAttribute("paymentMethod").toString();
        String validPaymentMethod = getAttribute("validPaymentMethod").toString();
        LOGGER.info("VERTEX: v_UserPaymentMethodAdded with paymentMethod value: " + paymentMethod + " and validPaymentMethod value: " + validPaymentMethod);
    }

    @Override
    public void e_Purchase() {
        LOGGER.info("e_Purchase");
    }

    @Override
    public void e_ShoppingCart() {
        boolean validCart = (Boolean) getAttribute("validCart");
        LOGGER.info("VERTEX: e_ShoppingCart with validCart value " + validCart);
    }

    @Override
    public void e_AddTicket() {
        LOGGER.info("EDGE: e_AddTicket");
    }

    @Override
    public void v_UserCreated() {
        LOGGER.info("v_UserCreated");
    }

    @Override
    public void e_End() {
        LOGGER.info("e_End");
    }

}
