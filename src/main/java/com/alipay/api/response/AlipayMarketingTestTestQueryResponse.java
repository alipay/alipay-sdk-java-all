package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FengdieSitesQueryRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.test.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingTestTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6784154538375244274L;

	/** 
	 * aa
	 */
	@ApiListField("complex_id")
	@ApiField("fengdie_sites_query_resp_model")
	private List<FengdieSitesQueryRespModel> complexId;

	public void setComplexId(List<FengdieSitesQueryRespModel> complexId) {
		this.complexId = complexId;
	}
	public List<FengdieSitesQueryRespModel> getComplexId( ) {
		return this.complexId;
	}

}
