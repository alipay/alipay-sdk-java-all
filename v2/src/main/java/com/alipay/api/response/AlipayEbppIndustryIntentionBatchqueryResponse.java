package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IntentionBaseInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.intention.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-22 17:57:26
 */
public class AlipayEbppIndustryIntentionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3475663183376646347L;

	/** 
	 * 意图信息列表
	 */
	@ApiListField("intention_list")
	@ApiField("intention_base_info")
	private List<IntentionBaseInfo> intentionList;

	public void setIntentionList(List<IntentionBaseInfo> intentionList) {
		this.intentionList = intentionList;
	}
	public List<IntentionBaseInfo> getIntentionList( ) {
		return this.intentionList;
	}

}
