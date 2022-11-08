package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放方式
 *
 * @author auto create
 * @since 1.0, 2022-09-27 13:22:21
 */
public class VoucherSendModeInfo extends AlipayObject {

	private static final long serialVersionUID = 7835285167615743999L;

	/**
	 * 券包信息。
	 */
	@ApiField("voucher_package_mode_info")
	private VoucherPackageModeInfo voucherPackageModeInfo;

	/**
	 * 券售卖信息。
	 */
	@ApiField("voucher_sale_mode_info")
	private VoucherSaleModeInfo voucherSaleModeInfo;

	/**
	 * 券发放模式。
	 */
	@ApiField("voucher_send_mode")
	private String voucherSendMode;

	/**
	 * 券发放规则。
	 */
	@ApiField("voucher_send_rule_info")
	private VoucherSendRuleInfo voucherSendRuleInfo;

	public VoucherPackageModeInfo getVoucherPackageModeInfo() {
		return this.voucherPackageModeInfo;
	}
	public void setVoucherPackageModeInfo(VoucherPackageModeInfo voucherPackageModeInfo) {
		this.voucherPackageModeInfo = voucherPackageModeInfo;
	}

	public VoucherSaleModeInfo getVoucherSaleModeInfo() {
		return this.voucherSaleModeInfo;
	}
	public void setVoucherSaleModeInfo(VoucherSaleModeInfo voucherSaleModeInfo) {
		this.voucherSaleModeInfo = voucherSaleModeInfo;
	}

	public String getVoucherSendMode() {
		return this.voucherSendMode;
	}
	public void setVoucherSendMode(String voucherSendMode) {
		this.voucherSendMode = voucherSendMode;
	}

	public VoucherSendRuleInfo getVoucherSendRuleInfo() {
		return this.voucherSendRuleInfo;
	}
	public void setVoucherSendRuleInfo(VoucherSendRuleInfo voucherSendRuleInfo) {
		this.voucherSendRuleInfo = voucherSendRuleInfo;
	}

}
