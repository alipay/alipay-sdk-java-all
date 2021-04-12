package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排队队列配置数据回流中队列的结构
 *
 * @author auto create
 * @since 1.0, 2019-05-16 10:39:04
 */
public class ShopQueue extends AlipayObject {

	private static final long serialVersionUID = 2146611895425715212L;

	/**
	 * 队列最大人数
	 */
	@ApiField("max_queue_num")
	private Long maxQueueNum;

	/**
	 * 队列最小人数
	 */
	@ApiField("min_queue_num")
	private Long minQueueNum;

	/**
	 * 队列描述
	 */
	@ApiField("queue_desc")
	private String queueDesc;

	/**
	 * 队列ID。作为队列唯一主键，调用方应保证此字段在同一门店内唯一。
	 */
	@ApiField("queue_id")
	private String queueId;

	/**
	 * 队列名字
	 */
	@ApiField("queue_name")
	private String queueName;

	/**
	 * 队列类型。
如NONVIP表示默认非VIP；VIP1表示VIP1队；VIP2表示VIP2队列
	 */
	@ApiField("queue_option")
	private String queueOption;

	/**
	 * 队列前缀
	 */
	@ApiField("queue_prefix")
	private String queuePrefix;

	public Long getMaxQueueNum() {
		return this.maxQueueNum;
	}
	public void setMaxQueueNum(Long maxQueueNum) {
		this.maxQueueNum = maxQueueNum;
	}

	public Long getMinQueueNum() {
		return this.minQueueNum;
	}
	public void setMinQueueNum(Long minQueueNum) {
		this.minQueueNum = minQueueNum;
	}

	public String getQueueDesc() {
		return this.queueDesc;
	}
	public void setQueueDesc(String queueDesc) {
		this.queueDesc = queueDesc;
	}

	public String getQueueId() {
		return this.queueId;
	}
	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public String getQueueName() {
		return this.queueName;
	}
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public String getQueueOption() {
		return this.queueOption;
	}
	public void setQueueOption(String queueOption) {
		this.queueOption = queueOption;
	}

	public String getQueuePrefix() {
		return this.queuePrefix;
	}
	public void setQueuePrefix(String queuePrefix) {
		this.queuePrefix = queuePrefix;
	}

}
