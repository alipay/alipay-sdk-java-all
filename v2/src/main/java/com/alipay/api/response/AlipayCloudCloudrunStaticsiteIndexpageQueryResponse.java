package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.indexpage.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-14 15:01:14
 */
public class AlipayCloudCloudrunStaticsiteIndexpageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3353657227131691719L;

	/** 
	 * 索引文件名
	 */
	@ApiField("index_file")
	private String indexFile;

	public void setIndexFile(String indexFile) {
		this.indexFile = indexFile;
	}
	public String getIndexFile( ) {
		return this.indexFile;
	}

}
