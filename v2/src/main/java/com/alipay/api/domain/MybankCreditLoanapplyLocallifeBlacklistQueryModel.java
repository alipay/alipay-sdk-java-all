package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本地生活商户黑名单查询
 *
 * @author auto create
 * @since 1.0, 2020-04-17 17:25:00
 */
public class MybankCreditLoanapplyLocallifeBlacklistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6818821639932722417L;

	/**
	 * 站点会员
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点的会员ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

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

}
