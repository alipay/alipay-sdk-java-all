package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心余额释放
 *
 * @author auto create
 * @since 1.0, 2024-10-23 17:07:25
 */
public class AnttechBlockchainFinanceTvpAccountbalanceReleaseModel extends AlipayObject {

	private static final long serialVersionUID = 5395156884297795929L;

	/**
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 释放金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 申请流水
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
