package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联行信息查询接口
 *
 * @author auto create
 * @since 1.0, 2020-06-15 10:00:52
 */
public class AlipayEbppProdmodeUnionbankQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7679158359228787674L;

	/**
	 * 银联编号
	 */
	@ApiField("bank_code")
	private String bankCode;

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

}
