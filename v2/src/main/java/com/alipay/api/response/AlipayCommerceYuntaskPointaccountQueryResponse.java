package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.pointaccount.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-09 16:52:07
 */
public class AlipayCommerceYuntaskPointaccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1214634391839821264L;

	/** 
	 * 积分余额，单位个
	 */
	@ApiField("available_amount")
	private Long availableAmount;

	/** 
	 * 验证测试积分数量，单位个
	 */
	@ApiField("test_amount")
	private Long testAmount;

	public void setAvailableAmount(Long availableAmount) {
		this.availableAmount = availableAmount;
	}
	public Long getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setTestAmount(Long testAmount) {
		this.testAmount = testAmount;
	}
	public Long getTestAmount( ) {
		return this.testAmount;
	}

}
