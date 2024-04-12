package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电商单产品方案出单
 *
 * @author auto create
 * @since 1.0, 2024-04-08 14:32:51
 */
public class AlipayInsSceneEcommerceSingleissueApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8321485542558122187L;

	/**
	 * 买家
	 */
	@ApiField("buyer")
	private EcomBuyerDTO buyer;

	/**
	 * 触发出单事件类型
ECOM_SHIPPED_DONE  发货
ECOM_BUYER_CONFIRM  确认收货
	 */
	@ApiField("event_type")
	private String eventType;

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
	 * 产品方案id
	 */
	@ApiField("product_plan_id")
	private String productPlanId;

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
	 * 客户端渠道，ios / android / pc / wx_applet / alipay_applet
	 */
	@ApiField("user_client")
	private String userClient;

	public EcomBuyerDTO getBuyer() {
		return this.buyer;
	}
	public void setBuyer(EcomBuyerDTO buyer) {
		this.buyer = buyer;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
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

	public String getProductPlanId() {
		return this.productPlanId;
	}
	public void setProductPlanId(String productPlanId) {
		this.productPlanId = productPlanId;
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
