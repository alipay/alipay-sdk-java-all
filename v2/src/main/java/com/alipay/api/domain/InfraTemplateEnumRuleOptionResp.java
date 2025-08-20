package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创意模版枚举规则限制对象详情描述
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:59
 */
public class InfraTemplateEnumRuleOptionResp extends AlipayObject {

	private static final long serialVersionUID = 2865233129212646863L;

	/**
	 * 元素可选值编码,非自定义错误码,非枚举类型
	 */
	@ApiField("code")
	private String code;

	/**
	 * 元素可选值编码描述
	 */
	@ApiField("desc")
	private String desc;

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

}
