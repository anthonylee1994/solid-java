package com.solid.s;

import java.math.BigDecimal;

/**
 * @author anthonylee
 */
public record GoodInvoice(
    String customer,
    State state,
    BigDecimal total
) {
}
