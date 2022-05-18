package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.creditrisk.widget.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:15
 */
public class MybankCreditCreditriskWidgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1395681357837119665L;

	/** 
	 * widget json数据
	 */
	@ApiField("widgetjson")
	private String widgetjson;

	public void setWidgetjson(String widgetjson) {
		this.widgetjson = widgetjson;
	}
	public String getWidgetjson( ) {
		return this.widgetjson;
	}

}
