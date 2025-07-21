package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResponseObjManjiangTest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.manjt.capture response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-25 18:22:27
 */
public class AlipayOpenManjtCaptureResponse extends AlipayResponse {

	private static final long serialVersionUID = 4869826774162834684L;

	/** 
	 * 1
	 */
	@ApiField("response_obj")
	private ResponseObjManjiangTest responseObj;

	/** 
	 * null
	 */
	@ApiListField("test_plain_field")
	@ApiField("number")
	private List<Long> testPlainField;

	public void setResponseObj(ResponseObjManjiangTest responseObj) {
		this.responseObj = responseObj;
	}
	public ResponseObjManjiangTest getResponseObj( ) {
		return this.responseObj;
	}

	public void setTestPlainField(List<Long> testPlainField) {
		this.testPlainField = testPlainField;
	}
	public List<Long> getTestPlainField( ) {
		return this.testPlainField;
	}

}
