package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskInstanceBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.hunter.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-13 10:31:41
 */
public class AlipayCommerceYuntaskHunterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2812429236634683467L;

	/** 
	 * 页码
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 任务信息
	 */
	@ApiListField("task_info_list")
	@ApiField("task_instance_basic_info")
	private List<TaskInstanceBasicInfo> taskInfoList;

	/** 
	 * 总数量
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTaskInfoList(List<TaskInstanceBasicInfo> taskInfoList) {
		this.taskInfoList = taskInfoList;
	}
	public List<TaskInstanceBasicInfo> getTaskInfoList( ) {
		return this.taskInfoList;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
