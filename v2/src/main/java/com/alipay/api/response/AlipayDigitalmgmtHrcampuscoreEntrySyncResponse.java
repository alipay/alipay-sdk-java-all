package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.hrcampuscore.entry.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-11 19:51:55
 */
public class AlipayDigitalmgmtHrcampuscoreEntrySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8296264777232278922L;

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
