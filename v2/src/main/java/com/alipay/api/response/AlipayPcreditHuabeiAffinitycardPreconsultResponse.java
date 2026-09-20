package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.affinitycard.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-26 10:57:51
 */
public class AlipayPcreditHuabeiAffinitycardPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 4829547918758556472L;

	/** 
	 * 是否可开通联名卡
	 */
	@ApiField("can_apply")
	private Boolean canApply;

	public void setCanApply(Boolean canApply) {
		this.canApply = canApply;
	}
	public Boolean getCanApply( ) {
		return this.canApply;
	}

}
