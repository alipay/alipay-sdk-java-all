package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.iot.nfcoperate.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-03-25 21:07:26
 */
public class AlipayPayIotNfcoperateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1887978687923873281L;

	/** 
	 * 操作成功的计划id
	 */
	@ApiField("operate_plan")
	private Long operatePlan;

	public void setOperatePlan(Long operatePlan) {
		this.operatePlan = operatePlan;
	}
	public Long getOperatePlan( ) {
		return this.operatePlan;
	}

}
