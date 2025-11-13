package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 离境退税查询
 *
 * @author auto create
 * @since 1.0, 2025-08-11 11:31:21
 */
public class AlipayUserTaxRefundQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7462532867386836982L;

	/**
	 * 二维码值
	 */
	@ApiField("qr_code")
	private String qrCode;

	/**
	 * 退税申请单号
	 */
	@ApiField("refund_biz_no")
	private String refundBizNo;

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getRefundBizNo() {
		return this.refundBizNo;
	}
	public void setRefundBizNo(String refundBizNo) {
		this.refundBizNo = refundBizNo;
	}

}
