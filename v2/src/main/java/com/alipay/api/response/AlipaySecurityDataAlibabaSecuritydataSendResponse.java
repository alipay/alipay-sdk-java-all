package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.alibaba.securitydata.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-10-08 17:49:05
 */
public class AlipaySecurityDataAlibabaSecuritydataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7352381286997926435L;

	/** 
	 * 返回数据写入后详细信息，一般为数据唯一key
	 */
	@ApiField("data_id")
	private String dataId;

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public String getDataId( ) {
		return this.dataId;
	}

}
