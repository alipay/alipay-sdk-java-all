package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdSeriesAppCompilationResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.seriesappcompilation.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 19:09:17
 */
public class AlipayDataDataserviceAdcampaignSeriesappcompilationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5493462576179836377L;

	/** 
	 * null
	 */
	@ApiListField("compilation_list")
	@ApiField("ad_series_app_compilation_resp")
	private List<AdSeriesAppCompilationResp> compilationList;

	public void setCompilationList(List<AdSeriesAppCompilationResp> compilationList) {
		this.compilationList = compilationList;
	}
	public List<AdSeriesAppCompilationResp> getCompilationList( ) {
		return this.compilationList;
	}

}
