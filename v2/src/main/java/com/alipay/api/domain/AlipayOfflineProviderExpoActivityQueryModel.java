package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 数字活动查询接口
 *
 * @author auto create
 * @since 1.0, 2026-05-08 11:12:45
 */
public class AlipayOfflineProviderExpoActivityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2585443367574681464L;

	/**
	 * 活动唯一编码，精确查询
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 活动状态（参考创建接口状态定义）：
EFFECTIVE - 执行中
EXPIRED - 已执行完成
	 */
	@ApiField("activity_status")
	private String activityStatus;

	/**
	 * 页码，从1开始。默认为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录数，最大50。默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityStatus() {
		return this.activityStatus;
	}
	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
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
