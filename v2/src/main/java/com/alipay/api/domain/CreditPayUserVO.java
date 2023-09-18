package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 贷记资产用户模型
 *
 * @author auto create
 * @since 1.0, 2023-03-28 09:43:32
 */
public class CreditPayUserVO extends AlipayObject {

	private static final long serialVersionUID = 2537132465317545448L;

	/**
	 * 开放id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝UID，可选
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 证件号，可选，如果存在，certType一定要存在。在返回结果中
ps. cert_no一定不存在
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型，可选，如果存在，certNo一定要存在
类型：身份证RESIDENT、社会统一信用码UNIFIED_SOCIAL_CREDIT_CODE_CERTIFICATE
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 网商会员ID，可选，如果该字段存在，ip_role_id一定要存在
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 网商会员角色ID，可选，如果该字段存在，ip_id一定要存在
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 可选，如果站点存在，site_user_id一定存在
1.ALIPAY(支付宝)
2.TAOBAO(淘宝)
3.CBU(中文站)
4.ICBU(国际站)
	 */
	@ApiField("site")
	private String site;

	/**
	 * 可选，如果站点用户ID存在，site一定存在
	 */
	@ApiField("site_open_id")
	private String siteOpenId;

	/**
	 * 可选，如果站点用户ID存在，site一定存在
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
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

	public String getSiteOpenId() {
		return this.siteOpenId;
	}
	public void setSiteOpenId(String siteOpenId) {
		this.siteOpenId = siteOpenId;
	}

	public String getSiteUserId() {
		return this.siteUserId;
	}
	public void setSiteUserId(String siteUserId) {
		this.siteUserId = siteUserId;
	}

}
