package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数据查询详细参数
 *
 * @author auto create
 * @since 1.0, 2018-01-23 11:39:06
 */
public class SceneProdDataQueryParam extends AlipayObject {

	private static final long serialVersionUID = 6362231915613191233L;

	/**
	 * 网商银行的申请单号，通过mybank.credit.sceneprod.loan.apply接口返回的applyno获取
	 */
	@ApiField("app_seqno")
	private String appSeqno;

	/**
	 * 网商银行参与者会员ID
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 网商银行参与者会员角色ID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 外部站点，比如：ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 外部站点的userid，比如支付宝userid
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getAppSeqno() {
		return this.appSeqno;
	}
	public void setAppSeqno(String appSeqno) {
		this.appSeqno = appSeqno;
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

}
