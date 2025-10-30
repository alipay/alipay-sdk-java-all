package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除管理员
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:33:02
 */
public class AlipayCommerceEducateManagerInfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4372893733856896789L;

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
