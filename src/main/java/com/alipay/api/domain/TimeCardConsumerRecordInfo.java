package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 次卡消费记录
 *
 * @author auto create
 * @since 1.0, 2022-09-27 19:14:08
 */
public class TimeCardConsumerRecordInfo extends AlipayObject {

	private static final long serialVersionUID = 2374257696445555593L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 卡ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 记录ID
	 */
	@ApiField("log_id")
	private String logId;

	/**
	 * 消费记录类型
	 */
	@ApiField("log_type")
	private String logType;

	/**
	 * 外部业务标识
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 消费记录状态 已完成FINISH
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getLogId() {
		return this.logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getLogType() {
		return this.logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
