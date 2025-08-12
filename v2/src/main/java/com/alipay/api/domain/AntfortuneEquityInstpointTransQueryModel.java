package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 机构积分流水查询
 *
 * @author auto create
 * @since 1.0, 2023-01-04 13:51:07
 */
public class AntfortuneEquityInstpointTransQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8488372121648839711L;

	/**
	 * 查询流水的结束时间。与start_time的时间跨度不超过6个月
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 分页的当前页数。取值范围[1-999]
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页每页大小。取值范围[1,20]
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 查询流水的开始时间。与end_time的时间跨度不超过6个月
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 查询的积分流水类型。多个英文逗号分隔。不传或传空时，默认为全部流水。全部流水类型包括SEND_POINT：积分发放流水，TRADE_SUBTRACT：兑换使用积分流水，DIRECT_SUBTRACT：直接扣减流水。
	 */
	@ApiListField("trans_type")
	@ApiField("string")
	private List<String> transType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

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

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<String> getTransType() {
		return this.transType;
	}
	public void setTransType(List<String> transType) {
		this.transType = transType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
