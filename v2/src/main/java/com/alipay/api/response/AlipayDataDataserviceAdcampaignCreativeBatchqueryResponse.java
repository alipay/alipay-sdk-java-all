package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreativePageListRes;
import com.alipay.api.domain.AdCamPagination;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.creative.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-18 16:24:07
 */
public class AlipayDataDataserviceAdcampaignCreativeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6299389552376443926L;

	/** 
	 * 分页数据
	 */
	@ApiField("list")
	private CreativePageListRes list;

	/** 
	 * 分页信息
	 */
	@ApiField("pagination")
	private AdCamPagination pagination;

	public void setList(CreativePageListRes list) {
		this.list = list;
	}
	public CreativePageListRes getList( ) {
		return this.list;
	}

	public void setPagination(AdCamPagination pagination) {
		this.pagination = pagination;
	}
	public AdCamPagination getPagination( ) {
		return this.pagination;
	}

}
