package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企业发票分页查询
 *
 * @author auto create
 * @since 1.0, 2025-11-03 20:24:46
 */
public class AlipayEbppInvoiceEnterpriseInvoiceinfoBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4739212281173343882L;

	/**
	 * 员工id
	 */
	@ApiField("employee_id")
	private String employeeId;

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
	 * 报销状态：REIMBURSE_WAIT：待报销；REIMBURSE_APPLY：报销已提交；REIMBURSE_FINISH：报销完成
	 */
	@ApiListField("reimburse_status_list")
	@ApiField("string")
	private List<String> reimburseStatusList;

	/**
	 * 发票日期查询起始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

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

	public List<String> getReimburseStatusList() {
		return this.reimburseStatusList;
	}
	public void setReimburseStatusList(List<String> reimburseStatusList) {
		this.reimburseStatusList = reimburseStatusList;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
