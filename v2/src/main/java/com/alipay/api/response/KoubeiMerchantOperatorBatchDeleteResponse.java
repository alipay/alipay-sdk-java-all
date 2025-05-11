package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.operator.batch.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:34
 */
public class KoubeiMerchantOperatorBatchDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8382445313393712687L;

	/** 
	 * 批量删除，不保证事务，可能有部分成功，部分失败;
枚举值为： PART_SUCCESS, ALL_SUCCESS
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * true, false
	 */
	@ApiField("success")
	private Boolean success;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
