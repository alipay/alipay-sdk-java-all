package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YunTaskTemplateInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-13 13:31:47
 */
public class AlipayCommerceYuntaskListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6131827939233813633L;

	/** 
	 * 当前页数
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 任务模版列表
	 */
	@ApiListField("task_list")
	@ApiField("yun_task_template_info_d_t_o")
	private List<YunTaskTemplateInfoDTO> taskList;

	/** 
	 * 总记录数
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

	public void setTaskList(List<YunTaskTemplateInfoDTO> taskList) {
		this.taskList = taskList;
	}
	public List<YunTaskTemplateInfoDTO> getTaskList( ) {
		return this.taskList;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
