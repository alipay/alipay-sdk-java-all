package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益的描述
 *
 * @author auto create
 * @since 1.0, 2024-09-30 01:14:33
 */
public class Benefit extends AlipayObject {

	private static final long serialVersionUID = 4418779518547747595L;

	/**
	 * 保险的具体描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 保险
	 */
	@ApiField("name")
	private String name;

	/**
	 * 权益的类型，比如保险
	 */
	@ApiField("type")
	private String type;

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

}
