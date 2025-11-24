package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付信息
 *
 * @author auto create
 * @since 1.0, 2025-09-30 10:47:48
 */
public class PurchaseInfo extends AlipayObject {

	private static final long serialVersionUID = 4246279951987916837L;

	/**
	 * 扣款账户id
	 */
	@ApiField("bind_wallet_id")
	private String bindWalletId;

	/**
	 * 账户类型
	 */
	@ApiField("bind_wallet_type")
	private String bindWalletType;

	/**
	 * 代扣关联openid
	 */
	@ApiField("pay_relation_openid")
	private String payRelationOpenid;

	/**
	 * 代扣关联uid
	 */
	@ApiField("pay_relation_uid")
	private String payRelationUid;

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

	public String getPayRelationOpenid() {
		return this.payRelationOpenid;
	}
	public void setPayRelationOpenid(String payRelationOpenid) {
		this.payRelationOpenid = payRelationOpenid;
	}

	public String getPayRelationUid() {
		return this.payRelationUid;
	}
	public void setPayRelationUid(String payRelationUid) {
		this.payRelationUid = payRelationUid;
	}

}
