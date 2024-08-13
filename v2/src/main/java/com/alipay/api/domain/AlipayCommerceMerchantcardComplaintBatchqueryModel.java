package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询投诉列表
 *
 * @author auto create
 * @since 1.0, 2024-05-10 16:54:15
 */
public class AlipayCommerceMerchantcardComplaintBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2549121737744722622L;

	/**
	 * 投诉状态
	 */
	@ApiField("complaint_status")
	private String complaintStatus;

	/**
	 * 投诉类型
	 */
	@ApiField("complaint_type")
	private String complaintType;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getComplaintStatus() {
		return this.complaintStatus;
	}
	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
	}

	public String getComplaintType() {
		return this.complaintType;
	}
	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
