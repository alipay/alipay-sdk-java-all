package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaskInstanceBasicInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.common.taskinstance.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:16:43
 */
public class AlipayCommerceCommonTaskinstanceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1674729977478662941L;

	/** 
	 * 分页页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 任务实例信息列表
	 */
	@ApiListField("task_info_list")
	@ApiField("task_instance_basic_info_d_t_o")
	private List<TaskInstanceBasicInfoDTO> taskInfoList;

	/** 
	 * 总条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTaskInfoList(List<TaskInstanceBasicInfoDTO> taskInfoList) {
		this.taskInfoList = taskInfoList;
	}
	public List<TaskInstanceBasicInfoDTO> getTaskInfoList( ) {
		return this.taskInfoList;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
