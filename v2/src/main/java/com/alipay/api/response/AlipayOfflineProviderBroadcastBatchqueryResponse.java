package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BroadcastReportItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.broadcast.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-07 17:17:41
 */
public class AlipayOfflineProviderBroadcastBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4788116861518513266L;

	/** 
	 * 语音播报数据集合
	 */
	@ApiListField("broadcast_report_list")
	@ApiField("broadcast_report_item")
	private List<BroadcastReportItem> broadcastReportList;

	/** 
	 * 分页每页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 数据总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setBroadcastReportList(List<BroadcastReportItem> broadcastReportList) {
		this.broadcastReportList = broadcastReportList;
	}
	public List<BroadcastReportItem> getBroadcastReportList( ) {
		return this.broadcastReportList;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
