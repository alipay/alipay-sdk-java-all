package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户分账关系
 *
 * @author auto create
 * @since 1.0, 2025-03-28 15:01:36
 */
public class RecycleRoyaltyRelationVO extends AlipayObject {

	private static final long serialVersionUID = 2639793454385675855L;

	/**
	 * 绑定的角色id
	 */
	@ApiField("bind_role_id")
	private String bindRoleId;

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

	public String getBindWalletType() {
		return this.bindWalletType;
	}
	public void setBindWalletType(String bindWalletType) {
		this.bindWalletType = bindWalletType;
	}

}
