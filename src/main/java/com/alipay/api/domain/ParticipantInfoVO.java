package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约参与者VO
 *
 * @author auto create
 * @since 1.0, 2020-12-24 20:46:36
 */
public class ParticipantInfoVO extends AlipayObject {

	private static final long serialVersionUID = 4567589539939232788L;

	/**
	 * 参与者名称类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 参与者名称
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
