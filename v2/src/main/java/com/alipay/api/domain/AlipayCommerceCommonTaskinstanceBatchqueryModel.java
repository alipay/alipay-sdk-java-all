package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客任务实例列表查询
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:31:17
 */
public class AlipayCommerceCommonTaskinstanceBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4858477638931458112L;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 导购员openid
	 */
	@ApiField("hunter_open_id")
	private String hunterOpenId;

	/**
	 * 代运营商户Id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 查询分页页数
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 任务类型
	 */
	@ApiField("task_type")
	private String taskType;

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

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}
