package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.promotask.sync response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-11 15:55:03
 */
public class AlipayMerchantIndirectPromotaskSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2675887172889836685L;

	/** 
	 * 任务同步结果，true/false
	 */
	@ApiField("result_status")
	private Boolean resultStatus;

	public void setResultStatus(Boolean resultStatus) {
		this.resultStatus = resultStatus;
	}
	public Boolean getResultStatus( ) {
		return this.resultStatus;
	}

}
