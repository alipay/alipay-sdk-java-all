package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金转入计划详情
 *
 * @author auto create
 * @since 1.0, 2025-06-30 21:38:56
 */
public class FundPlanForm extends AlipayObject {

	private static final long serialVersionUID = 7829368794338658719L;

	/**
	 * 自动充值金额（单位为元，必须大于0且最多小数点后两位）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 转入周期类型，需要与date字段配合计算传入时间<br>
- DAILY：每天<br>
- WEEKLY：每周<br>
- MONTHLY：每月
	 */
	@ApiField("calendar_type")
	private String calendarType;

	/**
	 * 转入周期值，需要与calendar_type字段配合计算传入时间<br>
- 当calendar_type=DAILY时，该字段不填，表示每天（上午6点-下午3点间）会执行调拨任务进行资金转入操作<br>
- 当calendar_type=WEEKLY时，该字段为必填（可选值为1-7），1对应表示星期天，2对应标识星期一，7对应标识星期六，当天（上午6点-下午3点间）会执行调拨任务进行资金转入操作<br>
- 当calendar_type=MONTHLY时，该字段为必填（可选值为1-28），1对应表示1号，28对应表示28号，当天（上午6点-下午3点间）会执行调拨任务进行资金转入操作
	 */
	@ApiField("date")
	private String date;

	/**
	 * 金额，单位元</br>
定额模式固定为0</br>
递增模式根据用户输入决定</br>
	 */
	@ApiField("incremental_amount")
	private String incrementalAmount;

	/**
	 * 商户侧单号（幂等字段）</br>
补充说明：自动攒场景幂等逻辑（商户appid+out_biz_no），商户集成时需注意，如换号重复发起，则认为是一笔新的请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 计划模式</br>
FIXED ：定额模式</br>
INCREMENTAL ：递增模式
	 */
	@ApiField("plan_mode")
	private String planMode;

	/**
	 * 计划总调拨次数，商户侧根据用户自定义/选择时长传递</br>
用户选择为每日攒，则为天数[1-365]范围内</br>
每周攒，则为周数[1-52]范围内，</br>
每月攒，则为月数[1-12]范围内</br>
	 */
	@ApiField("plan_times")
	private Long planTimes;

	/**
	 * 订单备注，长度超长会拒绝交易，可包括数字、字母、空格、汉字，但不能包括特殊字符、emoji等
	 */
	@ApiField("remark")
	private String remark;

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

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getIncrementalAmount() {
		return this.incrementalAmount;
	}
	public void setIncrementalAmount(String incrementalAmount) {
		this.incrementalAmount = incrementalAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
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

}
