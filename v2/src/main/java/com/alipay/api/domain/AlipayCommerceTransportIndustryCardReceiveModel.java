package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开卡受理请求
 *
 * @author auto create
 * @since 1.0, 2026-05-19 11:02:50
 */
public class AlipayCommerceTransportIndustryCardReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 2481613328546421855L;

	/**
	 * 卡模板code
	 */
	@ApiField("card_template_code")
	private String cardTemplateCode;

	/**
	 * 行业场景编码
	 */
	@ApiField("industry_scene")
	private String industryScene;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 开卡方式
	 */
	@ApiField("open_type")
	private String openType;

	/**
	 * 业务幂等号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 合作方编码
	 */
	@ApiField("partner_code")
	private String partnerCode;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardTemplateCode() {
		return this.cardTemplateCode;
	}
	public void setCardTemplateCode(String cardTemplateCode) {
		this.cardTemplateCode = cardTemplateCode;
	}

	public String getIndustryScene() {
		return this.industryScene;
	}
	public void setIndustryScene(String industryScene) {
		this.industryScene = industryScene;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOpenType() {
		return this.openType;
	}
	public void setOpenType(String openType) {
		this.openType = openType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPartnerCode() {
		return this.partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
