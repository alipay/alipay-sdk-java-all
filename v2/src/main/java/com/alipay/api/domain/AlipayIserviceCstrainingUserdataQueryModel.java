package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学员信息查询
 *
 * @author auto create
 * @since 1.0, 2025-08-20 13:53:05
 */
public class AlipayIserviceCstrainingUserdataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2817223136238859138L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 学员的标识id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 学习路径的id
	 */
	@ApiField("path_id")
	private String pathId;

	/**
	 * 学习路径名称
	 */
	@ApiField("path_name")
	private String pathName;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 租户
	 */
	@ApiField("tenant_id")
	private String tenantId;

	/**
	 * 学员名称
	 */
	@ApiField("user_name")
	private String userName;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPathId() {
		return this.pathId;
	}
	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

	public String getPathName() {
		return this.pathName;
	}
	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTenantId() {
		return this.tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
