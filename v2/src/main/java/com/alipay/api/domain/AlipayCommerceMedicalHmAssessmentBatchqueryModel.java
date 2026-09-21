package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗家空间量表记录批量查询
 *
 * @author auto create
 * @since 1.0, 2026-08-25 17:38:55
 */
public class AlipayCommerceMedicalHmAssessmentBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7374385997145818494L;

	/**
	 * 活动类型
	 */
	@ApiField("activity_type")
	private String activityType;

	/**
	 * 用户开发id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页码、默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数、默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityType() {
		return this.activityType;
	}
	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
