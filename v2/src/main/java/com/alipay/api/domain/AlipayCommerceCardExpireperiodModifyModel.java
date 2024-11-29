package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 延期
 *
 * @author auto create
 * @since 1.0, 2024-02-28 09:52:23
 */
public class AlipayCommerceCardExpireperiodModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2431288665538954395L;

	/**
	 * 当industry_solution_type为TIMES_CARD时使用、代表将原有的有效期延期到这个时间点
	 */
	@ApiField("appoint_date")
	private Date appointDate;

	/**
	 * 卡id
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 行业方案类型
	 */
	@ApiField("industry_solution_type")
	private String industrySolutionType;

	/**
	 * 用户id
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
	 * 当industry_solution_type为PERIOD_PAY的时候并且update_type为FIXED的时候代表顺延几周或者几个月；当industry_solution_type为PERIOD_PAY的时候并且update_type为APPOINT的时候代表从第几期向后延多少天
	 */
	@ApiField("period_value")
	private Long periodValue;

	/**
	 * 延期模式
	 */
	@ApiField("update_type")
	private String updateType;

	/**
	 * 用户id
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

	public String getIndustrySolutionType() {
		return this.industrySolutionType;
	}
	public void setIndustrySolutionType(String industrySolutionType) {
		this.industrySolutionType = industrySolutionType;
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
