package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.discount.solution.offline response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:27
 */
public class AlipayPcreditHuabeiDiscountSolutionOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 8779873683251575611L;

	/** 
	 * 贴息方案是否下架成功，true下架成功，false下架失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
