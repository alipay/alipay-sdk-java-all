package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BroadcastReportItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.broadcast.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-06 09:47:40
 */
public class AlipayOfflineProviderBroadcastQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5393648936977889353L;

	/** 
	 * 语音播报数据集合
	 */
	@ApiListField("broadcast_report_list")
	@ApiField("broadcast_report_item")
	private List<BroadcastReportItem> broadcastReportList;

	public void setBroadcastReportList(List<BroadcastReportItem> broadcastReportList) {
		this.broadcastReportList = broadcastReportList;
	}
	public List<BroadcastReportItem> getBroadcastReportList( ) {
		return this.broadcastReportList;
	}

}
