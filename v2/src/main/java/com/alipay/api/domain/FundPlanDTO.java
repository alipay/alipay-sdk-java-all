package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * openId改造
 *
 * @author auto create
 * @since 1.0, 2022-12-07 15:07:44
 */
public class FundPlanDTO extends AlipayObject {

	private static final long serialVersionUID = 3346715953741835571L;

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
	 * （创建人）支付宝侧用户唯一标识<br>
补充说明：该字段与alipay.fund.jointaccount.fundplan.create请求参数中传入值保持一致
	 */
	@ApiField("creator_open_id")
	private String creatorOpenId;

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
	 * 计划创建后预计最终结束日期
（yyyy-MM-dd HH:mm:ss.SSS）
一直攒模式下无该字段返回
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 当前合花群中的自动攒计划唯一标识（与当前请求参数中传入值保持一致）
	 */
	@ApiField("fund_plan_id")
	private String fundPlanId;

	/**
	 * 金额，单位元</br>
- 定额模式固定为0</br>
- 递增模式根据用户输入决定</br>
	 */
	@ApiField("incremental_amount")
	private String incrementalAmount;

	/**
	 * 初始金额，单位元
	 */
	@ApiField("initial_amount")
	private String initialAmount;

	/**
	 * 当前计划预计下次开始执行时间（
yyyy-MM-dd HH:mm:ss.SSS）<br>
补充说明：虽然该字段精确到时分秒，但由于调拨计划数较多，会出现排队现象，具体执行时间无法保证，尽量当天上午6点-下午3点间执行完成
	 */
	@ApiField("next_execution")
	private String nextExecution;

	/**
	 * 商户侧单号（幂等字段）</br>
补充说明：</br>
与alipay.fund.jointaccount.sign开户+创建自动攒入参一致
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 转入时付款方所指定的资产信息
	 */
	@ApiField("payer_account")
	private PayerAccountDTO payerAccount;

	/**
	 * 计划模式
- FIXED ：定额模式
- INCREMENTAL ：递增模式
	 */
	@ApiField("plan_mode")
	private String planMode;

	/**
	 * 计划总调拨次数，喵喵记账侧根据用户自定义/选择时常
用户选择为每日攒，则为天数[1-365]范围内
每周攒，则为周数[1-52]范围内，
每月攒，则为月数[1-12]范围内
	 */
	@ApiField("plan_times")
	private Long planTimes;

	/**
	 * 订单备注<br>
补充说明：该字段与alipay.fund.jointaccount.fundplan.create请求参数中传入值保持一致
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 计划创建后预计首次执行日期
（yyyy-MM-dd HH:mm:ss.SSS）
历史一直攒数据无该字段返回
	 */
	@ApiField("start_date")
	private String startDate;

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

	public String getCreatorOpenId() {
		return this.creatorOpenId;
	}
	public void setCreatorOpenId(String creatorOpenId) {
		this.creatorOpenId = creatorOpenId;
	}

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFundPlanId() {
		return this.fundPlanId;
	}
	public void setFundPlanId(String fundPlanId) {
		this.fundPlanId = fundPlanId;
	}

	public String getIncrementalAmount() {
		return this.incrementalAmount;
	}
	public void setIncrementalAmount(String incrementalAmount) {
		this.incrementalAmount = incrementalAmount;
	}

	public String getInitialAmount() {
		return this.initialAmount;
	}
	public void setInitialAmount(String initialAmount) {
		this.initialAmount = initialAmount;
	}

	public String getNextExecution() {
		return this.nextExecution;
	}
	public void setNextExecution(String nextExecution) {
		this.nextExecution = nextExecution;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public PayerAccountDTO getPayerAccount() {
		return this.payerAccount;
	}
	public void setPayerAccount(PayerAccountDTO payerAccount) {
		this.payerAccount = payerAccount;
	}

	public String getPlanMode() {
		return this.planMode;
	}
	public void setPlanMode(String planMode) {
		this.planMode = planMode;
	}

	public Long getPlanTimes() {
		return this.planTimes;
	}
	public void setPlanTimes(Long planTimes) {
		this.planTimes = planTimes;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
