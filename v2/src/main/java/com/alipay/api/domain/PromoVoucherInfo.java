package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 店铺券信息
 *
 * @author auto create
 * @since 1.0, 2017-06-20 15:01:09
 */
public class PromoVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 5564828747644111352L;

	/**
	 * 折扣（折扣券类型才有）
	 */
	@ApiField("discount")
	private String discount;

	/**
	 * 是否是自动领取券
	 */
	@ApiField("is_auto_obtain")
	private String isAutoObtain;

	/**
	 * 是否是商圈发的券 true/false
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
	private Date itemGmtEnd;

	/**
	 * 商品有效期开始时间
	 */
	@ApiField("item_gmt_start")
	private Date itemGmtStart;

	/**
	 * 商品id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 券图片地址
	 */
	@ApiField("item_logo")
	private String itemLogo;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 买a送b 送单品名称
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
	 * 券使用门槛金额(元)
	 */
	@ApiField("use_condition_amount")
	private String useConditionAmount;

	/**
	 * 代金券 减至券 兑换券 换购券 金额
	 */
	@ApiField("value_amount")
	private String valueAmount;

	/**
	 * 券跳转地址(h5)
	 */
	@ApiField("voucher_detail_url")
	private String voucherDetailUrl;

	/**
	 * DISCOUNT_ALL, // 折扣券(全场)
DISCOUNT_SINGLE, // 折扣券(单品)
CASH_ALL, // 代金券(全场)
CASH_SINGLE, // 代金券(单品)

// 以下券全部是单品券
EXCHANGE, // 兑换券(直接兑换，加钱兑换)
EXCHANGE_BUY, // 换购券
REDUCE_TO, // 减至券
BUY_SEND_SAME, // 买就送券(买a送a)
BUY_SEND_OTHER; // 买就送券(买a送b)
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public String getDiscount() {
		return this.discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
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

	public Date getItemGmtEnd() {
		return this.itemGmtEnd;
	}
	public void setItemGmtEnd(Date itemGmtEnd) {
		this.itemGmtEnd = itemGmtEnd;
	}

	public Date getItemGmtStart() {
		return this.itemGmtStart;
	}
	public void setItemGmtStart(Date itemGmtStart) {
		this.itemGmtStart = itemGmtStart;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemLogo() {
		return this.itemLogo;
	}
	public void setItemLogo(String itemLogo) {
		this.itemLogo = itemLogo;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public String getUseConditionAmount() {
		return this.useConditionAmount;
	}
	public void setUseConditionAmount(String useConditionAmount) {
		this.useConditionAmount = useConditionAmount;
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

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
