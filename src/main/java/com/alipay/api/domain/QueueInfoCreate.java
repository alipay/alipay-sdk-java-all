package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排队信息。仅order_type=queue有效。
 *
 * @author auto create
 * @since 1.0, 2019-03-25 18:52:41
 */
public class QueueInfoCreate extends AlipayObject {

	private static final long serialVersionUID = 3843595852894647251L;

	/**
	 * 队列ID
	 */
	@ApiField("queue_id")
	private String queueId;

	/**
	 * 订单排队号
	 */
	@ApiField("queue_no")
	private String queueNo;

	/**
	 * 当前等待人数
	 */
	@ApiField("queue_wait")
	private Long queueWait;

	/**
	 * 预计等待时间（单位：分钟）
	 */
	@ApiField("queue_wait_time")
	private Long queueWaitTime;

	public String getQueueId() {
		return this.queueId;
	}
	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public String getQueueNo() {
		return this.queueNo;
	}
	public void setQueueNo(String queueNo) {
		this.queueNo = queueNo;
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
