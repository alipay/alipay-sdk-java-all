package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PlanPageListRes;
import com.alipay.api.domain.AdCamPagination;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.plan.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-15 15:17:34
 */
public class AlipayDataDataserviceAdcampaignPlanBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6783211468553765297L;

	/** 
	 * 计划分页数据信息
	 */
	@ApiListField("list")
	@ApiField("plan_page_list_res")
	private List<PlanPageListRes> list;

	/** 
	 * 分页信息
	 */
	@ApiField("pagination")
	private AdCamPagination pagination;

	public void setList(List<PlanPageListRes> list) {
		this.list = list;
	}
	public List<PlanPageListRes> getList( ) {
		return this.list;
	}

	public void setPagination(AdCamPagination pagination) {
		this.pagination = pagination;
	}
	public AdCamPagination getPagination( ) {
		return this.pagination;
	}

}
