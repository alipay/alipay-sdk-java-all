package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.cashticket.template.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-27 10:29:41
 */
public class AlipayMarketingCashticketTemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3149952579627152919L;

	/** 
	 * 模板修改时的状态，I表示草稿状态所有入参都修改了，S表示生效状态仅修改了publish_end_time
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
