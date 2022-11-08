package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参数信息
 *
 * @author auto create
 * @since 1.0, 2022-09-19 14:25:19
 */
public class ServeParamInfo extends AlipayObject {

	private static final long serialVersionUID = 7487926447238854277L;

	/**
	 * 参数描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 参数名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 参数类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 对应参数的值
	 */
	@ApiField("value")
	private String value;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
