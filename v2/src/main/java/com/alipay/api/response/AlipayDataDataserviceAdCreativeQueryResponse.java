package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreativeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.creative.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-23 14:30:52
 */
public class AlipayDataDataserviceAdCreativeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5165618611769754415L;

	/** 
	 * 创意详情
	 */
	@ApiField("creative_detail")
	private CreativeDetail creativeDetail;

	public void setCreativeDetail(CreativeDetail creativeDetail) {
		this.creativeDetail = creativeDetail;
	}
	public CreativeDetail getCreativeDetail( ) {
		return this.creativeDetail;
	}

}
