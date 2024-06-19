package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.creditrisk.data.put response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 22:16:57
 */
public class AlipayCreditCreditriskDataPutResponse extends AlipayResponse {

	private static final long serialVersionUID = 5394496122568113318L;

	/** 
	 * 返回该条数据在网商的唯一ID
	 */
	@ApiField("dataid")
	private String dataid;

	public void setDataid(String dataid) {
		this.dataid = dataid;
	}
	public String getDataid( ) {
		return this.dataid;
	}

}
