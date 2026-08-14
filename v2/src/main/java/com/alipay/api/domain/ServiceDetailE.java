package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务推进补充信息
 *
 * @author auto create
 * @since 1.0, 2026-08-07 15:35:43
 */
public class ServiceDetailE extends AlipayObject {

	private static final long serialVersionUID = 5148884931517611436L;

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
