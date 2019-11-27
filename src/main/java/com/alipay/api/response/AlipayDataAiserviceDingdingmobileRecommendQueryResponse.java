package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DingDingMobileRecommendData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.dingdingmobile.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-14 15:13:52
 */
public class AlipayDataAiserviceDingdingmobileRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2276616686366387881L;

	/** 
	 * 钉钉拉新推荐结果
	 */
	@ApiListField("result")
	@ApiField("ding_ding_mobile_recommend_data")
	private List<DingDingMobileRecommendData> result;

	public void setResult(List<DingDingMobileRecommendData> result) {
		this.result = result;
	}
	public List<DingDingMobileRecommendData> getResult( ) {
		return this.result;
	}

}
