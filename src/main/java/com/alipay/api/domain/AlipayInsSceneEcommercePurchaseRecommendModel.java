package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台场景对接准入
 *
 * @author auto create
 * @since 1.0, 2022-08-29 10:51:37
 */
public class AlipayInsSceneEcommercePurchaseRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 4587849368373428597L;

	/**
	 * 授权token
	 */
	@ApiField("authorized_token")
	private String authorizedToken;

	/**
	 * 商品:订购主体为商品时必传
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 订购主体类型:PURCHASE_USER 订购人, ECOM_ITEM  商品
	 */
	@ApiField("related_subject_type")
	private String relatedSubjectType;

	/**
	 * 场景code
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	/**
	 * 客户端渠道:ios,andriod,pc,wechat_applet
	 */
	@ApiField("user_client")
	private String userClient;

	public String getAuthorizedToken() {
		return this.authorizedToken;
	}
	public void setAuthorizedToken(String authorizedToken) {
		this.authorizedToken = authorizedToken;
	}

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getRelatedSubjectType() {
		return this.relatedSubjectType;
	}
	public void setRelatedSubjectType(String relatedSubjectType) {
		this.relatedSubjectType = relatedSubjectType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

	public String getUserClient() {
		return this.userClient;
	}
	public void setUserClient(String userClient) {
		this.userClient = userClient;
	}

}
