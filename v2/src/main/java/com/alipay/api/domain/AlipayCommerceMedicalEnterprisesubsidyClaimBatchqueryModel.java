package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 按时间范围查询报销单
 *
 * @author auto create
 * @since 1.0, 2025-08-04 10:17:36
 */
public class AlipayCommerceMedicalEnterprisesubsidyClaimBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3722746461836927516L;

	/**
	 * 企业编号
	 */
	@ApiField("cur_company_id")
	private String curCompanyId;

	/**
	 * 结束时间
	 */
	@ApiField("end_datetime")
	private Date endDatetime;

	/**
	 * 上级企业编号
	 */
	@ApiField("father_company_id")
	private String fatherCompanyId;

	/**
	 * 页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 1
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 起始时间
	 */
	@ApiField("start_datetime")
	private Date startDatetime;

	public String getCurCompanyId() {
		return this.curCompanyId;
	}
	public void setCurCompanyId(String curCompanyId) {
		this.curCompanyId = curCompanyId;
	}

	public Date getEndDatetime() {
		return this.endDatetime;
	}
	public void setEndDatetime(Date endDatetime) {
		this.endDatetime = endDatetime;
	}

	public String getFatherCompanyId() {
		return this.fatherCompanyId;
	}
	public void setFatherCompanyId(String fatherCompanyId) {
		this.fatherCompanyId = fatherCompanyId;
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

	public Date getStartDatetime() {
		return this.startDatetime;
	}
	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}

}
