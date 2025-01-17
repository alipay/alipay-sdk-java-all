package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 宠物保险投保
 *
 * @author auto create
 * @since 1.0, 2024-09-03 20:18:51
 */
public class AlipayCommercePetinsureEffectModel extends AlipayObject {

	private static final long serialVersionUID = 6691977592352677334L;

	/**
	 * 外部业务单号，每一笔新的投保请求应该保持唯一。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 买家用户Id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 买家openId
	 */
	@ApiField("buyer_open_id")
	private String buyerOpenId;

	/**
	 * 宠物售价，单位分
	 */
	@ApiField("item_sale_price")
	private Long itemSalePrice;

	/**
	 * 支付宝宠物Id
	 */
	@ApiField("pet_id")
	private String petId;

	/**
	 * 报价流水Id
	 */
	@ApiField("quote_id")
	private String quoteId;

	/**
	 * 推荐流水Id
	 */
	@ApiField("recommend_flow_id")
	private String recommendFlowId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerOpenId() {
		return this.buyerOpenId;
	}
	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public Long getItemSalePrice() {
		return this.itemSalePrice;
	}
	public void setItemSalePrice(Long itemSalePrice) {
		this.itemSalePrice = itemSalePrice;
	}

	public String getPetId() {
		return this.petId;
	}
	public void setPetId(String petId) {
		this.petId = petId;
	}

	public String getQuoteId() {
		return this.quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	public String getRecommendFlowId() {
		return this.recommendFlowId;
	}
	public void setRecommendFlowId(String recommendFlowId) {
		this.recommendFlowId = recommendFlowId;
	}

}
