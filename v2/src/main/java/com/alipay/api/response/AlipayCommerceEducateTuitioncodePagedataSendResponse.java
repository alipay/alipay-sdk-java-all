package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.tuitioncode.pagedata.send response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:10
 */
public class AlipayCommerceEducateTuitioncodePagedataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3779781374571887348L;

	/** 
	 * 页面数据录入id
	 */
	@ApiField("pagedata_id")
	private String pagedataId;

	public void setPagedataId(String pagedataId) {
		this.pagedataId = pagedataId;
	}
	public String getPagedataId( ) {
		return this.pagedataId;
	}

}
