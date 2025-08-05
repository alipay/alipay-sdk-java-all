package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FlowStatsEntry;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.antiflood.flowbysourceip.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-22 14:41:55
 */
public class AlipayCloudCloudbaseAntifloodFlowbysourceipQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4684233698763797689L;

	/** 
	 * 流量统计信息
	 */
	@ApiListField("flowstats")
	@ApiField("flow_stats_entry")
	private List<FlowStatsEntry> flowstats;

	public void setFlowstats(List<FlowStatsEntry> flowstats) {
		this.flowstats = flowstats;
	}
	public List<FlowStatsEntry> getFlowstats( ) {
		return this.flowstats;
	}

}
