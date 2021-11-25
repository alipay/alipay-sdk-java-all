package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 饿了么商户可贷额度查询
 *
 * @author auto create
 * @since 1.0, 2020-10-22 18:12:38
 */
public class MybankCreditLoanapplyElmCreditloanadmitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8514436813517891295L;

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
