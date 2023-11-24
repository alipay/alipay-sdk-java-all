package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcampuscore.entry.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-06 15:11:49
 */
public class AlipayDigitalmgmtHrcampuscoreEntrySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5433819323713645244L;

	/** 
	 * 入职表单号
	 */
	@ApiField("form_no")
	private String formNo;

	public void setFormNo(String formNo) {
		this.formNo = formNo;
	}
	public String getFormNo( ) {
		return this.formNo;
	}

}
