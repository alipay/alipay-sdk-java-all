package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 青凉测试003
 *
 * @author auto create
 * @since 1.0, 2025-07-21 11:42:32
 */
public class AlipaySecurityDataQingliangceshiCeshiceshiceshiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1681368593663376974L;

	/**
	 * 测试目标
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
