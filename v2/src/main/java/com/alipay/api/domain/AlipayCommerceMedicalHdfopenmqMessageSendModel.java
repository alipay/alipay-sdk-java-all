package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫消息变更
 *
 * @author auto create
 * @since 1.0, 2026-08-21 14:05:38
 */
public class AlipayCommerceMedicalHdfopenmqMessageSendModel extends AlipayObject {

	private static final long serialVersionUID = 2276172727482746874L;

	/**
	 * 好大夫变更消息体
	 */
	@ApiField("hdfbody")
	private String hdfbody;

	public String getHdfbody() {
		return this.hdfbody;
	}
	public void setHdfbody(String hdfbody) {
		this.hdfbody = hdfbody;
	}

}
