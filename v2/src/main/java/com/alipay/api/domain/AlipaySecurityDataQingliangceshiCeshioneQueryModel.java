package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 青凉测试
 *
 * @author auto create
 * @since 1.0, 2025-09-20 12:29:00
 */
public class AlipaySecurityDataQingliangceshiCeshioneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3787539121245146633L;

	/**
	 * 用户测试
	 */
	@ApiField("blance_id")
	private String blanceId;

	public String getBlanceId() {
		return this.blanceId;
	}
	public void setBlanceId(String blanceId) {
		this.blanceId = blanceId;
	}

}
