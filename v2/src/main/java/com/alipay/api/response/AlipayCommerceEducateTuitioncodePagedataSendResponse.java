package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.tuitioncode.pagedata.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 23:05:48
 */
public class AlipayCommerceEducateTuitioncodePagedataSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8387244892255386215L;

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
