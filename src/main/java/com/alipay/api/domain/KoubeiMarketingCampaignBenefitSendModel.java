package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑权益发放接口
 *
 * @author auto create
 * @since 1.0, 2018-06-12 20:04:26
 */
public class KoubeiMarketingCampaignBenefitSendModel extends AlipayObject {

	private static final long serialVersionUID = 5887349249861329421L;

	/**
	 * 领券渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 优惠类型，CAMPAIGN：活动，ITEM：商品
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 触发权益的优惠id，当discount_type是ITEM的时候这个内容是商品id，当discount_type是CAMPAIGN的时候这个内容是活动id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 外部流水号，用于控制幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 领券的门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
