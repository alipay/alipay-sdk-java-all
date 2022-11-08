package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务奖品信息
 *
 * @author auto create
 * @since 1.0, 2022-06-24 11:58:23
 */
public class TaskPrizeInfo extends AlipayObject {

	private static final long serialVersionUID = 7314887765681614986L;

	/**
	 * 奖品实例id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品模版id
	 */
	@ApiField("prize_template_id")
	private String prizeTemplateId;

	/**
	 * 奖品类型（VOUCHER-支付券）
	 */
	@ApiField("prize_type")
	private String prizeType;

	/**
	 * 任务事件id，任务事件类型是TRADE_SOURCE时，为支付宝交易号
	 */
	@ApiField("task_event_id")
	private String taskEventId;

	/**
	 * 任务事件类型（TRADE_SOURCE-交易事件）
	 */
	@ApiField("task_event_type")
	private String taskEventType;

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeTemplateId() {
		return this.prizeTemplateId;
	}
	public void setPrizeTemplateId(String prizeTemplateId) {
		this.prizeTemplateId = prizeTemplateId;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

	public String getTaskEventId() {
		return this.taskEventId;
	}
	public void setTaskEventId(String taskEventId) {
		this.taskEventId = taskEventId;
	}

	public String getTaskEventType() {
		return this.taskEventType;
	}
	public void setTaskEventType(String taskEventType) {
		this.taskEventType = taskEventType;
	}

}
