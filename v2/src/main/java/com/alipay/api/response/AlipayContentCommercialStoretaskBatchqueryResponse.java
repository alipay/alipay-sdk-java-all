package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LiveTaskList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.commercial.storetask.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-05 14:05:42
 */
public class AlipayContentCommercialStoretaskBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2618752433358564128L;

	/** 
	 * 任务列表
	 */
	@ApiListField("live_task_list")
	@ApiField("live_task_list")
	private List<LiveTaskList> liveTaskList;

	/** 
	 * 分页页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小，单位条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数，单位条
	 */
	@ApiField("total")
	private String total;

	public void setLiveTaskList(List<LiveTaskList> liveTaskList) {
		this.liveTaskList = liveTaskList;
	}
	public List<LiveTaskList> getLiveTaskList( ) {
		return this.liveTaskList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	public String getTotal( ) {
		return this.total;
	}

}
