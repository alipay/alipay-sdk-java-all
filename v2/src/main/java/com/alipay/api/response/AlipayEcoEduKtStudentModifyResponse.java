package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.kt.student.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:39
 */
public class AlipayEcoEduKtStudentModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5435441241657361759L;

	/** 
	 * Y：代表成功；N：代表失败
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
