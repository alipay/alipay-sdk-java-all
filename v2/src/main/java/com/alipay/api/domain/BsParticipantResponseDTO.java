package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营报名参与者操作失败返回模型
 *
 * @author auto create
 * @since 1.0, 2023-03-14 11:35:52
 */
public class BsParticipantResponseDTO extends AlipayObject {

	private static final long serialVersionUID = 1276259951147466712L;

	/**
	 * 批量操作接口的单个参与者失败原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 参与类型，支持PARTNER_ID 、LOGON_ID等
	 */
	@ApiField("type")
	private String type;

	/**
	 * 类型对应值,传参也不一样
	 */
	@ApiField("value")
	private String value;

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
