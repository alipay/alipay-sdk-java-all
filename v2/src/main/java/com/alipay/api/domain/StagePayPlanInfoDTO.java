package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阶段付款计划信息模型
 *
 * @author auto create
 * @since 1.0, 2024-09-24 20:45:51
 */
public class StagePayPlanInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 3181863463486492794L;

	/**
	 * 计划买断金额，支持随时买断场景；回传当期买断金，当期买断金=当期买断价-截止到当期已支付租金；单位：元，精确到小数点后两位；
	 */
	@ApiField("plan_buyout_price")
	private String planBuyoutPrice;

	/**
	 * 阶段计划付款编号，标识第几次或第几期付款，起始值为1，多个计划需保证编号递增
	 */
	@ApiField("plan_pay_no")
	private Long planPayNo;

	/**
	 * 阶段付款计划付款金额，单位：元，精确到小数点后两位
	 */
	@ApiField("plan_pay_price")
	private String planPayPrice;

	/**
	 * 阶段付款计划付款时间，多个计划需保证付款时间递增
	 */
	@ApiField("plan_pay_time")
	private Date planPayTime;

	public String getPlanBuyoutPrice() {
		return this.planBuyoutPrice;
	}
	public void setPlanBuyoutPrice(String planBuyoutPrice) {
		this.planBuyoutPrice = planBuyoutPrice;
	}

	public Long getPlanPayNo() {
		return this.planPayNo;
	}
	public void setPlanPayNo(Long planPayNo) {
		this.planPayNo = planPayNo;
	}

	public String getPlanPayPrice() {
		return this.planPayPrice;
	}
	public void setPlanPayPrice(String planPayPrice) {
		this.planPayPrice = planPayPrice;
	}

	public Date getPlanPayTime() {
		return this.planPayTime;
	}
	public void setPlanPayTime(Date planPayTime) {
		this.planPayTime = planPayTime;
	}

}
