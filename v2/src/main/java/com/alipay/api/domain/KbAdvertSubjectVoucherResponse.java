package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统标的（券）
 *
 * @author auto create
 * @since 1.0, 2017-07-11 13:44:23
 */
public class KbAdvertSubjectVoucherResponse extends AlipayObject {

	private static final long serialVersionUID = 5596753356892365565L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 适用城市ID列表
	 */
	@ApiListField("city_ids")
	@ApiField("string")
	private List<String> cityIds;

	/**
	 * 背景图片
	 */
	@ApiField("cover")
	private String cover;

	/**
	 * 日库存
	 */
	@ApiField("daily_inventory")
	private String dailyInventory;

	/**
	 * 结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 上架时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * logo图片
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 使用须知
	 */
	@ApiListField("manuals")
	@ApiField("kbadvert_voucher_manual")
	private List<KbadvertVoucherManual> manuals;

	/**
	 * 商家名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户ID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * BUY：购买模式
OBTAIN：认领
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 门店ID列表
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/**
	 * 起步金额
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 总库存
	 */
	@ApiField("total_inventory")
	private String totalInventory;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 以元为单位
	 */
	@ApiField("voucher_org_value")
	private String voucherOrgValue;

	/**
	 * 券类型
LIMIT-单品券
NO_LIMIT_DISCOUNT-全场折扣券
NO_LIMIT_CASH-全场代金券
	 */
	@ApiField("voucher_type")
	private String voucherType;

	/**
	 * 券价值
	 */
	@ApiField("voucher_value")
	private String voucherValue;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<String> getCityIds() {
		return this.cityIds;
	}
	public void setCityIds(List<String> cityIds) {
		this.cityIds = cityIds;
	}

	public String getCover() {
		return this.cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getDailyInventory() {
		return this.dailyInventory;
	}
	public void setDailyInventory(String dailyInventory) {
		this.dailyInventory = dailyInventory;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public List<KbadvertVoucherManual> getManuals() {
		return this.manuals;
	}
	public void setManuals(List<KbadvertVoucherManual> manuals) {
		this.manuals = manuals;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPurchaseMode() {
		return this.purchaseMode;
	}
	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getTotalInventory() {
		return this.totalInventory;
	}
	public void setTotalInventory(String totalInventory) {
		this.totalInventory = totalInventory;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherOrgValue() {
		return this.voucherOrgValue;
	}
	public void setVoucherOrgValue(String voucherOrgValue) {
		this.voucherOrgValue = voucherOrgValue;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

	public String getVoucherValue() {
		return this.voucherValue;
	}
	public void setVoucherValue(String voucherValue) {
		this.voucherValue = voucherValue;
	}

}
