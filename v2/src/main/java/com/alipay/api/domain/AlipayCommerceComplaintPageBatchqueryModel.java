package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投诉查询
 *
 * @author auto create
 * @since 1.0, 2023-11-10 10:36:13
 */
public class AlipayCommerceComplaintPageBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3676788932351323927L;

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
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

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

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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
