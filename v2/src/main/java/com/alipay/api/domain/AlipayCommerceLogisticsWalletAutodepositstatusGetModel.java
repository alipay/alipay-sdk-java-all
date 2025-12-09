package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流钱包自动充值状态查询
 *
 * @author auto create
 * @since 1.0, 2025-09-15 14:02:39
 */
public class AlipayCommerceLogisticsWalletAutodepositstatusGetModel extends AlipayObject {

	private static final long serialVersionUID = 2324235852567887498L;

	/**
	 * 支付宝钱包产品码
	 */
	@ApiField("biz_product_code")
	private String bizProductCode;

	/**
	 * 支付宝钱包场景码
	 */
	@ApiField("biz_scene_code")
	private String bizSceneCode;

	/**
	 * 支付宝账号ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝账号ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝钱包唯一ID
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	/**
	 * 钱包归属主体PID
	 */
	@ApiField("wallet_partner_id")
	private String walletPartnerId;

	/**
	 * 支付宝钱包模版唯一ID
	 */
	@ApiField("wallet_template_id")
	private String walletTemplateId;

	public String getBizProductCode() {
		return this.bizProductCode;
	}
	public void setBizProductCode(String bizProductCode) {
		this.bizProductCode = bizProductCode;
	}

	public String getBizSceneCode() {
		return this.bizSceneCode;
	}
	public void setBizSceneCode(String bizSceneCode) {
		this.bizSceneCode = bizSceneCode;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

	public String getWalletPartnerId() {
		return this.walletPartnerId;
	}
	public void setWalletPartnerId(String walletPartnerId) {
		this.walletPartnerId = walletPartnerId;
	}

	public String getWalletTemplateId() {
		return this.walletTemplateId;
	}
	public void setWalletTemplateId(String walletTemplateId) {
		this.walletTemplateId = walletTemplateId;
	}

}
