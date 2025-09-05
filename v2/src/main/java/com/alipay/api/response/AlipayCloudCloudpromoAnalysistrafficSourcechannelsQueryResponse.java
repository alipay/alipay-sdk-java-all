package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiTrafficSourceChannelVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudpromo.analysistraffic.sourcechannels.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-20 17:32:10
 */
public class AlipayCloudCloudpromoAnalysistrafficSourcechannelsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8258459674395759147L;

	/** 
	 * 经营分析流量分析来源渠道列表返回体
	 */
	@ApiListField("items")
	@ApiField("open_api_traffic_source_channel_v_o")
	private List<OpenApiTrafficSourceChannelVO> items;

	public void setItems(List<OpenApiTrafficSourceChannelVO> items) {
		this.items = items;
	}
	public List<OpenApiTrafficSourceChannelVO> getItems( ) {
		return this.items;
	}

}
