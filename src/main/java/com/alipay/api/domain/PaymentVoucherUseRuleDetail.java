package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付券核销规则
 *
 * @author auto create
 * @since 1.0, 2021-09-07 13:58:00
 */
public class PaymentVoucherUseRuleDetail extends AlipayObject {

	private static final long serialVersionUID = 1624331242736459398L;

	/**
	 * 固定面额满减券使用规则。 限制: 1、voucher_type为FIX_VOUCHER时必填
	 */
	@ApiField("fix_voucher")
	private PaymentFixVoucher fixVoucher;

	/**
	 * 核销跳转方式,默认CAN_USE(详情页展示可使用按钮) 枚举值: 
SCAN_CODE 跳转到支付宝付钱码 
SELF_LINK 跳转至商家指定页面 
CAN_USE 卡包券详情页显示可使用按钮
	 */
	@ApiField("use_mode")
	private String useMode;

	/**
	 * 核销跳转链接 限制: 1、只有use_mode为SELF_LINK时该值有效且必传。 2、核销跳转链接必须是支付宝小程序链接。
	 */
	@ApiField("use_url")
	private String useUrl;

	/**
	 * 每个支付宝账号的核销次数限制。 默认不限制
	 */
	@ApiField("voucher_quantity_limit_per_user")
	private Long voucherQuantityLimitPerUser;

	/**
	 * 核销次数限制周期配置。默认值LIFE_CYCLE表示限制每个支付宝账号在整个活动期间核销次数。 枚举值: DAY:每天 WEEK:每周 MONTH:每月 LIFE_CYCLE:整个活动
	 */
	@ApiField("voucher_quantity_limit_per_user_period_type")
	private String voucherQuantityLimitPerUserPeriodType;

	/**
	 * 允许指定券的特殊生效时间规则。
	 */
	@ApiField("voucher_valid_period")
	private PaymentVoucherValidPeriod voucherValidPeriod;

	public PaymentFixVoucher getFixVoucher() {
		return this.fixVoucher;
	}
	public void setFixVoucher(PaymentFixVoucher fixVoucher) {
		this.fixVoucher = fixVoucher;
	}

	public String getUseMode() {
		return this.useMode;
	}
	public void setUseMode(String useMode) {
		this.useMode = useMode;
	}

	public String getUseUrl() {
		return this.useUrl;
	}
	public void setUseUrl(String useUrl) {
		this.useUrl = useUrl;
	}

	public Long getVoucherQuantityLimitPerUser() {
		return this.voucherQuantityLimitPerUser;
	}
	public void setVoucherQuantityLimitPerUser(Long voucherQuantityLimitPerUser) {
		this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
	}

	public String getVoucherQuantityLimitPerUserPeriodType() {
		return this.voucherQuantityLimitPerUserPeriodType;
	}
	public void setVoucherQuantityLimitPerUserPeriodType(String voucherQuantityLimitPerUserPeriodType) {
		this.voucherQuantityLimitPerUserPeriodType = voucherQuantityLimitPerUserPeriodType;
	}

	public PaymentVoucherValidPeriod getVoucherValidPeriod() {
		return this.voucherValidPeriod;
	}
	public void setVoucherValidPeriod(PaymentVoucherValidPeriod voucherValidPeriod) {
		this.voucherValidPeriod = voucherValidPeriod;
	}

}
