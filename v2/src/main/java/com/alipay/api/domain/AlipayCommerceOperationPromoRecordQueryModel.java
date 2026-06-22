package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动报名记录查询
 *
 * @author auto create
 * @since 1.0, 2026-06-17 14:46:26
 */
public class AlipayCommerceOperationPromoRecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3812324439791156223L;

	/**
	 * 活动编码，固定值
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 当前页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页大小，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询数据
	 */
	@ApiField("query_data")
	private String queryData;

	/**
	 * 主体ID，支持按照报名接口返回的ID传值，也可以传对应的支付宝账号
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 主体类型，支持按照报名接口返回的类型，也可以传对应的支付宝账号类型
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
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

	public String getQueryData() {
		return this.queryData;
	}
	public void setQueryData(String queryData) {
		this.queryData = queryData;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
