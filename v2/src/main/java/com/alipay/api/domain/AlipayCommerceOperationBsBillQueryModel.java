package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营账单明细查询
 *
 * @author auto create
 * @since 1.0, 2026-07-09 19:22:31
 */
public class AlipayCommerceOperationBsBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6868263628812455218L;

	/**
	 * 上次响应返回的 `next_cursor`。在非第一次调用时，相同查询入参（`plan_id`、`start_time`、`end_time`和`page_size`）需要回传该值，用于查询表示下一页
	 */
	@ApiField("cursor")
	private String cursor;

	/**
	 * 按交易时间过滤的结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 是否返回满足条件的总条数；不传默认为 `false`；计划下账单数量较多时，count 成本较高，推荐不传；仅第一页（`cursor`字段为空时）允许传true获取总数
	 */
	@ApiField("need_count")
	private Boolean needCount;

	/**
	 * 单次返回的账单明细条数。不传时使用默认值 20；超过 100 返回参数错误
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 需要查询账单的品牌营销计划ID
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 按交易时间过滤的开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	public String getCursor() {
		return this.cursor;
	}
	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Boolean getNeedCount() {
		return this.needCount;
	}
	public void setNeedCount(Boolean needCount) {
		this.needCount = needCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}
