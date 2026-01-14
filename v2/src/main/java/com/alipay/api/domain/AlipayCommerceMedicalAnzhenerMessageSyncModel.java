package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安诊儿消息Sync
 *
 * @author auto create
 * @since 1.0, 2025-12-14 11:07:42
 */
public class AlipayCommerceMedicalAnzhenerMessageSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6323635683371961838L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("principal_id")
	private String principalId;

	/**
	 * 用户角色
	 */
	@ApiField("role")
	private String role;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(String principalId) {
		this.principalId = principalId;
	}

	public String getRole() {
		return this.role;
	}
	public void setRole(String role) {
		this.role = role;
	}

}
