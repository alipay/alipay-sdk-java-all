package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询合同信息
 *
 * @author auto create
 * @since 1.0, 2018-11-14 11:51:02
 */
public class AlipayPcreditLoanContractInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8616658561986182485L;

	/**
	 * 贷款申请受理单号，与外部业务单号二者不能同时为空
	 */
	@ApiField("apply_receipt_no")
	private String applyReceiptNo;

	/**
	 * 签署合同类型，取值{LOAN}：LOAN-贷款合同;
	 */
	@ApiField("contract_type")
	private String contractType;

	/**
	 * 外部业务单号，与贷款申请受理单号二者不能同时为空
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 代表了一次请求，作为业务幂等性控制
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public String getApplyReceiptNo() {
		return this.applyReceiptNo;
	}
	public void setApplyReceiptNo(String applyReceiptNo) {
		this.applyReceiptNo = applyReceiptNo;
	}

	public String getContractType() {
		return this.contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

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

}
