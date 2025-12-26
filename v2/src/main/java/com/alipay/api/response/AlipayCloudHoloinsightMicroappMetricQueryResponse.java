package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HoloInsightDataQueryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.holoinsight.microapp.metric.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:07
 */
public class AlipayCloudHoloinsightMicroappMetricQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7546684461413521474L;

	/** 
	 * 时序数据
	 */
	@ApiListField("data")
	@ApiField("holo_insight_data_query_result")
	private List<HoloInsightDataQueryResult> data;

	public void setData(List<HoloInsightDataQueryResult> data) {
		this.data = data;
	}
	public List<HoloInsightDataQueryResult> getData( ) {
		return this.data;
	}

}
