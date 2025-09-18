package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户会员站点以及身份信息
 *
 * @author auto create
 * @since 1.0, 2024-09-10 14:37:18
 */
public class Member extends AlipayObject {

	private static final long serialVersionUID = 2377271241235675963L;

	/**
	 * 网商银行参与者会员ID
融租场景、保理分期保理场景必填
	 */
	@ApiField("ip_id")
	private String ipId;

	/**
	 * 网商银行参与者会员角色ID
融租场景、保理分期保理场景必填
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 会员站点：ALIPAY:支付宝，MYBANK:网商银行，TAOBAO：淘宝
	 */
	@ApiField("site")
	private String site;

	/**
	 * 站点会员登录ID
	 */
	@ApiField("site_login_id")
	private String siteLoginId;

	/**
	 * 会员站点ID映射
	 */
	@ApiField("site_open_id")
	private String siteOpenId;

	/**
	 * 会员站点ID
	 */
	@ApiField("site_user_id")
	private String siteUserId;

	/**
	 * 身份使用类型；SITE:站点类型，MYBK:网商银行客户角色类型，MYBK_SITE:站点网商类型；如果是SITE，那么site为必填字段，site_user_id和site_login_id不能全部为空；如果是MYBK，那么ip_id和ip_role_id不能全部为空；如果是MYBK_SITE，那么ip_id，ip_role_id，site为必填，site_login_id和site_user_id至少填一项
	 */
	@ApiField("use_type")
	private String useType;

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

	public String getSiteLoginId() {
		return this.siteLoginId;
	}
	public void setSiteLoginId(String siteLoginId) {
		this.siteLoginId = siteLoginId;
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

	public String getUseType() {
		return this.useType;
	}
	public void setUseType(String useType) {
		this.useType = useType;
	}

}
