package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.ecsign.seal.save response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:59
 */
public class AlipayFinancialnetAuthEcsignSealSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7182811484412428277L;

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
