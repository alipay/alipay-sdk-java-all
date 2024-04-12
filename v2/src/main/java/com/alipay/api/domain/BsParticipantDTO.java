package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营计划-参与者
 *
 * @author auto create
 * @since 1.0, 2023-03-14 11:36:01
 */
public class BsParticipantDTO extends AlipayObject {

	private static final long serialVersionUID = 5561725818886183758L;

	/**
	 * 参与者类型，支持PARTNER_ID 、LOGON_ID等
	 */
	@ApiField("type")
	private String type;

	/**
	 * 类型对应值,传参也不一样
	 */
	@ApiField("value")
	private String value;

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
