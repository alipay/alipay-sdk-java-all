package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 描述付款人收款人信息
 *
 * @author auto create
 * @since 1.0, 2017-09-07 20:38:00
 */
public class FactoringUser extends AlipayObject {

	private static final long serialVersionUID = 7499493939936239183L;

	/**
	 * 账户信息
	 */
	@ApiField("account")
	private FactoringAccount account;

	/**
	 * 银行客户的IP_ID
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 银行客户的IP_ROLE_ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 会员类型
	 */
	@ApiField("site")
	private String site;

	/**
	 * 会员ID，1688的memberId或者淘宝的user_id，和站点有关
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 支付宝ID，必填, 现在只支持支付宝
	 */
	@ApiField("user_id")
	private String userId;

	public FactoringAccount getAccount() {
		return this.account;
	}
	public void setAccount(FactoringAccount account) {
		this.account = account;
	}

	public String getIpId() {
		return this.ipId;
	}
	public void setIpId(String ipId) {
		this.ipId = ipId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
