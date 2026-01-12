package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班计划查询提供
 *
 * @author auto create
 * @since 1.0, 2025-10-17 15:23:19
 */
public class AlipayCommerceMedicalHdfappointmentQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5467679941365439736L;

	/**
	 * 消息体
	 */
	@ApiField("msgcontent")
	private String msgcontent;

	/**
	 * 查询类型
	 */
	@ApiField("type")
	private String type;

	public String getMsgcontent() {
		return this.msgcontent;
	}
	public void setMsgcontent(String msgcontent) {
		this.msgcontent = msgcontent;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
