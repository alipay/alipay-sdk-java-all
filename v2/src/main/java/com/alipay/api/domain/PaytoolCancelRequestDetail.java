package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 撤销工具列表
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:44:38
 */
public class PaytoolCancelRequestDetail extends AlipayObject {

	private static final long serialVersionUID = 7561494181865698372L;

	/**
	 * 支付宝支付工具单据号，与商户支付工具单据号不能同时为空。
	 */
	@ApiField("paytool_bill_no")
	private String paytoolBillNo;

	/**
	 * 商户外部支付工具单据号，与支付宝支付工具单据号不能同时为空
	 */
	@ApiField("paytool_request_no")
	private String paytoolRequestNo;

	public String getPaytoolBillNo() {
		return this.paytoolBillNo;
	}
	public void setPaytoolBillNo(String paytoolBillNo) {
		this.paytoolBillNo = paytoolBillNo;
	}

	public String getPaytoolRequestNo() {
		return this.paytoolRequestNo;
	}
	public void setPaytoolRequestNo(String paytoolRequestNo) {
		this.paytoolRequestNo = paytoolRequestNo;
	}

}
