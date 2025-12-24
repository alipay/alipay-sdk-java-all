package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广告权益查询接口(支持分页)
 *
 * @author auto create
 * @since 1.0, 2025-12-16 15:47:41
 */
public class AlipayCommerceRetailBenefitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5367611559385813939L;

	/**
	 * 活动id，如果为空将忽略该过滤条件
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称pattern,如果为空将忽略该过滤条件
	 */
	@ApiField("activity_name_pattern")
	private String activityNamePattern;

	/**
	 * 活动来源
	 */
	@ApiField("activity_source")
	private String activitySource;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 页码,默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页大小,默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 活动status, 如果为空将忽略该过滤条件
	 */
	@ApiField("status")
	private String status;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityNamePattern() {
		return this.activityNamePattern;
	}
	public void setActivityNamePattern(String activityNamePattern) {
		this.activityNamePattern = activityNamePattern;
	}

	public String getActivitySource() {
		return this.activitySource;
	}
	public void setActivitySource(String activitySource) {
		this.activitySource = activitySource;
	}

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
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

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
