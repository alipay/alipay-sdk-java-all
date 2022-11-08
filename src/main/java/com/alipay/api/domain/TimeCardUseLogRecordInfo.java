package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡使用记录信息
 *
 * @author auto create
 * @since 1.0, 2022-09-27 19:15:09
 */
public class TimeCardUseLogRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 2592451558342993454L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 次卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 记录id
	 */
	@ApiField("log_id")
	private String logId;

	/**
	 * 记录时间
	 */
	@ApiField("log_time")
	private String logTime;

	/**
	 * 记录类型
	 */
	@ApiField("log_type")
	private String logType;

	/**
	 * 次卡简单细心你
	 */
	@ApiField("time_card_info")
	private TimeCardSimpleItemInfo timeCardInfo;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getLogId() {
		return this.logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getLogTime() {
		return this.logTime;
	}
	public void setLogTime(String logTime) {
		this.logTime = logTime;
	}

	public String getLogType() {
		return this.logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}

	public TimeCardSimpleItemInfo getTimeCardInfo() {
		return this.timeCardInfo;
	}
	public void setTimeCardInfo(TimeCardSimpleItemInfo timeCardInfo) {
		this.timeCardInfo = timeCardInfo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
