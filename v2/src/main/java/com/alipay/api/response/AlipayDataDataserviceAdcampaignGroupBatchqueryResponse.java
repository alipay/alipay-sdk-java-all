package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GroupPageListRes;
import com.alipay.api.domain.AdCamPagination;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.group.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-12 16:22:27
 */
public class AlipayDataDataserviceAdcampaignGroupBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2677613243982385559L;

	/** 
	 * 单元列表数据对象
	 */
	@ApiListField("list")
	@ApiField("group_page_list_res")
	private List<GroupPageListRes> list;

	/** 
	 * 分页信息
	 */
	@ApiField("pagination")
	private AdCamPagination pagination;

	public void setList(List<GroupPageListRes> list) {
		this.list = list;
	}
	public List<GroupPageListRes> getList( ) {
		return this.list;
	}

	public void setPagination(AdCamPagination pagination) {
		this.pagination = pagination;
	}
	public AdCamPagination getPagination( ) {
		return this.pagination;
	}

}
