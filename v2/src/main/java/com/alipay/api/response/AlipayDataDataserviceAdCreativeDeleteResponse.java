package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenDeleteCreativeResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.creative.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-19 14:37:04
 */
public class AlipayDataDataserviceAdCreativeDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3846393171316257523L;

	/** 
	 * 批量删除创意的响应
	 */
	@ApiField("open_delete_creative_response")
	private OpenDeleteCreativeResponse openDeleteCreativeResponse;

	public void setOpenDeleteCreativeResponse(OpenDeleteCreativeResponse openDeleteCreativeResponse) {
		this.openDeleteCreativeResponse = openDeleteCreativeResponse;
	}
	public OpenDeleteCreativeResponse getOpenDeleteCreativeResponse( ) {
		return this.openDeleteCreativeResponse;
	}

}
