package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.findata.fundunion.bizcache.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class SsdataFindataFundunionBizcacheQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4522636768641648367L;

	/** 
	 * 获取的公积金业务缓存数据
	 */
	@ApiField("biz_content")
	private String bizContent;

	public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}
	public String getBizContent( ) {
		return this.bizContent;
	}

}
