package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询基金产品基础数据
 *
 * @author auto create
 * @since 1.0, 2018-03-02 18:06:25
 */
public class AlipayFinanceFundFundprodQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1276614587178994957L;

	/**
	 * 基金代码
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
