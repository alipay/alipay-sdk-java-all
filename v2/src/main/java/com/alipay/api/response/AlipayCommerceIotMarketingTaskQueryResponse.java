package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ISPTaskInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.marketing.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-23 15:52:44
 */
public class AlipayCommerceIotMarketingTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1865494349358236936L;

	/** 
	 * 当前页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小，单位条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("pages")
	private Long pages;

	/** 
	 * 任务信息列表
	 */
	@ApiListField("task_info_list")
	@ApiField("i_s_p_task_info")
	private List<ISPTaskInfo> taskInfoList;

	/** 
	 * 总条数
	 */
	@ApiField("total_count")
	private Long totalCount;

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

	public void setPages(Long pages) {
		this.pages = pages;
	}
	public Long getPages( ) {
		return this.pages;
	}

	public void setTaskInfoList(List<ISPTaskInfo> taskInfoList) {
		this.taskInfoList = taskInfoList;
	}
	public List<ISPTaskInfo> getTaskInfoList( ) {
		return this.taskInfoList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
