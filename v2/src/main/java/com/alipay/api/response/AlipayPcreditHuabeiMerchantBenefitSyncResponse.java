package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.merchant.benefit.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:27:38
 */
public class AlipayPcreditHuabeiMerchantBenefitSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2461521661779365127L;

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
