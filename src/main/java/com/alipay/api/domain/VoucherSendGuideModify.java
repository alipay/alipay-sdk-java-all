package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券发放引导可修改信息
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:44:02
 */
public class VoucherSendGuideModify extends AlipayObject {

	private static final long serialVersionUID = 3622476927992136553L;

	/**
	 * 领（购）券详情页链接，从支付宝公域跳转到服务商（商户）自定义领(购)券详情页。说明：当 voucher_type=EXCHANGE_VOUCHER 时，该字段可修改，其他不允许修改。
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
