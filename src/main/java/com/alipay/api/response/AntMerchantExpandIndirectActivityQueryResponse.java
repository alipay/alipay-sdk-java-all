package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-09 22:12:35
 */
public class AntMerchantExpandIndirectActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2684861174778796835L;

	/** 
	 * 费率申请通过后实际生效的费率值，只有0或者0.001两种可能情况。当status字段返回TRUE时此字段有值，反之不返回费率信息
	 */
	@ApiField("rate")
	private String rate;

	/** 
	 * 费率审核通过此字段状态值为TRUE，反之为FALSE
	 */
	@ApiField("status")
	private String status;

	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getRate( ) {
		return this.rate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
