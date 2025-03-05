package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 引导详情
 *
 * @author auto create
 * @since 1.0, 2023-10-26 20:36:05
 */
public class VoucherCustomerGuideInfo extends AlipayObject {

	private static final long serialVersionUID = 5199994933946747212L;

	/**
	 * 券发放引导
	 */
	@ApiField("voucher_send_guide_info")
	private VoucherSendGuideInfo voucherSendGuideInfo;

	/**
	 * 券核销详情
	 */
	@ApiField("voucher_use_guide_info")
	private VoucherUseGuideInfo voucherUseGuideInfo;

	public VoucherSendGuideInfo getVoucherSendGuideInfo() {
		return this.voucherSendGuideInfo;
	}
	public void setVoucherSendGuideInfo(VoucherSendGuideInfo voucherSendGuideInfo) {
		this.voucherSendGuideInfo = voucherSendGuideInfo;
	}

	public VoucherUseGuideInfo getVoucherUseGuideInfo() {
		return this.voucherUseGuideInfo;
	}
	public void setVoucherUseGuideInfo(VoucherUseGuideInfo voucherUseGuideInfo) {
		this.voucherUseGuideInfo = voucherUseGuideInfo;
	}

}
