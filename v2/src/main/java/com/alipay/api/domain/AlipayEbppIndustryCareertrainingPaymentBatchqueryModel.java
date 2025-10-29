package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询职业培训缴费信息
 *
 * @author auto create
 * @since 1.0, 2025-08-26 19:07:36
 */
public class AlipayEbppIndustryCareertrainingPaymentBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3737669245291815685L;

	/**
	 * bizType=COURSE，课程id
bizType=EXAM，评价id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * COURSE-课程、EXAM-评价
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 用户Id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 用户Id
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
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

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
