package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户有效的凭证详细信息，营销新平台使用
 *
 * @author auto create
 * @since 1.0, 2023-11-23 11:36:10
 */
public class AlipayMarketingCampaignCertQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8116449279998547968L;

	/**
	 * 营销平台凭证批次号，可能是数字和字母的组合
	 */
	@ApiField("cert_template_id")
	private String certTemplateId;

	/**
	 * 用户登录账号名：邮箱或手机号。已知支付宝账号的活动触发调用中，user_id与login_id至少有一个非空，都非空时，以user_id为准。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID：支付宝用户唯一标识。该参数用于已知支付宝账号的活动触发。user_id、login_id两个参数至少有一个非空。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertTemplateId() {
		return this.certTemplateId;
	}
	public void setCertTemplateId(String certTemplateId) {
		this.certTemplateId = certTemplateId;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
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

}
