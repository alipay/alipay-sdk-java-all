package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商查询生活号的扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-06-16 10:23:23
 */
public class MiniprogramExtra extends AlipayObject {

	private static final long serialVersionUID = 2718212967199124479L;

	/**
	 * 生活号佣金类型
	 */
	@ApiField("commission_type")
	private String commissionType;

	public String getCommissionType() {
		return this.commissionType;
	}
	public void setCommissionType(String commissionType) {
		this.commissionType = commissionType;
	}

}
