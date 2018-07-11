package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.batch.createsinglebatch response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-22 15:55:24
 */
public class AlipayFundTransBatchCreatesinglebatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 7118613144877282346L;

	/** 
	 * 所创建成功后的批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 调用方传入的ext_param，透传回去
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * token，每个批次对应一个token，每次调用方进行查询的时候都要使用批次号和token进行组合查询
	 */
	@ApiField("token")
	private String token;

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	public String getExtParam( ) {
		return this.extParam;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
