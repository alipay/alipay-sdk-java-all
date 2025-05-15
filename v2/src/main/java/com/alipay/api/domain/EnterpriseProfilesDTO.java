package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业个性化信息
 *
 * @author auto create
 * @since 1.0, 2025-04-21 13:10:57
 */
public class EnterpriseProfilesDTO extends AlipayObject {

	private static final long serialVersionUID = 7623135911114872896L;

	/**
	 * 是否需要自动创建企业人脸库，适用于对接团餐刷脸付、门禁刷脸通行等场景；<br/>
不传默认为 false，传 true 时会自动创建企业的 IOT 设备人脸库，人脸库创建失败会阻塞企业注册
	 */
	@ApiField("create_iot_group")
	private Boolean createIotGroup;

	/**
	 * 企业授信申请人的手机号码；<br/>
当出资方式为企业授信出资时(sign_fund_way=CREDIT)，会用于银行授信申请页面免登
	 */
	@ApiField("credit_applicant_mobile")
	private String creditApplicantMobile;

	/**
	 * 用于区分资金因公付协议、以及收银台文案等差异；不传默认为ISV_QYM。
	 */
	@ApiField("fund_biz_scene")
	private String fundBizScene;

	/**
	 * 对接支付宝「一脸通行开通插件」的支付宝小程序appId
	 */
	@ApiField("group_app_id")
	private String groupAppId;

	/**
	 * 接口返回的PC端企业注册链接，需适用的集成模式；<br/>不传默认为网页跳转的模式，需要跳转页面链接进入企业注册页面；如需以页面组件嵌入其他系统，请传入iframe
	 */
	@ApiField("pc_invite_url_mode")
	private String pcInviteUrlMode;

	public Boolean getCreateIotGroup() {
		return this.createIotGroup;
	}
	public void setCreateIotGroup(Boolean createIotGroup) {
		this.createIotGroup = createIotGroup;
	}

	public String getCreditApplicantMobile() {
		return this.creditApplicantMobile;
	}
	public void setCreditApplicantMobile(String creditApplicantMobile) {
		this.creditApplicantMobile = creditApplicantMobile;
	}

	public String getFundBizScene() {
		return this.fundBizScene;
	}
	public void setFundBizScene(String fundBizScene) {
		this.fundBizScene = fundBizScene;
	}

	public String getGroupAppId() {
		return this.groupAppId;
	}
	public void setGroupAppId(String groupAppId) {
		this.groupAppId = groupAppId;
	}

	public String getPcInviteUrlMode() {
		return this.pcInviteUrlMode;
	}
	public void setPcInviteUrlMode(String pcInviteUrlMode) {
		this.pcInviteUrlMode = pcInviteUrlMode;
	}

}
