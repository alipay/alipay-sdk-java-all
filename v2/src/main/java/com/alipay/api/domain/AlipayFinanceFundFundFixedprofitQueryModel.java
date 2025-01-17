package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基金定投收益率数据
 *
 * @author auto create
 * @since 1.0, 2017-10-30 14:15:24
 */
public class AlipayFinanceFundFundFixedprofitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7149287161533299259L;

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
