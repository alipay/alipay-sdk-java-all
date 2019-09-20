package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * antlbs输出的口碑优惠券
 *
 * @author auto create
 * @since 1.0, 2017-11-03 16:59:45
 */
public class AntlbsKBDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 4549385787796552437L;

	/**
	 * 全场代金的门槛金额
	 */
	@ApiField("apply_condition")
	private String applyCondition;

	/**
	 * 买M送N的描述
	 */
	@ApiField("buy_send_desc")
	private String buySendDesc;

	/**
	 * 折扣率
仅当券类型为折扣券时有效
有效折扣率取值范围0.11-0.99
仅允许保留小数点后两位
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 最近店铺离当前用户的距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 优惠结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 券的图片地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 优惠id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 券的名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品的一些标签
	 */
	@ApiField("label")
	private String label;

	/**
	 * 减至券的原价
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("per_price")
	private String perPrice;

	/**
	 * 当券类型是代金券的时候，这个字段代表实际金额；当券类型是减至券的时候，这个字段代表减至到的金额
	 */
	@ApiField("price")
	private String price;

	/**
	 * 券推荐语
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 买A送B中，B的描述
	 */
	@ApiField("send_item_name")
	private String sendItemName;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 券的店铺名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 已领数
	 */
	@ApiField("sold")
	private String sold;

	/**
	 * 优惠开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("threshold_price")
	private String thresholdPrice;

	/**
	 * 每满减用的字段：每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("top_price")
	private String topPrice;

	/**
	 * 目前有discount:折扣券;cash:代金券;exchange:兑换券;limit_reduce_cash:减至券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券二级类型。all_discount:全场折扣;single_discount:单品折扣;all_cash:全场代金;single_cash：单品代金
	 */
	@ApiField("vol_type")
	private String volType;

	public String getApplyCondition() {
		return this.applyCondition;
	}
	public void setApplyCondition(String applyCondition) {
		this.applyCondition = applyCondition;
	}

	public String getBuySendDesc() {
		return this.buySendDesc;
	}
	public void setBuySendDesc(String buySendDesc) {
		this.buySendDesc = buySendDesc;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPerPrice() {
		return this.perPrice;
	}
	public void setPerPrice(String perPrice) {
		this.perPrice = perPrice;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSendItemName() {
		return this.sendItemName;
	}
	public void setSendItemName(String sendItemName) {
		this.sendItemName = sendItemName;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getSold() {
		return this.sold;
	}
	public void setSold(String sold) {
		this.sold = sold;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getThresholdPrice() {
		return this.thresholdPrice;
	}
	public void setThresholdPrice(String thresholdPrice) {
		this.thresholdPrice = thresholdPrice;
	}

	public String getTopPrice() {
		return this.topPrice;
	}
	public void setTopPrice(String topPrice) {
		this.topPrice = topPrice;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getVolType() {
		return this.volType;
	}
	public void setVolType(String volType) {
		this.volType = volType;
	}

}
