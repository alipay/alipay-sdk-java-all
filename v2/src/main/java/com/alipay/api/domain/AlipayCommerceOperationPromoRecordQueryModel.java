package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销活动报名记录查询
 *
 * @author auto create
 * @since 1.0, 2026-06-29 18:07:55
 */
public class AlipayCommerceOperationPromoRecordQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5332855336674837886L;

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
	 * 特殊场景使用，无需求可不传
	 */
	@ApiField("query_data")
	private String queryData;

	/**
	 * 在餐饮场景下，支付宝用户的报名记录为主报名记录，名下的门店报名记录为子报名记录。配合subject_type/subject_id参数，可用于查询某个支付宝账号名下报名的门店；
	 */
	@ApiField("query_sub_record")
	private Boolean querySubRecord;

	/**
	 * 活动期次ID
	 */
	@ApiField("round_id")
	private String roundId;

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

	public Boolean getQuerySubRecord() {
		return this.querySubRecord;
	}
	public void setQuerySubRecord(Boolean querySubRecord) {
		this.querySubRecord = querySubRecord;
	}

	public String getRoundId() {
		return this.roundId;
	}
	public void setRoundId(String roundId) {
		this.roundId = roundId;
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
