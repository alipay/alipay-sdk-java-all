package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向营业员额度变更明细查询
 *
 * @author auto create
 * @since 1.0, 2026-08-25 00:07:51
 */
public class AlipayCommerceEcRecyclinginvoiceClerkquotarecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3659993247884229954L;

	/**
	 * 变更类型
	 */
	@ApiField("change_type")
	private String changeType;

	/**
	 * 企业（商户）营业员ID
	 */
	@ApiField("company_clerk_id")
	private String companyClerkId;

	/**
	 * 变更结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 页码，默认 1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数，默认 20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 变更起始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getChangeType() {
		return this.changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getCompanyClerkId() {
		return this.companyClerkId;
	}
	public void setCompanyClerkId(String companyClerkId) {
		this.companyClerkId = companyClerkId;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
