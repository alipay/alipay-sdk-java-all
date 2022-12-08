package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.promotask.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 09:21:36
 */
public class AlipayMerchantIndirectPromotaskSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3464468789524917789L;

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
