package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订购单延期
 *
 * @author auto create
 * @since 1.0, 2025-04-30 19:55:15
 */
public class AlipayCommerceMerchantcardExpireperiodModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7382611273863125443L;

	/**
	 * 将售卖订单的有效期延期到入参的时间点{appoint_date}，时间格式是yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("appoint_date")
	private Date appointDate;

	/**
	 * 售卖订单ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 幂等键
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 指定从第几期开始延期
	 */
	@ApiField("period")
	private Long period;

	/**
	 * 按周延期还是按月延期
	 */
	@ApiField("period_type")
	private String periodType;

	/**
	 * 【update_type=FIXED】代表延期几个周期，单位是周/月
【update_type=APPOINT】代表延期几天，单位是天
	 */
	@ApiField("period_value")
	private Long periodValue;

	/**
	 * FORWARD：正向延期，REVERSE：逆向延期，不填默认正向延期
	 */
	@ApiField("update_action")
	private String updateAction;

	/**
	 * 【注意】
周期卡：如果指定的期数已经被核销了则不允许延期；
次卡：只能使用APPOINT模式
【FIXED】将指定期数及后续期数按固定周期延；月卡、季卡必须按照月延期；周卡必须按照周延期；日卡不支持按固定周期延
【APPOINT】将指定期数及后续期数都延长{period_value}天
【RECAST】将指定期数延长{period_value}天，后续期数会自动按周期延
【SPECIFIED_FAILED_PERIOD】将指定失败期数延长到指定日期{appoint_date}
	 */
	@ApiField("update_type")
	private String updateType;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getAppointDate() {
		return this.appointDate;
	}
	public void setAppointDate(Date appointDate) {
		this.appointDate = appointDate;
	}

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPeriod() {
		return this.period;
	}
	public void setPeriod(Long period) {
		this.period = period;
	}

	public String getPeriodType() {
		return this.periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}

	public Long getPeriodValue() {
		return this.periodValue;
	}
	public void setPeriodValue(Long periodValue) {
		this.periodValue = periodValue;
	}

	public String getUpdateAction() {
		return this.updateAction;
	}
	public void setUpdateAction(String updateAction) {
		this.updateAction = updateAction;
	}

	public String getUpdateType() {
		return this.updateType;
	}
	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
