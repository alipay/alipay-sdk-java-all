package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 青凉测试
 *
 * @author auto create
 * @since 1.0, 2025-07-14 14:27:33
 */
public class AlipaySecurityDataQingliangceshiCeshioneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3517552962693635213L;

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
