package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学习路径信息查询
 *
 * @author auto create
 * @since 1.0, 2025-08-19 21:32:59
 */
public class AlipayIserviceCstrainingLearningpathQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4653646814621478153L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 路径id
	 */
	@ApiField("path_id")
	private String pathId;

	/**
	 * 路径名称
	 */
	@ApiField("path_name")
	private String pathName;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 租户id
	 */
	@ApiField("tenant_id")
	private String tenantId;

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

}
