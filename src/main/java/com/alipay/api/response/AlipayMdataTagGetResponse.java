package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mdata.tag.get response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMdataTagGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2517963533474132179L;

	/** 
	 * 查询到的标签值, JSON字符串
	 */
	@ApiField("tag_values")
	private String tagValues;

	public void setTagValues(String tagValues) {
		this.tagValues = tagValues;
	}
	public String getTagValues( ) {
		return this.tagValues;
	}

}
