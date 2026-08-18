package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefitpause.set response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-17 19:15:03
 */
public class AlipayCommerceRetailBenefitpauseSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4854171383594875464L;

	/** 
	 * 如果有副本审核id表示副本修改成功
	 */
	@ApiField("copy_edit_id")
	private String copyEditId;

	public void setCopyEditId(String copyEditId) {
		this.copyEditId = copyEditId;
	}
	public String getCopyEditId( ) {
		return this.copyEditId;
	}

}
