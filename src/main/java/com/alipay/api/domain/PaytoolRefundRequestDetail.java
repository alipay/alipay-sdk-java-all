package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付工具退款请求明细
 *
 * @author auto create
 * @since 1.0, 2019-08-17 17:44:44
 */
public class PaytoolRefundRequestDetail extends AlipayObject {

	private static final long serialVersionUID = 5868639111753614529L;

	/**
	 * 支付宝支付工具单据号，和商户支付工具单据号不能同时为空。
	 */
	@ApiField("paytool_bill_no")
	private String paytoolBillNo;

	/**
	 * 商户外部支付工具单据号。和支付宝支付工具单据号不能同时为空。
	 */
	@ApiField("paytool_request_no")
	private String paytoolRequestNo;

	/**
	 * 退款支付工具金额。单位为元，精确到小数点后两位，取值范围[0.01,100000000]。注：退款金额不可大于支付金额
	 */
	@ApiField("refund_amount")
	private String refundAmount;

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

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

}
