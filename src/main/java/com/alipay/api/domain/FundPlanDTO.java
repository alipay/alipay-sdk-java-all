package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金计划
 *
 * @author auto create
 * @since 1.0, 2021-09-01 14:48:08
 */
public class FundPlanDTO extends AlipayObject {

	private static final long serialVersionUID = 1676424613339452237L;

	/**
	 * 合花群ID（与当前请求参数中传入值保持一致）
	 */
	@ApiField("account_id")
	private String accountId;

	/**
	 * 转入金额（单位为元，必须大于0且最多小数点后两位）<br>
- 补充说明：该字段与alipay.fund.jointaccount.fundplan.create请求参数中传入值保持一致
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 转入周期类型，需要与date字段配合计算传入时间<br>
- DAILY：每天<br>
- WEEKLY：每周<br>
- MONTHLY：每月<br>
补充说明：该字段与alipay.fund.jointaccount.fundplan.create请求参数中传入值保持一致
	 */
	@ApiField("calendar_type")
	private String calendarType;

	/**
	 * （创建人）支付宝侧用户唯一标识<br>
补充说明：该字段与alipay.fund.jointaccount.fundplan.create请求参数中传入值保持一致
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 转入周期值，需要与calendar_type字段配合计算传入时间<br>
- 当calendar_type=DAILY时，该字段不填，表示每天（上午6点-下午3点间）会执行调拨任务进行资金转入操作<br>
- 当calendar_type=WEEKLY时，该字段为必填（可选值为1-7），对应表示每周星期一或每周星期天（上午6点-下午3点间），会执行调拨任务进行资金转入操作<br>
- 当calendar_type=MONTHLY时，该字段为必填（可选值为1-28），对应表示每月一号或每月28号（上午6点-下午3点间），会执行调拨任务进行资金转入操作<br>
补充说明：该字段与alipay.fund.jointaccount.fundplan.create请求参数中传入值保持一致
	 */
	@ApiField("date")
	private String date;

	/**
	 * 当前合花群中的自动攒计划唯一标识（与当前请求参数中传入值保持一致）
	 */
	@ApiField("fund_plan_id")
	private String fundPlanId;

	/**
	 * 当前计划预计下次开始执行时间（
yyyy-MM-dd HH:mm:ss.SSS）<br>
补充说明：虽然该字段精确到时分秒，但由于调拨计划数较多，会出现排队现象，具体执行时间无法保证，尽量当天上午6点-下午3点间执行完成
	 */
	@ApiField("next_execution")
	private String nextExecution;

	/**
	 * 转入时付款方所指定的资产信息
	 */
	@ApiField("payer_account")
	private PayerAccountDTO payerAccount;

	/**
	 * 订单备注<br>
补充说明：该字段与alipay.fund.jointaccount.fundplan.create请求参数中传入值保持一致
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 计划状态<br>
- VALIDATE：正常生效中<br>
- PAUSE 暂停中<br>
- CLOSED 已删除
	 */
	@ApiField("status")
	private String status;

	public String getAccountId() {
		return this.accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCalendarType() {
		return this.calendarType;
	}
	public void setCalendarType(String calendarType) {
		this.calendarType = calendarType;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getFundPlanId() {
		return this.fundPlanId;
	}
	public void setFundPlanId(String fundPlanId) {
		this.fundPlanId = fundPlanId;
	}

	public String getNextExecution() {
		return this.nextExecution;
	}
	public void setNextExecution(String nextExecution) {
		this.nextExecution = nextExecution;
	}

	public PayerAccountDTO getPayerAccount() {
		return this.payerAccount;
	}
	public void setPayerAccount(PayerAccountDTO payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
