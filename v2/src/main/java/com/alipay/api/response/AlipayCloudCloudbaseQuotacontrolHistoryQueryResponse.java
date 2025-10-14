package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QuotaControlHistoryRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.quotacontrol.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-19 14:31:43
 */
public class AlipayCloudCloudbaseQuotacontrolHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2254345217934997963L;

	/** 
	 * 额度防控规则历史列表
	 */
	@ApiListField("histories")
	@ApiField("quota_control_history_record")
	private List<QuotaControlHistoryRecord> histories;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setHistories(List<QuotaControlHistoryRecord> histories) {
		this.histories = histories;
	}
	public List<QuotaControlHistoryRecord> getHistories( ) {
		return this.histories;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
