package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Subscription;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.subscription.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-09 11:54:02
 */
public class AlipayTradeSubscriptionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5544925765698427297L;

	/** 
	 * null
	 */
	@ApiListField("subscriptions")
	@ApiField("subscription")
	private List<Subscription> subscriptions;

	public void setSubscriptions(List<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	public List<Subscription> getSubscriptions( ) {
		return this.subscriptions;
	}

}
