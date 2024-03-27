package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.promotask.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:16:45
 */
public class AlipayMerchantIndirectPromotaskSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6121254635746341266L;

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
