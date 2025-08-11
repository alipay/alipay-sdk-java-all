package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账绑定详情
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:01:36
 */
public class RecycleRoyaltyQueryVO extends AlipayObject {

	private static final long serialVersionUID = 5575145524472176786L;

	/**
	 * 绑定的门店/店员userId
	 */
	@ApiField("bind_role_id")
	private String bindRoleId;

	/**
	 * 绑定的门店/店员userId
	 */
	@ApiField("bind_role_open_id")
	private String bindRoleOpenId;

	/**
	 * 绑定的角色类型
	 */
	@ApiField("bind_role_type")
	private String bindRoleType;

	/**
	 * 绑定状态
	 */
	@ApiField("bind_status")
	private String bindStatus;

	/**
	 * 绑定的收款钱包
	 */
	@ApiField("bind_wallet_id")
	private String bindWalletId;

	/**
	 * 收款方式
	 */
	@ApiField("bind_wallet_type")
	private String bindWalletType;

	public String getBindRoleId() {
		return this.bindRoleId;
	}
	public void setBindRoleId(String bindRoleId) {
		this.bindRoleId = bindRoleId;
	}

	public String getBindRoleOpenId() {
		return this.bindRoleOpenId;
	}
	public void setBindRoleOpenId(String bindRoleOpenId) {
		this.bindRoleOpenId = bindRoleOpenId;
	}

	public String getBindRoleType() {
		return this.bindRoleType;
	}
	public void setBindRoleType(String bindRoleType) {
		this.bindRoleType = bindRoleType;
	}

	public String getBindStatus() {
		return this.bindStatus;
	}
	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}

	public String getBindWalletId() {
		return this.bindWalletId;
	}
	public void setBindWalletId(String bindWalletId) {
		this.bindWalletId = bindWalletId;
	}

	public String getBindWalletType() {
		return this.bindWalletType;
	}
	public void setBindWalletType(String bindWalletType) {
		this.bindWalletType = bindWalletType;
	}

}
