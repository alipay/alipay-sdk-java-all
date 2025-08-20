package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 提交代客还款(账单模型)
 *
 * @author auto create
 * @since 1.0, 2025-06-17 14:29:38
 */
public class MybankCreditLoantradeBillRepayCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6165172526649718882L;

	/**
	 * 账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 账单还款请求详情
	 */
	@ApiField("bill_repay_request")
	private BillRepayRequest billRepayRequest;

	/**
	 * 外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 必填，网商结算户的卡号外标
	 */
	@ApiField("pay_card_no")
	private String payCardNo;

	/**
	 * 方案合约编号
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 用户信息
	 */
	@ApiField("user")
	private UserVo user;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public BillRepayRequest getBillRepayRequest() {
		return this.billRepayRequest;
	}
	public void setBillRepayRequest(BillRepayRequest billRepayRequest) {
		this.billRepayRequest = billRepayRequest;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getPayCardNo() {
		return this.payCardNo;
	}
	public void setPayCardNo(String payCardNo) {
		this.payCardNo = payCardNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public UserVo getUser() {
		return this.user;
	}
	public void setUser(UserVo user) {
		this.user = user;
	}

}
