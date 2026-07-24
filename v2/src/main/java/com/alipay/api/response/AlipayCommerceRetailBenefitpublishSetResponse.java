package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefitpublish.set response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-24 22:57:43
 */
public class AlipayCommerceRetailBenefitpublishSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1764627761221518499L;

	/** 
	 * 如果有表示是副本修改成功，没有则是正本修改chen
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
