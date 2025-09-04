package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构工单业务信息
 *
 * @author auto create
 * @since 1.0, 2024-01-25 10:11:37
 */
public class OutOrderBizInfo extends AlipayObject {

	private static final long serialVersionUID = 8583696221425485359L;

	/**
	 * 业务信息字段code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 业务字段描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 业务字段值
	 */
	@ApiField("value")
	private String value;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
