package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.baitiaoprod.seller.status.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayBaitiaoprodSellerStatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8839486865387755245L;

	/** 
	 * 卖家是否还有未完结的订单
	 */
	@ApiField("has_unfinished_order")
	private Boolean hasUnfinishedOrder;

	/** 
	 * 卖家是否在余额宝分期付服务签约中
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
