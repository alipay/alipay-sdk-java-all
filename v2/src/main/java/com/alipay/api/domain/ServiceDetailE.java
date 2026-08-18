package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务推进补充信息
 *
 * @author auto create
 * @since 1.0, 2026-08-17 15:12:49
 */
public class ServiceDetailE extends AlipayObject {

	private static final long serialVersionUID = 6766413254154637923L;

	/**
	 * 备注信息
	 */
	@ApiField("remark")
	private String remark;

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
