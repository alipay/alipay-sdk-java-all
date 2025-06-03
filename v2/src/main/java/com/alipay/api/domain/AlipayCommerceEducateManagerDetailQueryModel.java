package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 管理员详情查询
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:52
 */
public class AlipayCommerceEducateManagerDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2322366534981825659L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 管理员ID
	 */
	@ApiField("manager_id")
	private String managerId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getManagerId() {
		return this.managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

}
