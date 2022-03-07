package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余利宝账户和收益查询
 *
 * @author auto create
 * @since 1.0, 2016-11-18 16:07:46
 */
public class MybankFinanceYulibaoAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3284482948456231632L;

	/**
	 * 基金代码。余利宝场景固定为 001529。
	 */
	@ApiField("fund_code")
	private String fundCode;

	public String getFundCode() {
		return this.fundCode;
	}
	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

}
