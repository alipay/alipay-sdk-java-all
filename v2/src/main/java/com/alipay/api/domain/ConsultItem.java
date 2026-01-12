package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗信息咨询实体属性
 *
 * @author auto create
 * @since 1.0, 2025-07-23 16:37:08
 */
public class ConsultItem extends AlipayObject {

	private static final long serialVersionUID = 3749953515611644788L;

	/**
	 * 咨询属性字段，如license_no(医生执业证号)
	 */
	@ApiField("name")
	private String name;

	/**
	 * 实际咨询属性值
	 */
	@ApiField("value")
	private String value;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
