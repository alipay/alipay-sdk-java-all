package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.student.detail.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-14 14:02:12
 */
public class AlipayCommerceEducateStudentDetailModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7877188164498153792L;

	/** 
	 * 如果学生信息更新成功，则返回SUCCESS ， 失败返回FAIL。
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
