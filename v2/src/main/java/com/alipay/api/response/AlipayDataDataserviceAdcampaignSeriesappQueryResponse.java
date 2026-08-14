package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.seriesapp.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 19:22:54
 */
public class AlipayDataDataserviceAdcampaignSeriesappQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4815131455358641142L;

	/** 
	 * null
	 */
	@ApiListField("app_list")
	@ApiField("ad_app_info")
	private List<AdAppInfo> appList;

	public void setAppList(List<AdAppInfo> appList) {
		this.appList = appList;
	}
	public List<AdAppInfo> getAppList( ) {
		return this.appList;
	}

}
