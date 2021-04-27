package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商城券的推荐
 *
 * @author auto create
 * @since 1.0, 2017-08-15 19:53:06
 */
public class VoucherRec extends AlipayObject {

	private static final long serialVersionUID = 6362568855331476646L;

	/**
	 * 总收藏量
	 */
	@ApiField("all_keep_count")
	private String allKeepCount;

	/**
	 * 判断券的类型
	 */
	@ApiField("code")
	private String code;

	/**
	 * 头图
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 人群
	 */
	@ApiField("crowds")
	private String crowds;

	/**
	 * 折扣券的折扣力度
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 是否有面向人群
	 */
	@ApiField("has_crowd")
	private String hasCrowd;

	/**
	 * 是否自动领取券
	 */
	@ApiField("is_auto_obtain")
	private String isAutoObtain;

	/**
	 * 是否是商圈发的券
	 */
	@ApiField("is_mall_voucher")
	private String isMallVoucher;

	/**
	 * 券品牌名称
	 */
	@ApiField("item_brand_name")
	private String itemBrandName;

	/**
	 * 券有效期结束时间
	 */
	@ApiField("item_gmt_end")
	private String itemGmtEnd;

	/**
	 * 券有效期开始时间
	 */
	@ApiField("item_gmt_start")
	private String itemGmtStart;

	/**
	 * 券id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 券名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 总量
	 */
	@ApiField("item_quantity")
	private String itemQuantity;

	/**
	 * 销售模式
	 */
	@ApiField("item_sales_mode")
	private String itemSalesMode;

	/**
	 * 销量
	 */
	@ApiField("item_sold_quantity")
	private String itemSoldQuantity;

	/**
	 * 原价
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/**
	 * 每满threshold_amount元减perValueAmount元，封顶valueAmount元
	 */
	@ApiField("per_value_amount")
	private String perValueAmount;

	/**
	 * 泛行业商品详情图片
	 */
	@ApiField("picture_details")
	private String pictureDetails;

	/**
	 * 价格浮动模式
	 */
	@ApiField("price_mode")
	private String priceMode;

	/**
	 * 券领取类型
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 送单品名称
	 */
	@ApiField("send_item_name")
	private String sendItemName;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 店铺名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 满N元可优惠
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 使用门槛
	 */
	@ApiField("use_condition_amount")
	private String useConditionAmount;

	/**
	 * 券使用的有效时间
	 */
	@ApiField("valid_times")
	private String validTimes;

	/**
	 * 金额
	 */
	@ApiField("value_amount")
	private String valueAmount;

	/**
	 * 券的跳转地址
	 */
	@ApiField("voucher_detail_url")
	private String voucherDetailUrl;

	/**
	 * 券地址
	 */
	@ApiField("voucher_logo_url")
	private String voucherLogoUrl;

	/**
	 * DISCOUNT_ALL 折扣券(全场) 
DISCOUNT_SINGLE 折扣券(单品) 
CASH_ALL 代金券(全场) 
CASH_SINGLE 金券(单品) 
 
以下券全部是单品券： 
EXCHANGE 兑换券(直接兑换, 加钱兑换) EXCHANGE_BUY 换购券 
REDUCE_TO 减至券 
BUY_SEND_SAME 买就送券(买a送a) 
BUY_SEND_OTHER 买就送券(买a送b)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getAllKeepCount() {
		return this.allKeepCount;
	}
	public void setAllKeepCount(String allKeepCount) {
		this.allKeepCount = allKeepCount;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getCrowds() {
		return this.crowds;
	}
	public void setCrowds(String crowds) {
		this.crowds = crowds;
	}

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getHasCrowd() {
		return this.hasCrowd;
	}
	public void setHasCrowd(String hasCrowd) {
		this.hasCrowd = hasCrowd;
	}

	public String getIsAutoObtain() {
		return this.isAutoObtain;
	}
	public void setIsAutoObtain(String isAutoObtain) {
		this.isAutoObtain = isAutoObtain;
	}

	public String getIsMallVoucher() {
		return this.isMallVoucher;
	}
	public void setIsMallVoucher(String isMallVoucher) {
		this.isMallVoucher = isMallVoucher;
	}

	public String getItemBrandName() {
		return this.itemBrandName;
	}
	public void setItemBrandName(String itemBrandName) {
		this.itemBrandName = itemBrandName;
	}

	public String getItemGmtEnd() {
		return this.itemGmtEnd;
	}
	public void setItemGmtEnd(String itemGmtEnd) {
		this.itemGmtEnd = itemGmtEnd;
	}

	public String getItemGmtStart() {
		return this.itemGmtStart;
	}
	public void setItemGmtStart(String itemGmtStart) {
		this.itemGmtStart = itemGmtStart;
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

	public String getItemQuantity() {
		return this.itemQuantity;
	}
	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getItemSalesMode() {
		return this.itemSalesMode;
	}
	public void setItemSalesMode(String itemSalesMode) {
		this.itemSalesMode = itemSalesMode;
	}

	public String getItemSoldQuantity() {
		return this.itemSoldQuantity;
	}
	public void setItemSoldQuantity(String itemSoldQuantity) {
		this.itemSoldQuantity = itemSoldQuantity;
	}

	public String getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getPerValueAmount() {
		return this.perValueAmount;
	}
	public void setPerValueAmount(String perValueAmount) {
		this.perValueAmount = perValueAmount;
	}

	public String getPictureDetails() {
		return this.pictureDetails;
	}
	public void setPictureDetails(String pictureDetails) {
		this.pictureDetails = pictureDetails;
	}

	public String getPriceMode() {
		return this.priceMode;
	}
	public void setPriceMode(String priceMode) {
		this.priceMode = priceMode;
	}

	public String getPurchaseMode() {
		return this.purchaseMode;
	}
	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
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

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getUseConditionAmount() {
		return this.useConditionAmount;
	}
	public void setUseConditionAmount(String useConditionAmount) {
		this.useConditionAmount = useConditionAmount;
	}

	public String getValidTimes() {
		return this.validTimes;
	}
	public void setValidTimes(String validTimes) {
		this.validTimes = validTimes;
	}

	public String getValueAmount() {
		return this.valueAmount;
	}
	public void setValueAmount(String valueAmount) {
		this.valueAmount = valueAmount;
	}

	public String getVoucherDetailUrl() {
		return this.voucherDetailUrl;
	}
	public void setVoucherDetailUrl(String voucherDetailUrl) {
		this.voucherDetailUrl = voucherDetailUrl;
	}

	public String getVoucherLogoUrl() {
		return this.voucherLogoUrl;
	}
	public void setVoucherLogoUrl(String voucherLogoUrl) {
		this.voucherLogoUrl = voucherLogoUrl;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
