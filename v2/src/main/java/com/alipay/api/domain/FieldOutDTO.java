package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 字段信息
 *
 * @author auto create
 * @since 1.0, 2023-08-18 11:13:28
 */
public class FieldOutDTO extends AlipayObject {

	private static final long serialVersionUID = 6542412445858381976L;

	/**
	 * 字段编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 字段属性
	 */
	@ApiField("props")
	private PropertyOutDTO props;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public PropertyOutDTO getProps() {
		return this.props;
	}
	public void setProps(PropertyOutDTO props) {
		this.props = props;
	}

}
