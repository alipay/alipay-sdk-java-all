package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.semester.info.save response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-18 17:17:30
 */
public class AlipayCommerceEducateSemesterInfoSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 6544534165184116544L;

	/** 
	 * 学期ID
	 */
	@ApiField("semester_id")
	private String semesterId;

	public void setSemesterId(String semesterId) {
		this.semesterId = semesterId;
	}
	public String getSemesterId( ) {
		return this.semesterId;
	}

}
