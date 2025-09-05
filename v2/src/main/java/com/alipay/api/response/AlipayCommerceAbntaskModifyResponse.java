package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FailTaskDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.abntask.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:42:43
 */
public class AlipayCommerceAbntaskModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2438723362924644389L;

	/** 
	 * 操作失败任务数量
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 失败任务明细列表
	 */
	@ApiListField("fail_task_details")
	@ApiField("fail_task_detail")
	private List<FailTaskDetail> failTaskDetails;

	/** 
	 * 操作成功任务数量
	 */
	@ApiField("success_count")
	private Long successCount;

	public void setFailCount(Long failCount) {
		this.failCount = failCount;
	}
	public Long getFailCount( ) {
		return this.failCount;
	}

	public void setFailTaskDetails(List<FailTaskDetail> failTaskDetails) {
		this.failTaskDetails = failTaskDetails;
	}
	public List<FailTaskDetail> getFailTaskDetails( ) {
		return this.failTaskDetails;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

}
