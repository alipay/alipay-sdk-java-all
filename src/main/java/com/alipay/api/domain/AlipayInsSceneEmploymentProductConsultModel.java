package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灵活用工产品列表咨询推荐
 *
 * @author auto create
 * @since 1.0, 2022-08-22 13:36:15
 */
public class AlipayInsSceneEmploymentProductConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7577817187887445748L;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 企业信息
	 */
	@ApiField("merchant")
	private InsCompany merchant;

	/**
	 * 保险合作商信息
	 */
	@ApiField("partner_organization")
	private InsPartnerOrganization partnerOrganization;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public InsCompany getMerchant() {
		return this.merchant;
	}
	public void setMerchant(InsCompany merchant) {
		this.merchant = merchant;
	}

	public InsPartnerOrganization getPartnerOrganization() {
		return this.partnerOrganization;
	}
	public void setPartnerOrganization(InsPartnerOrganization partnerOrganization) {
		this.partnerOrganization = partnerOrganization;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
