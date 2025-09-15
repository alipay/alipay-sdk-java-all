package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreativePageListRes;
import com.alipay.api.domain.AdCamPagination;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.creative.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-15 15:17:34
 */
public class AlipayDataDataserviceAdcampaignCreativeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8474715853158539287L;

	/** 
	 * 创意分页数据
	 */
	@ApiListField("content_list")
	@ApiField("creative_page_list_res")
	private List<CreativePageListRes> contentList;

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

	public void setContentList(List<CreativePageListRes> contentList) {
		this.contentList = contentList;
	}
	public List<CreativePageListRes> getContentList( ) {
		return this.contentList;
	}

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
