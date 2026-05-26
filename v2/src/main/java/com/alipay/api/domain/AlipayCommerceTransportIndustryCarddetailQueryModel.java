package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡详情查询
 *
 * @author auto create
 * @since 1.0, 2026-05-19 10:57:45
 */
public class AlipayCommerceTransportIndustryCarddetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5617728286553312259L;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 行业场景编码
	 */
	@ApiField("industry_scene")
	private String industryScene;

	/**
	 * 用户openId
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getIndustryScene() {
		return this.industryScene;
	}
	public void setIndustryScene(String industryScene) {
		this.industryScene = industryScene;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
