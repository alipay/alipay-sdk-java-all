package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外汇订单下单
 *
 * @author auto create
 * @since 1.0, 2019-08-26 20:53:10
 */
public class AlipayOverseasRemitFxtradeorderSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4377672534742154533L;

	/**
	 * {}
	 */
	@ApiField("request")
	private String request;

	public String getRequest() {
		return this.request;
	}
	public void setRequest(String request) {
		this.request = request;
	}

}
