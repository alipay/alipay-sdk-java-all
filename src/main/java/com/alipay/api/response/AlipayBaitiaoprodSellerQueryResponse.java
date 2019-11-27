package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.baitiaoprod.seller.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayBaitiaoprodSellerQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7734267542748698439L;

	/** 
	 * 卖家是否还有未完结的订单
	 */
	@ApiField("has_unfinished_order")
	private Boolean hasUnfinishedOrder;

	/** 
	 * 卖家是否在“余额宝分期付”服务签约中
	 */
	@ApiField("in_service")
	private Boolean inService;

	public void setHasUnfinishedOrder(Boolean hasUnfinishedOrder) {
		this.hasUnfinishedOrder = hasUnfinishedOrder;
	}
	public Boolean getHasUnfinishedOrder( ) {
		return this.hasUnfinishedOrder;
	}

	public void setInService(Boolean inService) {
		this.inService = inService;
	}
	public Boolean getInService( ) {
		return this.inService;
	}

}
