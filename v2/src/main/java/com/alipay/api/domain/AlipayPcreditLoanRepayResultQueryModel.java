package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询还款结果
 *
 * @author auto create
 * @since 1.0, 2018-11-13 21:01:32
 */
public class AlipayPcreditLoanRepayResultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3779131217571778113L;

	/**
	 * 还款申请业务标准外部订单号，即商户端进行还款申请提交时所传入的商户端自己的订单号，必须保证与外部业务单号二者不能同时为空。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 还款受理单号，即还款申请提交接口返回的还款受理单号，必须保证与外部业务单号二者不能同时为空。
	 */
	@ApiField("repay_receipt_no")
	private String repayReceiptNo;

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRepayReceiptNo() {
		return this.repayReceiptNo;
	}
	public void setRepayReceiptNo(String repayReceiptNo) {
		this.repayReceiptNo = repayReceiptNo;
	}

}
