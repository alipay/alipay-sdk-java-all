package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排队信息
 *
 * @author auto create
 * @since 1.0, 2021-05-12 21:08:34
 */
public class QueueInfo extends AlipayObject {

	private static final long serialVersionUID = 3145492387821317557L;

	/**
	 * 当前叫号
	 */
	@ApiField("current_num")
	private String currentNum;

	/**
	 * 就餐人数
	 */
	@ApiField("dining_num")
	private String diningNum;

	/**
	 * 排队号
	 */
	@ApiField("queue_num")
	private String queueNum;

	/**
	 * 预计还需多少时间
	 */
	@ApiField("still_wait_time")
	private String stillWaitTime;

	/**
	 * 桌型
	 */
	@ApiField("table_type")
	private String tableType;

	/**
	 * 前面还有多少桌
	 */
	@ApiField("wait_num")
	private String waitNum;

	/**
	 * 已等待时间
	 */
	@ApiField("waiting_time")
	private String waitingTime;

	public String getCurrentNum() {
		return this.currentNum;
	}
	public void setCurrentNum(String currentNum) {
		this.currentNum = currentNum;
	}

	public String getDiningNum() {
		return this.diningNum;
	}
	public void setDiningNum(String diningNum) {
		this.diningNum = diningNum;
	}

	public String getQueueNum() {
		return this.queueNum;
	}
	public void setQueueNum(String queueNum) {
		this.queueNum = queueNum;
	}

	public String getStillWaitTime() {
		return this.stillWaitTime;
	}
	public void setStillWaitTime(String stillWaitTime) {
		this.stillWaitTime = stillWaitTime;
	}

	public String getTableType() {
		return this.tableType;
	}
	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public String getWaitNum() {
		return this.waitNum;
	}
	public void setWaitNum(String waitNum) {
		this.waitNum = waitNum;
	}

	public String getWaitingTime() {
		return this.waitingTime;
	}
	public void setWaitingTime(String waitingTime) {
		this.waitingTime = waitingTime;
	}

}
