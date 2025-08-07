package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可信价值中心用户协议查询
 *
 * @author auto create
 * @since 1.0, 2025-07-30 11:55:45
 */
public class AnttechBlockchainFinanceTvpAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8657371333483678949L;

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

}
