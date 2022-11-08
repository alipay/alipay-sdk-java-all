package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.ipsponsor.consumegold.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-15 11:17:31
 */
public class AlipayOpenIpsponsorConsumegoldQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7224629697565115817L;

	/** 
	 * 开通状态
0:未开通; 1:开通
	 */
	@ApiField("open_status")
	private String openStatus;

	/** 
	 * 用户拥有的总消费金
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}
	public String getOpenStatus( ) {
		return this.openStatus;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

}
