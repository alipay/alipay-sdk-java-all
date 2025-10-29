package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 青凉测试003
 *
 * @author auto create
 * @since 1.0, 2025-09-20 12:28:27
 */
public class AlipaySecurityDataQingliangceshiCeshiceshiceshiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4567735478464755349L;

	/**
	 * 测试目标前端
	 */
	@ApiField("blance")
	private String blance;

	public String getBlance() {
		return this.blance;
	}
	public void setBlance(String blance) {
		this.blance = blance;
	}

}
