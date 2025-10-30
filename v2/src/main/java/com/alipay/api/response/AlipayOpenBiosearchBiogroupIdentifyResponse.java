package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BioSearchApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.biosearch.biogroup.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-22 16:06:55
 */
public class AlipayOpenBiosearchBiogroupIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1192337788915224574L;

	/** 
	 * 生物搜索结果，可能没有可能多个
	 */
	@ApiListField("bio_results")
	@ApiField("bio_search_api_result")
	private List<BioSearchApiResult> bioResults;

	public void setBioResults(List<BioSearchApiResult> bioResults) {
		this.bioResults = bioResults;
	}
	public List<BioSearchApiResult> getBioResults( ) {
		return this.bioResults;
	}

}
