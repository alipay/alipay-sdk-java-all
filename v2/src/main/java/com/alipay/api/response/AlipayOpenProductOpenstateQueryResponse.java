package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.product.openstate.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:52:39
 */
public class AlipayOpenProductOpenstateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4862585322694719855L;

	/** 
	 * 生效时间
	 */
	@ApiField("effect_date")
	private String effectDate;

	/** 
	 * 失效时间
	 */
	@ApiField("expiry_date")
	private String expiryDate;

	/** 
	 * 返回产品开通状态
	 */
	@ApiField("status")
	private String status;

	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}
	public String getEffectDate( ) {
		return this.effectDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getExpiryDate( ) {
		return this.expiryDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
