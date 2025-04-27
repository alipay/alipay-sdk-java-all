package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量查询签到记录
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:46
 */
public class AlipayCommerceEducateCheckinRecordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1217982347417422887L;

	/**
	 * 签到结束时间
	 */
	@ApiField("check_in_end_time")
	private Date checkInEndTime;

	/**
	 * 签到开始时间
	 */
	@ApiField("check_in_start_time")
	private Date checkInStartTime;

	/**
	 * 签到类型，由学生签到时，匹配到的签到规则决定
	 */
	@ApiField("check_in_type")
	private String checkInType;

	/**
	 * 学号或工号
	 */
	@ApiField("employee_no")
	private String employeeNo;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 学生姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * 组织部门节点id
	 */
	@ApiListField("node_id_list")
	@ApiField("string")
	private List<String> nodeIdList;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Date getCheckInEndTime() {
		return this.checkInEndTime;
	}
	public void setCheckInEndTime(Date checkInEndTime) {
		this.checkInEndTime = checkInEndTime;
	}

	public Date getCheckInStartTime() {
		return this.checkInStartTime;
	}
	public void setCheckInStartTime(Date checkInStartTime) {
		this.checkInStartTime = checkInStartTime;
	}

	public String getCheckInType() {
		return this.checkInType;
	}
	public void setCheckInType(String checkInType) {
		this.checkInType = checkInType;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<String> getNodeIdList() {
		return this.nodeIdList;
	}
	public void setNodeIdList(List<String> nodeIdList) {
		this.nodeIdList = nodeIdList;
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
