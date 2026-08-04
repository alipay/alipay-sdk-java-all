package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdSeriesTabCompilationResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.seriestabcompilation.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 19:22:54
 */
public class AlipayDataDataserviceAdcampaignSeriestabcompilationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8517476221242412365L;

	/** 
	 * null
	 */
	@ApiListField("compilation_list")
	@ApiField("ad_series_tab_compilation_resp")
	private List<AdSeriesTabCompilationResp> compilationList;

	public void setCompilationList(List<AdSeriesTabCompilationResp> compilationList) {
		this.compilationList = compilationList;
	}
	public List<AdSeriesTabCompilationResp> getCompilationList( ) {
		return this.compilationList;
	}

}
