package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 零工卡获取保险推荐
 *
 * @author auto create
 * @since 1.0, 2024-11-15 10:28:22
 */
public class AlipayFundFlexiblestaffingInsureConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6249455472726528471L;

	/**
	 * 场景码，固定值
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 保险渠道固定值
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 企业信息
	 */
	@ApiField("merchant")
	private InsureCompany merchant;

	/**
	 * 合作商信息
	 */
	@ApiField("partner_organization")
	private InsurePartnerOrganization partnerOrganization;

	/**
	 * 产品码,固定值
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 投保场景，打卡模式固定值
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public InsureCompany getMerchant() {
		return this.merchant;
	}
	public void setMerchant(InsureCompany merchant) {
		this.merchant = merchant;
	}

	public InsurePartnerOrganization getPartnerOrganization() {
		return this.partnerOrganization;
	}
	public void setPartnerOrganization(InsurePartnerOrganization partnerOrganization) {
		this.partnerOrganization = partnerOrganization;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
