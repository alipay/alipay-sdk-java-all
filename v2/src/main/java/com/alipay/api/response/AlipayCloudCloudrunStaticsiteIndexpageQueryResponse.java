package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudrun.staticsite.indexpage.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-10-16 15:01:46
 */
public class AlipayCloudCloudrunStaticsiteIndexpageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1754923986167963553L;

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
