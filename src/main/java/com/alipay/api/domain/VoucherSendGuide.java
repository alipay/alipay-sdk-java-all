package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放引导
 *
 * @author auto create
 * @since 1.0, 2022-04-08 21:48:28
 */
public class VoucherSendGuide extends AlipayObject {

	private static final long serialVersionUID = 5321473653652717888L;

	/**
	 * 领(购)券详情页链接，从支付宝公域跳转到服务商(商户)自定义领(购)券详情页。

说明：
当voucher_type=EXCHANGE_VOUCHER时，该字段必须填写。
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
