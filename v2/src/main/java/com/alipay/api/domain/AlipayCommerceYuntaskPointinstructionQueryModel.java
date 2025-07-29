package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 导购员查询积分流水
 *
 * @author auto create
 * @since 1.0, 2024-08-09 16:48:17
 */
public class AlipayCommerceYuntaskPointinstructionQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4824138595383717634L;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 积分流水id，导购员每次完成一次任务会得到一个积分流水id，在查询积分流水列表时，会对应一个积分流水id
	 */
	@ApiField("instruction_id")
	private String instructionId;

	/**
	 * 商家id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 页码
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 页面大小，单位个
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 任务id，导购员从任务列表点击某个任务进行积分查询时，这里传递的就是当前任务的id
	 */
	@ApiField("task_id")
	private String taskId;

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getHunterOpenId() {
		return this.hunterOpenId;
	}
	public void setHunterOpenId(String hunterOpenId) {
		this.hunterOpenId = hunterOpenId;
	}

	public String getInstructionId() {
		return this.instructionId;
	}
	public void setInstructionId(String instructionId) {
		this.instructionId = instructionId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
