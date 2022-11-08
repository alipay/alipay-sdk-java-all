package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 网商授权服务咨询
 *
 * @author auto create
 * @since 1.0, 2022-08-02 17:00:16
 */
public class MybankCreditLoanapplyBkamcAntauthsignConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7218613492329115176L;

	/**
	 * 客户id，根据custType不同填入不同的值
	 */
	@ApiField("cust_id")
	private String custId;

	/**
	 * USERID：支付宝2088
LOGINID：支付宝登录id，用来走未授权场景查询2088
	 */
	@ApiField("cust_type")
	private String custType;

	/**
	 * 产品码
	 */
	@ApiField("prod_code")
	private String prodCode;

	public String getCustId() {
		return this.custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustType() {
		return this.custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

}
