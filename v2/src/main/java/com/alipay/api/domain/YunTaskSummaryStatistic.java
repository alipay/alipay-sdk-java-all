package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家管理员/店长/店员查看业绩汇总数据
 *
 * @author auto create
 * @since 1.0, 2024-04-24 10:06:52
 */
public class YunTaskSummaryStatistic extends AlipayObject {

	private static final long serialVersionUID = 5433194473992871737L;

	/**
	 * 激活门店总量
	 */
	@ApiField("active_shop_cnt")
	private Long activeShopCnt;

	/**
	 * 店员绑定总量
	 */
	@ApiField("bind_hunter_cnt")
	private Long bindHunterCnt;

	/**
	 * 任务激励总积分
	 */
	@ApiField("task_incentive_amount")
	private Long taskIncentiveAmount;

	/**
	 * 任务激励总量
	 */
	@ApiField("task_incentive_cnt")
	private Long taskIncentiveCnt;

	/**
	 * 任务领取总量
	 */
	@ApiField("task_receive_cnt")
	private Long taskReceiveCnt;

	/**
	 * 任务发布总量
	 */
	@ApiField("task_total_cnt")
	private Long taskTotalCnt;

	public Long getActiveShopCnt() {
		return this.activeShopCnt;
	}
	public void setActiveShopCnt(Long activeShopCnt) {
		this.activeShopCnt = activeShopCnt;
	}

	public Long getBindHunterCnt() {
		return this.bindHunterCnt;
	}
	public void setBindHunterCnt(Long bindHunterCnt) {
		this.bindHunterCnt = bindHunterCnt;
	}

	public Long getTaskIncentiveAmount() {
		return this.taskIncentiveAmount;
	}
	public void setTaskIncentiveAmount(Long taskIncentiveAmount) {
		this.taskIncentiveAmount = taskIncentiveAmount;
	}

	public Long getTaskIncentiveCnt() {
		return this.taskIncentiveCnt;
	}
	public void setTaskIncentiveCnt(Long taskIncentiveCnt) {
		this.taskIncentiveCnt = taskIncentiveCnt;
	}

	public Long getTaskReceiveCnt() {
		return this.taskReceiveCnt;
	}
	public void setTaskReceiveCnt(Long taskReceiveCnt) {
		this.taskReceiveCnt = taskReceiveCnt;
	}

	public Long getTaskTotalCnt() {
		return this.taskTotalCnt;
	}
	public void setTaskTotalCnt(Long taskTotalCnt) {
		this.taskTotalCnt = taskTotalCnt;
	}

}
