package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取角色详情
 *
 * @author auto create
 * @since 1.0, 2023-08-21 14:52:51
 */
public class AlipayIserviceCcmRoleGetModel extends AlipayObject {

	private static final long serialVersionUID = 2232669694584922721L;

	/**
	 * 部门id，不传默认用租户ID
	 */
	@ApiField("ccs_instance_id")
	private String ccsInstanceId;

	/**
	 * 角色id
	 */
	@ApiField("id")
	private String id;

	public String getCcsInstanceId() {
		return this.ccsInstanceId;
	}
	public void setCcsInstanceId(String ccsInstanceId) {
		this.ccsInstanceId = ccsInstanceId;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
