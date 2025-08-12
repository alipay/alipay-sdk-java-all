package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排队队列状态
 *
 * @author auto create
 * @since 1.0, 2019-05-16 10:38:29
 */
public class ShopQueueStatus extends AlipayObject {

	private static final long serialVersionUID = 8549477528934763791L;

	/**
	 * 队列ID
	 */
	@ApiField("queue_id")
	private String queueId;

	/**
	 * 队列状态。如enable表示可取号；disable表示不可取号。
	 */
	@ApiField("queue_status")
	private String queueStatus;

	/**
	 * 当前等待人数
	 */
	@ApiField("queue_wait")
	private Long queueWait;

	/**
	 * 当前等待时间（单位：分钟）。如无法预估传-1即可。
	 */
	@ApiField("queue_wait_time")
	private Long queueWaitTime;

	public String getQueueId() {
		return this.queueId;
	}
	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public String getQueueStatus() {
		return this.queueStatus;
	}
	public void setQueueStatus(String queueStatus) {
		this.queueStatus = queueStatus;
	}

	public Long getQueueWait() {
		return this.queueWait;
	}
	public void setQueueWait(Long queueWait) {
		this.queueWait = queueWait;
	}

	public Long getQueueWaitTime() {
		return this.queueWaitTime;
	}
	public void setQueueWaitTime(Long queueWaitTime) {
		this.queueWaitTime = queueWaitTime;
	}

}
