package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SlowLog;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.database.slowsqldetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-28 11:37:04
 */
public class AlipayCloudCloudbaseDatabaseSlowsqldetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4368368255645975591L;

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
	 * 慢日志列表
	 */
	@ApiListField("slow_logs")
	@ApiField("slow_log")
	private List<SlowLog> slowLogs;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

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

	public void setSlowLogs(List<SlowLog> slowLogs) {
		this.slowLogs = slowLogs;
	}
	public List<SlowLog> getSlowLogs( ) {
		return this.slowLogs;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
