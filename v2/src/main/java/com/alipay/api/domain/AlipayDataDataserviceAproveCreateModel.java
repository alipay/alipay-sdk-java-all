package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 非oas3.0接口
 *
 * @author auto create
 * @since 1.0, 2023-07-19 21:07:25
 */
public class AlipayDataDataserviceAproveCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4316967724638526153L;

	/**
	 * test
	 */
	@ApiField("test_body")
	private String testBody;

	/**
	 * test
	 */
	@ApiField("test_path")
	private String testPath;

	public String getTestBody() {
		return this.testBody;
	}
	public void setTestBody(String testBody) {
		this.testBody = testBody;
	}

	public String getTestPath() {
		return this.testPath;
	}
	public void setTestPath(String testPath) {
		this.testPath = testPath;
	}

}
