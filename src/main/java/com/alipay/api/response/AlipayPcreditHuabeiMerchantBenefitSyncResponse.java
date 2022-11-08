package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.benefit.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-23 11:21:48
 */
public class AlipayPcreditHuabeiMerchantBenefitSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8892421491779478519L;

	/** 
	 * 业务处理结果
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

}
