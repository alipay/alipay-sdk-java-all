package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 饿了么商户可贷额度查询
 *
 * @author auto create
 * @since 1.0, 2023-01-11 16:49:23
 */
public class MybankCreditLoanapplyElmCreditloanadmitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3365712172336562835L;

	/**
	 * 站点的会员ID对应的open_id
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

}
