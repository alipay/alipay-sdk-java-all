package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sdkExecute资源测试
 *
 * @author auto create
 * @since 1.0, 2023-11-02 10:11:05
 */
public class AlipayOpenAppSdkTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6176592895277572662L;

	/**
	 * 123
	 */
	@ApiField("int_body")
	private Long intBody;

	/**
	 * 123
	 */
	@ApiField("string_str")
	private String stringStr;

	public Long getIntBody() {
		return this.intBody;
	}
	public void setIntBody(Long intBody) {
		this.intBody = intBody;
	}

	public String getStringStr() {
		return this.stringStr;
	}
	public void setStringStr(String stringStr) {
		this.stringStr = stringStr;
	}

}
