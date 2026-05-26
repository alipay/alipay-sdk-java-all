package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手售卖先享预咨询
 *
 * @author auto create
 * @since 1.0, 2026-04-27 17:22:45
 */
public class AlipayCommerceResaleZmxyConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1114737596538715475L;

	/**
	 * 商品信息
	 */
	@ApiField("item_info_list")
	private ResaleOrderItemVO itemInfoList;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 订单金额，单位元，用于风控评估
	 */
	@ApiField("order_amount")
	private String orderAmount;

	/**
	 * 3C数码：DIGITAL
卡券：VOUCHER
	 */
	@ApiField("service_category")
	private String serviceCategory;

	/**
	 * 通过checkBeforeOrder获取
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public ResaleOrderItemVO getItemInfoList() {
		return this.itemInfoList;
	}
	public void setItemInfoList(ResaleOrderItemVO itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderAmount() {
		return this.orderAmount;
	}
	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getServiceCategory() {
		return this.serviceCategory;
	}
	public void setServiceCategory(String serviceCategory) {
		this.serviceCategory = serviceCategory;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
