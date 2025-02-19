package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * sku优惠信息
 *
 * @author auto create
 * @since 1.0, 2024-07-03 14:36:00
 */
public class PromoItemConsultDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4328294696677253745L;

	/**
	 * 是否可购买
	 */
	@ApiField("buy_restrict")
	private Boolean buyRestrict;

	/**
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识，后续与平台交互，需要使用该 ID，建议持久化.
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商家侧商品ID，是商户侧商品的唯一标识，由商家自定义，要求 APPID 下全局唯一。
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 外部skuid
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 优惠金额，单位 元
	 */
	@ApiField("promo_amount")
	private String promoAmount;

	/**
	 * 商品优惠子类型包括：
MEMBER_POINTS：会员积分价
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * MEMBER_POINT_INSUFFICIENT：用户会员积分余额不足；NOT_ALIPAY_MEMBER：非会员用户；RPC_SERVICE_ERROR：会员调用失败、超时、会员返回接口异常；MEMBER_ASSERT_UNAVAILABLE：会员优惠不可用-兜底异常（会员风控等）
	 */
	@ApiField("restrict_code")
	private String restrictCode;

	/**
	 * 不可购买原因
	 */
	@ApiField("restrict_reason")
	private String restrictReason;

	/**
	 * 商品优惠类型包括：
ANT_MEMBER : 会员积分
CONSUME_GOLD：消费金
	 */
	@ApiField("sale_promo_type")
	private String salePromoType;

	/**
	 * 单商品单件需要消耗的积分数
	 */
	@ApiField("single_consume")
	private String singleConsume;

	/**
	 * 平台skuid
	 */
	@ApiField("sku_id")
	private String skuId;

	public Boolean getBuyRestrict() {
		return this.buyRestrict;
	}
	public void setBuyRestrict(Boolean buyRestrict) {
		this.buyRestrict = buyRestrict;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getPromoAmount() {
		return this.promoAmount;
	}
	public void setPromoAmount(String promoAmount) {
		this.promoAmount = promoAmount;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getRestrictCode() {
		return this.restrictCode;
	}
	public void setRestrictCode(String restrictCode) {
		this.restrictCode = restrictCode;
	}

	public String getRestrictReason() {
		return this.restrictReason;
	}
	public void setRestrictReason(String restrictReason) {
		this.restrictReason = restrictReason;
	}

	public String getSalePromoType() {
		return this.salePromoType;
	}
	public void setSalePromoType(String salePromoType) {
		this.salePromoType = salePromoType;
	}

	public String getSingleConsume() {
		return this.singleConsume;
	}
	public void setSingleConsume(String singleConsume) {
		this.singleConsume = singleConsume;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
