package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业发票分页查询
 *
 * @author auto create
 * @since 1.0, 2024-05-06 14:38:31
 */
public class AlipayEbppInvoiceEnterpriseInvoiceinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8643385422951638426L;

	/**
	 * 发票日期查询结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 企业ID
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 发票日期查询起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
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

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
