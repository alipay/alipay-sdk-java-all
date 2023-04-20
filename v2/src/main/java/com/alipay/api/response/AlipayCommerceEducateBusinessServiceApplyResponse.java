package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.business.service.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-14 10:15:03
 */
public class AlipayCommerceEducateBusinessServiceApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3561837549889748373L;

	/** 
	 * 学校编号
	 */
	@ApiField("school_no")
	private String schoolNo;

	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}
	public String getSchoolNo( ) {
		return this.schoolNo;
	}

}
