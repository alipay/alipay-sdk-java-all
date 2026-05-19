package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeServiceTailPaymentOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.tailpayment.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-15 16:27:45
 */
public class AlipayCommerceMerchantcardTailpaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8345129396748296952L;

	/** 
	 * null
	 */
	@ApiListField("tail_payment_orders")
	@ApiField("life_service_tail_payment_order")
	private List<LifeServiceTailPaymentOrder> tailPaymentOrders;

	public void setTailPaymentOrders(List<LifeServiceTailPaymentOrder> tailPaymentOrders) {
		this.tailPaymentOrders = tailPaymentOrders;
	}
	public List<LifeServiceTailPaymentOrder> getTailPaymentOrders( ) {
		return this.tailPaymentOrders;
	}

}
