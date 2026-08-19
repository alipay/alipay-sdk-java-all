package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefitpublish.set response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-17 19:13:59
 */
public class AlipayCommerceRetailBenefitpublishSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6773883865322697343L;

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
