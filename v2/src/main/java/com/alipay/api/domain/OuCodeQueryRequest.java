package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据ouCode查询ou请求体
 *
 * @author auto create
 * @since 1.0, 2025-07-22 14:53:19
 */
public class OuCodeQueryRequest extends AlipayObject {

	private static final long serialVersionUID = 1198192827513126518L;

	/**
	 * ou编码
	 */
	@ApiField("ou_code")
	private String ouCode;

	public String getOuCode() {
		return this.ouCode;
	}
	public void setOuCode(String ouCode) {
		this.ouCode = ouCode;
	}

}
