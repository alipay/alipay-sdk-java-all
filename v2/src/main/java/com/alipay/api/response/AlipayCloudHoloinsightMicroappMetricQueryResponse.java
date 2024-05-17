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
 * @since 1.0, 2024-02-21 15:16:38
 */
public class AlipayCloudHoloinsightMicroappMetricQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7495746645389288169L;

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
