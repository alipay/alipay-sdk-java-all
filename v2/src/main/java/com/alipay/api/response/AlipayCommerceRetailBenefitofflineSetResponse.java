package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.retail.benefitoffline.set response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-10 17:00:01
 */
public class AlipayCommerceRetailBenefitofflineSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7297778861418397645L;

	/** 
	 * 副本修改id
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
