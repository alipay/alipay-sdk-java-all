package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-19 10:57:45
 */
public class BizGrantPlan extends AlipayObject {

	private static final long serialVersionUID = 6417144318726725765L;

	/**
	 * 商户品牌链接
	 */
	@ApiField("brand_logo")
	private String brandLogo;

	/**
	 * 商户品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 发放时间
	 */
	@ApiField("grant_time")
	private Date grantTime;

	/**
	 * 发放主体
	 */
	@ApiField("issuer_type")
	private String issuerType;

	/**
	 * 优惠类型
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 联合权益描述
	 */
	@ApiField("rights_desc")
	private String rightsDesc;

	/**
	 * 券张数
	 */
	@ApiField("voucher_count")
	private Long voucherCount;

	/**
	 * 券使用链接
	 */
	@ApiField("voucher_link_url")
	private String voucherLinkUrl;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券状态
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	/**
	 * 券单位
	 */
	@ApiField("voucher_unit")
	private String voucherUnit;

	/**
	 * 券面值 优惠类型=折扣券(DISCOUNT_VOUCHER)时,券面值=折扣,如:0,88; 优惠类型=满减券(FIX_VOUCHER)时,券面值=券金额,如0.5,单位:元; 优惠类型=立减券(REDUCTION_VOUCHER)时,券面值=券金额,如0.8,单位:元; 优惠类型=减至券(REDUCTION_TO_VOUCHER),券面值=减至金额,如99.01,单位:元 优惠类型=特价券(SPECIAL_VOUCHER),券面值=特价金额,如669,单位:元
	 */
	@ApiField("voucher_value")
	private String voucherValue;

	public String getBrandLogo() {
		return this.brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Date getGrantTime() {
		return this.grantTime;
	}
	public void setGrantTime(Date grantTime) {
		this.grantTime = grantTime;
	}

	public String getIssuerType() {
		return this.issuerType;
	}
	public void setIssuerType(String issuerType) {
		this.issuerType = issuerType;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getRightsDesc() {
		return this.rightsDesc;
	}
	public void setRightsDesc(String rightsDesc) {
		this.rightsDesc = rightsDesc;
	}

	public Long getVoucherCount() {
		return this.voucherCount;
	}
	public void setVoucherCount(Long voucherCount) {
		this.voucherCount = voucherCount;
	}

	public String getVoucherLinkUrl() {
		return this.voucherLinkUrl;
	}
	public void setVoucherLinkUrl(String voucherLinkUrl) {
		this.voucherLinkUrl = voucherLinkUrl;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

	public String getVoucherUnit() {
		return this.voucherUnit;
	}
	public void setVoucherUnit(String voucherUnit) {
		this.voucherUnit = voucherUnit;
	}

	public String getVoucherValue() {
		return this.voucherValue;
	}
	public void setVoucherValue(String voucherValue) {
		this.voucherValue = voucherValue;
	}

}
