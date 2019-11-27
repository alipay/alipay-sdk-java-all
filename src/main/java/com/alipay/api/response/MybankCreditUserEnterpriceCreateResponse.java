package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.user.enterprice.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditUserEnterpriceCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3345811889165852551L;

	/** 
	 * 银行参与者id，是在网商银行创建会员后生成的id，网商银行会员的唯一标识
	 */
	@ApiField("ip_id")
	private String ipId;

	/** 
	 * 银行参与者角色id，是在网商银行创建会员后生成的角色id，网商银行会员角色的唯一标识
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/** 
	 * 外部站点，比如支付宝alipay
	 */
	@ApiField("site")
	private String site;

	/** 
	 * 外部站点的userid，比如支付宝userid
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public void setIpId(String ipId) {
		this.ipId = ipId;
	}
	public String getIpId( ) {
		return this.ipId;
	}

	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}
	public String getIpRoleId( ) {
		return this.ipRoleId;
	}

	public void setSite(String site) {
		this.site = site;
	}
	public String getSite( ) {
		return this.site;
	}

	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}
	public String getSiteUserId( ) {
		return this.siteUserId;
	}

}
