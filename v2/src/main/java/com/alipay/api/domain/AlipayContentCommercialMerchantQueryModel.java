package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家子账号
 *
 * @author auto create
 * @since 1.0, 2024-11-12 18:03:46
 */
public class AlipayContentCommercialMerchantQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6435118798449778415L;

	/**
	 * 支付宝用户的openid。
	 */
	@ApiField("login_open_id")
	private String loginOpenId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("login_user_id")
	private String loginUserId;

	/**
	 * 主账户openid。
	 */
	@ApiField("owner_open_id")
	private String ownerOpenId;

	/**
	 * 主账户id。
	 */
	@ApiField("owner_user_id")
	private String ownerUserId;

	public String getLoginOpenId() {
		return this.loginOpenId;
	}
	public void setLoginOpenId(String loginOpenId) {
		this.loginOpenId = loginOpenId;
	}

	public String getLoginUserId() {
		return this.loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getOwnerOpenId() {
		return this.ownerOpenId;
	}
	public void setOwnerOpenId(String ownerOpenId) {
		this.ownerOpenId = ownerOpenId;
	}

	public String getOwnerUserId() {
		return this.ownerUserId;
	}
	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

}
