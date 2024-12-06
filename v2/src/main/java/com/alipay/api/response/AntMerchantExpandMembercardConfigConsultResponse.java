package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.membercard.config.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:35:12
 */
public class AntMerchantExpandMembercardConfigConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6178912365299338439L;

	/** 
	 * 商户不存在;
商户配置过储值产品;
商户已开通其他会员产品;
当面付未开通;
	 */
	@ApiField("detail")
	private String detail;

	/** 
	 * true: 可以开通
false: 不能开通
	 */
	@ApiField("valid")
	private Boolean valid;

	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getDetail( ) {
		return this.detail;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public Boolean getValid( ) {
		return this.valid;
	}

}
