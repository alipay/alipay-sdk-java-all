package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户协议解约
 *
 * @author auto create
 * @since 1.0, 2025-07-30 11:56:36
 */
public class AnttechBlockchainFinanceTvpAccountCloseModel extends AlipayObject {

	private static final long serialVersionUID = 8814994733851252447L;

	/**
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 可信价值中心产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 申请流水，商户唯一
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
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
