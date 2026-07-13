package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-27 16:54:56
 */
public class BizVoucherConsultInfo extends AlipayObject {

	private static final long serialVersionUID = 7849175471956362954L;

	/**
	 * 券生效时间
	 */
	@ApiField("active_time")
	private Date activeTime;

	/**
	 * 业务logo
	 */
	@ApiField("biz_logo")
	private String bizLogo;

	/**
	 * 券过期时间
	 */
	@ApiField("expire_time")
	private Date expireTime;

	/**
	 * 是否最优
	 */
	@ApiField("optimal")
	private Boolean optimal;

	/**
	 * 优惠文档
	 */
	@ApiField("promo_text")
	private String promoText;

	/**
	 * 券优惠类型
	 */
	@ApiField("promo_type")
	private String promoType;

	/**
	 * 券使用门槛文案
	 */
	@ApiField("use_threshold_text")
	private String useThresholdText;

	/**
	 * 券实例id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券查看跳转链接
	 */
	@ApiField("voucher_link_url")
	private String voucherLinkUrl;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券面值
优惠类型=折扣券(DISCOUNT_VOUCHER)时,券面值=折扣,如:0,88;
优惠类型=满减券(FIX_VOUCHER)时,券面值=券金额,如0.5,单位:元;
优惠类型=立减券(REDUCTION_VOUCHER)时,券面值=券金额,如0.8,单位:元;
优惠类型=减至券(REDUCTION_TO_VOUCHER),券面值=减至金额,如99.01,单位:元
优惠类型=特价券(SPECIAL_VOUCHER),券面值=特价金额,如669,单位:元
	 */
	@ApiField("voucher_value")
	private String voucherValue;

	public Date getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public String getBizLogo() {
		return this.bizLogo;
	}
	public void setBizLogo(String bizLogo) {
		this.bizLogo = bizLogo;
	}

	public Date getExpireTime() {
		return this.expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Boolean getOptimal() {
		return this.optimal;
	}
	public void setOptimal(Boolean optimal) {
		this.optimal = optimal;
	}

	public String getPromoText() {
		return this.promoText;
	}
	public void setPromoText(String promoText) {
		this.promoText = promoText;
	}

	public String getPromoType() {
		return this.promoType;
	}
	public void setPromoType(String promoType) {
		this.promoType = promoType;
	}

	public String getUseThresholdText() {
		return this.useThresholdText;
	}
	public void setUseThresholdText(String useThresholdText) {
		this.useThresholdText = useThresholdText;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
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

	public String getVoucherValue() {
		return this.voucherValue;
	}
	public void setVoucherValue(String voucherValue) {
		this.voucherValue = voucherValue;
	}

}
