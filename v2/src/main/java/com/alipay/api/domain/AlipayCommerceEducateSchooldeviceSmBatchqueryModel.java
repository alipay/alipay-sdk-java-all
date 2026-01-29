package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间联商户报名查询
 *
 * @author auto create
 * @since 1.0, 2025-08-22 11:06:40
 */
public class AlipayCommerceEducateSchooldeviceSmBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6426772676667589563L;

	/**
	 * 活动码
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 业务码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 页码，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数，默认10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商户名称
	 */
	@ApiField("sm_cn_name")
	private String smCnName;

	/**
	 * 间联商户ID
	 */
	@ApiField("sm_id")
	private String smId;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
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

	public String getSmCnName() {
		return this.smCnName;
	}
	public void setSmCnName(String smCnName) {
		this.smCnName = smCnName;
	}

	public String getSmId() {
		return this.smId;
	}
	public void setSmId(String smId) {
		this.smId = smId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
