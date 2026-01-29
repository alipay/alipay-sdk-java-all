package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员规则
 *
 * @author auto create
 * @since 1.0, 2023-11-13 16:35:58
 */
public class MemberRule extends AlipayObject {

	private static final long serialVersionUID = 3641673394555256156L;

	/**
	 * 指定周期模式适用。指定时间到期
	 */
	@ApiField("appoint_date")
	private String appointDate;

	/**
	 * 超时自动结算时间, 小于等于15
	 */
	@ApiField("auto_settlement_time")
	private String autoSettlementTime;

	/**
	 * 固定周期模式适用。
固定到期时间，存自然日，[1,28]。如填3号，当前2号，则到期时间为本月3号; 当前5号，到期时间为下月3号。
	 */
	@ApiField("fix_date")
	private String fixDate;

	/**
	 * 冻结金额，周期扣需要传担保和储值金额，且冻结金额 = 担保金额 + 储值金额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	/**
	 * 拼团规则
	 */
	@ApiField("groupon_rule")
	private GrouponRule grouponRule;

	/**
	 * 周期扣担保金额部分
	 */
	@ApiField("guarantee_amount")
	private String guaranteeAmount;

	/**
	 * 会员周期，小于367
	 */
	@ApiField("member_period")
	private String memberPeriod;

	/**
	 * 承诺模式最低消费金额，承诺消费金额下不可空
	 */
	@ApiField("min_consumer_amount")
	private String minConsumerAmount;

	/**
	 * 承诺模式最低消费次数，承诺消费次数下不可空
	 */
	@ApiField("min_consumer_times")
	private String minConsumerTimes;

	/**
	 * 原价
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/**
	 * RELATIVE_DATE，相对日期，n*24模式；
ABSOLATE_DATE，自然日模式（当日起计算）；
ABSOLUTE_PLUS_1_DATE，自然日模式（当天不算）；
FIX_DATE，每月固定日期到期[1,28]，自然月模式；
APPOINT_DATE，指定时间到期;
	 */
	@ApiField("period_mode")
	private String periodMode;

	/**
	 * 承诺模式必传。承诺条件。AMOUNT_SINGLE，金额满足条件。TIMES_SINGLE，次数满足条件。
	 */
	@ApiField("promise_condition")
	private String promiseCondition;

	/**
	 * 承诺模式必传。SINGLE，满足单一条件。
	 */
	@ApiField("promise_type")
	private String promiseType;

	/**
	 * 承诺会员文案，描述承诺任务
	 */
	@ApiField("promise_type_desc")
	private String promiseTypeDesc;

	/**
	 * 结算类型，承诺模式必传。
MEMBER_SETTLEMENT，按定价结算；
BENEFIT_SETTLEMENT，按权益金额结算；
	 */
	@ApiField("settlement_type")
	private String settlementType;

	/**
	 * 周期扣储值金额部分
	 */
	@ApiField("store_amount")
	private String storeAmount;

	public String getAppointDate() {
		return this.appointDate;
	}
	public void setAppointDate(String appointDate) {
		this.appointDate = appointDate;
	}

	public String getAutoSettlementTime() {
		return this.autoSettlementTime;
	}
	public void setAutoSettlementTime(String autoSettlementTime) {
		this.autoSettlementTime = autoSettlementTime;
	}

	public String getFixDate() {
		return this.fixDate;
	}
	public void setFixDate(String fixDate) {
		this.fixDate = fixDate;
	}

	public String getFreezeAmount() {
		return this.freezeAmount;
	}
	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}

	public GrouponRule getGrouponRule() {
		return this.grouponRule;
	}
	public void setGrouponRule(GrouponRule grouponRule) {
		this.grouponRule = grouponRule;
	}

	public String getGuaranteeAmount() {
		return this.guaranteeAmount;
	}
	public void setGuaranteeAmount(String guaranteeAmount) {
		this.guaranteeAmount = guaranteeAmount;
	}

	public String getMemberPeriod() {
		return this.memberPeriod;
	}
	public void setMemberPeriod(String memberPeriod) {
		this.memberPeriod = memberPeriod;
	}

	public String getMinConsumerAmount() {
		return this.minConsumerAmount;
	}
	public void setMinConsumerAmount(String minConsumerAmount) {
		this.minConsumerAmount = minConsumerAmount;
	}

	public String getMinConsumerTimes() {
		return this.minConsumerTimes;
	}
	public void setMinConsumerTimes(String minConsumerTimes) {
		this.minConsumerTimes = minConsumerTimes;
	}

	public String getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getPeriodMode() {
		return this.periodMode;
	}
	public void setPeriodMode(String periodMode) {
		this.periodMode = periodMode;
	}

	public String getPromiseCondition() {
		return this.promiseCondition;
	}
	public void setPromiseCondition(String promiseCondition) {
		this.promiseCondition = promiseCondition;
	}

	public String getPromiseType() {
		return this.promiseType;
	}
	public void setPromiseType(String promiseType) {
		this.promiseType = promiseType;
	}

	public String getPromiseTypeDesc() {
		return this.promiseTypeDesc;
	}
	public void setPromiseTypeDesc(String promiseTypeDesc) {
		this.promiseTypeDesc = promiseTypeDesc;
	}

	public String getSettlementType() {
		return this.settlementType;
	}
	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public String getStoreAmount() {
		return this.storeAmount;
	}
	public void setStoreAmount(String storeAmount) {
		this.storeAmount = storeAmount;
	}

}
