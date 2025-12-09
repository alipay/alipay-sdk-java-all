package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 先采后付免密下单业务大字段
 *
 * @author auto create
 * @since 1.0, 2025-07-07 15:59:02
 */
public class CreditTradePayBusinessParams extends AlipayObject {

	private static final long serialVersionUID = 1681553317413781531L;

	/**
	 * 信用参数，可选
	 */
	@ApiField("credit_biz_params")
	private String creditBizParams;

	public String getCreditBizParams() {
		return this.creditBizParams;
	}
	public void setCreditBizParams(String creditBizParams) {
		this.creditBizParams = creditBizParams;
	}

}
