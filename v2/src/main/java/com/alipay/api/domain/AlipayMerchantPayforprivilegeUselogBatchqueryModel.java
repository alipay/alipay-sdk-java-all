package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分页查询充值的消费记录
 *
 * @author auto create
 * @since 1.0, 2022-11-01 16:12:15
 */
public class AlipayMerchantPayforprivilegeUselogBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3655844466823756451L;

	/**
	 * 业务结束时间，包含该业务时间点，开始时间和结束时间不能超过一年
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 该字段已废弃，请通过 user_id 进行查询
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 查询的页数，从1开始，最大100
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 每页显示的大小，最小1，最大20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询的业务开始时间，包含起始时间点，开始时间和结束时间不能超过一年
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
