package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubscriptionReimbursementVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.linke.checkreimburse.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-22 13:27:45
 */
public class AntLinkeCheckreimburseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7448876977181259916L;

	/** 
	 * null
	 */
	@ApiListField("subscription_reimbursement_list")
	@ApiField("subscription_reimbursement_v_o")
	private List<SubscriptionReimbursementVO> subscriptionReimbursementList;

	public void setSubscriptionReimbursementList(List<SubscriptionReimbursementVO> subscriptionReimbursementList) {
		this.subscriptionReimbursementList = subscriptionReimbursementList;
	}
	public List<SubscriptionReimbursementVO> getSubscriptionReimbursementList( ) {
		return this.subscriptionReimbursementList;
	}

}
