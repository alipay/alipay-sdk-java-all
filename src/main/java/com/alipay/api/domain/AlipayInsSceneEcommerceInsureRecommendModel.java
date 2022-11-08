package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商投保推荐接口
 *
 * @author auto create
 * @since 1.0, 2022-08-30 22:09:16
 */
public class AlipayInsSceneEcommerceInsureRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 6474864764875371888L;

	/**
	 * 授权token
	 */
	@ApiField("authorized_token")
	private String authorizedToken;

	/**
	 * 买家
	 */
	@ApiField("buyer")
	private EcomBuyerDTO buyer;

	/**
	 * 商品
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 订单
	 */
	@ApiField("order_dto")
	private EcomOrderDTO orderDto;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 场景码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	/**
	 * 客户端渠道:ios / android / pc / wx_applet(微信小程序)
	 */
	@ApiField("user_client")
	private String userClient;

	public String getAuthorizedToken() {
		return this.authorizedToken;
	}
	public void setAuthorizedToken(String authorizedToken) {
		this.authorizedToken = authorizedToken;
	}

	public EcomBuyerDTO getBuyer() {
		return this.buyer;
	}
	public void setBuyer(EcomBuyerDTO buyer) {
		this.buyer = buyer;
	}

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public EcomOrderDTO getOrderDto() {
		return this.orderDto;
	}
	public void setOrderDto(EcomOrderDTO orderDto) {
		this.orderDto = orderDto;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
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
