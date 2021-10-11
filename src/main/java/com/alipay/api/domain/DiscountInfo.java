package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告投放优惠模型
 *
 * @author auto create
 * @since 1.0, 2018-09-14 13:54:41
 */
public class DiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 1494712597789985698L;

	/**
	 * 全场代金的使用门槛
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
	 * 优惠说明信息
	 */
	@ApiListField("discount_notes")
	@ApiField("voucher_desc_detail_model")
	private List<VoucherDescDetailModel> discountNotes;

	/**
	 * 最近店铺离当前用户的距离
	 */
	@ApiField("distance")
	private String distance;

	/**
	 * 优惠券停止发放的时间，和发放的优惠券的有效期不同
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 优惠券的logo图片地址
	 */
	@ApiField("image_url")
	private String imageUrl;

	/**
	 * 优惠id，调用发券接口时，需要提供“优惠id”
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 优惠券的名称
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
	 * 满减券的券面额，当每满减券(vol_type=mei_man_jian)时有效
每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("per_price")
	private String perPrice;

	/**
	 * 发券商户ID
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 当券类型是全场及单品代金券的时候，这个字段代表券面额；
当券类型是减至券的时候，这个字段代表减至到的金额
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
	 * 离用户经纬度最近的优惠券适用门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 优惠券的主店铺名
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 优惠券的已领数
	 */
	@ApiField("sold")
	private String sold;

	/**
	 * 优惠券发放的开始时间，和发放的优惠券的有效期不同
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 满减券门槛，当每满减券时有效（vol_type=mei_man_jian)
每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("threshold_price")
	private String thresholdPrice;

	/**
	 * 封顶金额，当每满减券(vol_type=mei_man_jian)时有效。每满减用的字段：每满thresholdPrice元减perPrice元，封顶topPrice元
	 */
	@ApiField("top_price")
	private String topPrice;

	/**
	 * 优惠券类型
discount:折扣券;
cash:代金券;
exchange:兑换券;
limit_reduce_cash:减至券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券相对有效期，券自领取或者购买起多长时间内有效，取值范围 7-360，单位天
	 */
	@ApiField("validity_period")
	private String validityPeriod;

	/**
	 * 核销绝对有效期开始时间。自该时间点起，券可被核销。
注意：券的开始发放时段开始时间（gmt_start）不能晚于该时间。
	 */
	@ApiField("validity_period_range_from")
	private String validityPeriodRangeFrom;

	/**
	 * 核销绝对有效期结束时间。自该时间点起，券无法继续被核销。
	 */
	@ApiField("validity_period_range_to")
	private String validityPeriodRangeTo;

	/**
	 * 有效期类型。支持相对有效期及绝对有效期两种方式，
RELATIVE:相对有效期
FIXED:绝对有效期
相对有效期指领取或者自购买之日起XX天有效，绝对有效期指某一端固定时间内有效。
	 */
	@ApiField("validity_period_type")
	private String validityPeriodType;

	/**
	 * 优惠券二级类型，
all_discount:全场折扣;
single_discount:单品折扣;
all_cash:全场代金;
single_cash：单品代金
mei_man_jian：每满减券
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

	public List<VoucherDescDetailModel> getDiscountNotes() {
		return this.discountNotes;
	}
	public void setDiscountNotes(List<VoucherDescDetailModel> discountNotes) {
		this.discountNotes = discountNotes;
	}

	public String getDistance() {
		return this.distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
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

	public String getValidityPeriod() {
		return this.validityPeriod;
	}
	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public String getValidityPeriodRangeFrom() {
		return this.validityPeriodRangeFrom;
	}
	public void setValidityPeriodRangeFrom(String validityPeriodRangeFrom) {
		this.validityPeriodRangeFrom = validityPeriodRangeFrom;
	}

	public String getValidityPeriodRangeTo() {
		return this.validityPeriodRangeTo;
	}
	public void setValidityPeriodRangeTo(String validityPeriodRangeTo) {
		this.validityPeriodRangeTo = validityPeriodRangeTo;
	}

	public String getValidityPeriodType() {
		return this.validityPeriodType;
	}
	public void setValidityPeriodType(String validityPeriodType) {
		this.validityPeriodType = validityPeriodType;
	}

	public String getVolType() {
		return this.volType;
	}
	public void setVolType(String volType) {
		this.volType = volType;
	}

}
