package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AbnTaskInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.abntask.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-26 13:32:54
 */
public class AlipayCommerceAbntaskBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2282751913836143785L;

	/** 
	 * 当前页码，不传默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数据量，正整数，不传默认为1000，超过1000也认定为1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 任务信息列表
	 */
	@ApiListField("task_list")
	@ApiField("abn_task_info")
	private List<AbnTaskInfo> taskList;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

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

	public void setTaskList(List<AbnTaskInfo> taskList) {
		this.taskList = taskList;
	}
	public List<AbnTaskInfo> getTaskList( ) {
		return this.taskList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
