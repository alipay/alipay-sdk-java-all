package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.seal.save response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-19 09:33:50
 */
public class AlipayFinancialnetAuthEcsignSealSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 5219671498941449297L;

	/** 
	 * 印章ID，如果有则为唯一值，用于印章更新场景，在创建完和更新完均会返回该值。
	 */
	@ApiField("seal_id")
	private String sealId;

	public void setSealId(String sealId) {
		this.sealId = sealId;
	}
	public String getSealId( ) {
		return this.sealId;
	}

}
