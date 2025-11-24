package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 申码返回信息
 *
 * @author auto create
 * @since 1.0, 2019-01-15 18:55:48
 */
public class CodeResInfo extends AlipayObject {

	private static final long serialVersionUID = 5149346138845739514L;

	/**
	 * 二维码唯一标识id
	 */
	@ApiField("code_id")
	private String codeId;

	/**
	 * 二维码url地址
	 */
	@ApiField("code_url")
	private String codeUrl;

	public String getCodeId() {
		return this.codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getCodeUrl() {
		return this.codeUrl;
	}
	public void setCodeUrl(String codeUrl) {
		this.codeUrl = codeUrl;
	}

}
