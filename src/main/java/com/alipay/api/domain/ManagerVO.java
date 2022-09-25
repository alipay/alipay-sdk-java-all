package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主要管理人员
 *
 * @author auto create
 * @since 1.0, 2019-01-22 14:30:06
 */
public class ManagerVO extends AlipayObject {

	private static final long serialVersionUID = 6829656122782695233L;

	/**
	 * 管理人员名称
	 */
	@ApiField("manager_name")
	private String managerName;

	/**
	 * 职务
	 */
	@ApiField("manager_position")
	private String managerPosition;

	public String getManagerName() {
		return this.managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerPosition() {
		return this.managerPosition;
	}
	public void setManagerPosition(String managerPosition) {
		this.managerPosition = managerPosition;
	}

}
