package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DataSecCheckResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.check.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:04
 */
public class KoubeiMarketingDataMallCheckGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7358982778722335495L;

	/** 
	 * 返回数据字段
	 */
	@ApiListField("data_results")
	@ApiField("data_sec_check_result")
	private List<DataSecCheckResult> dataResults;

	public void setDataResults(List<DataSecCheckResult> dataResults) {
		this.dataResults = dataResults;
	}
	public List<DataSecCheckResult> getDataResults( ) {
		return this.dataResults;
	}

}
