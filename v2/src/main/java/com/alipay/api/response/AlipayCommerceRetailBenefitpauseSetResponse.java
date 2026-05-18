package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefitpause.set response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-24 22:57:43
 */
public class AlipayCommerceRetailBenefitpauseSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4865573844834257443L;

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
