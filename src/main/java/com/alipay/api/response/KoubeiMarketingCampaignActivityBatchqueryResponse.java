package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CampBaseDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.activity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-02 14:24:03
 */
public class KoubeiMarketingCampaignActivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8546454953796728332L;

	/** 
	 * 活动列表
	 */
	@ApiListField("camp_sets")
	@ApiField("camp_base_dto")
	private List<CampBaseDto> campSets;

	/** 
	 * 总数量
	 */
	@ApiField("total_number")
	private String totalNumber;

	public void setCampSets(List<CampBaseDto> campSets) {
		this.campSets = campSets;
	}
	public List<CampBaseDto> getCampSets( ) {
		return this.campSets;
	}

	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getTotalNumber( ) {
		return this.totalNumber;
	}

}
