package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑广告系统标的(券)
 *
 * @author auto create
 * @since 1.0, 2017-07-11 13:44:17
 */
public class KbAdvertSubjectVoucher extends AlipayObject {

	private static final long serialVersionUID = 5886188416952876459L;

	/**
	 * 品牌名称(支持模糊匹配)
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 适用城市(命中一个即可搜出)
	 */
	@ApiListField("city_ids")
	@ApiField("string")
	private List<String> cityIds;

	/**
	 * 商家名称(支持模糊匹配)
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * OBTAIN：认领（默认值）
BUY：购买
	 */
	@ApiField("purchase_mode")
	private String purchaseMode;

	/**
	 * 券ID
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称(支持模糊匹配)
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券类型
LIMIT-单品券
NO_LIMIT_DISCOUNT-全场折扣券
NO_LIMIT_CASH-全场代金券
	 */
	@ApiField("voucher_type")
	private String voucherType;

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

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getPurchaseMode() {
		return this.purchaseMode;
	}
	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
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

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
