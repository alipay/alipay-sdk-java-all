package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreativeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.creative.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 19:13:36
 */
public class AlipayDataDataserviceAdCreativeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7178576117384335768L;

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
