package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户分账关系
 *
 * @author auto create
 * @since 1.0, 2025-08-11 22:47:28
 */
public class RecycleRoyaltyRelationVO extends AlipayObject {

	private static final long serialVersionUID = 3795979611853774564L;

	/**
	 * 绑定的角色id
	 */
	@ApiField("bind_role_id")
	private String bindRoleId;

	/**
	 * 绑定角色loginId
	 */
	@ApiField("bind_role_login_id")
	private String bindRoleLoginId;

	/**
	 * 绑定角色openId
	 */
	@ApiField("bind_role_open_id")
	private String bindRoleOpenId;

	/**
	 * 绑定的角色类型
	 */
	@ApiField("bind_role_type")
	private String bindRoleType;

	/**
	 * 绑定的收款钱包
	 */
	@ApiField("bind_wallet_id")
	private String bindWalletId;

	/**
	 * 绑定的收款loginId
	 */
	@ApiField("bind_wallet_login_id")
	private String bindWalletLoginId;

	/**
	 * 绑定的收款openId
	 */
	@ApiField("bind_wallet_open_id")
	private String bindWalletOpenId;

	/**
	 * 绑定的支付类型
	 */
	@ApiField("bind_wallet_type")
	private String bindWalletType;

	public String getBindRoleId() {
		return this.bindRoleId;
	}
	public void setBindRoleId(String bindRoleId) {
		this.bindRoleId = bindRoleId;
	}

	public String getBindRoleLoginId() {
		return this.bindRoleLoginId;
	}
	public void setBindRoleLoginId(String bindRoleLoginId) {
		this.bindRoleLoginId = bindRoleLoginId;
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

	public String getBindWalletId() {
		return this.bindWalletId;
	}
	public void setBindWalletId(String bindWalletId) {
		this.bindWalletId = bindWalletId;
	}

	public String getBindWalletLoginId() {
		return this.bindWalletLoginId;
	}
	public void setBindWalletLoginId(String bindWalletLoginId) {
		this.bindWalletLoginId = bindWalletLoginId;
	}

	public String getBindWalletOpenId() {
		return this.bindWalletOpenId;
	}
	public void setBindWalletOpenId(String bindWalletOpenId) {
		this.bindWalletOpenId = bindWalletOpenId;
	}

	public String getBindWalletType() {
		return this.bindWalletType;
	}
	public void setBindWalletType(String bindWalletType) {
		this.bindWalletType = bindWalletType;
	}

}
