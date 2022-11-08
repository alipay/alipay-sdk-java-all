package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放引导
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:43:57
 */
public class VoucherSendGuide extends AlipayObject {

	private static final long serialVersionUID = 6615472287538414837L;

	/**
	 * 领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。
	 */
	@ApiField("voucher_detail_url")
	private String voucherDetailUrl;

	public String getVoucherDetailUrl() {
		return this.voucherDetailUrl;
	}
	public void setVoucherDetailUrl(String voucherDetailUrl) {
		this.voucherDetailUrl = voucherDetailUrl;
	}

}
