package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资金计划详情
 *
 * @author auto create
 * @since 1.0, 2021-09-01 14:47:18
 */
public class FundPlanForm extends AlipayObject {

	private static final long serialVersionUID = 8824595857167662488L;

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

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
