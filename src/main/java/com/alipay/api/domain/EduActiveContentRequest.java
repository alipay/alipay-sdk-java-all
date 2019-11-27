package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扎堆活动请求内容
 *
 * @author auto create
 * @since 1.0, 2017-09-15 16:22:09
 */
public class EduActiveContentRequest extends AlipayObject {

	private static final long serialVersionUID = 4165666657482772555L;

	/**
	 * 活动编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 活动类型
	 */
	@ApiField("type")
	private String type;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
