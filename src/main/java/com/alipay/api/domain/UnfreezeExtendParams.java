package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻Go解冻业务拓展信息
 *
 * @author auto create
 * @since 1.0, 2021-02-25 11:31:11
 */
public class UnfreezeExtendParams extends AlipayObject {

	private static final long serialVersionUID = 3889723352841559267L;

	/**
	 * 退出类型
	 */
	@ApiField("quit_type")
	private String quitType;

	/**
	 * 芝麻Go开始到到期过程中享受的优惠总金额
	 */
	@ApiField("total_discount_amount")
	private String totalDiscountAmount;

	/**
	 * 芝麻Go开始到到期过程中任务相关支付的总金额。
	 */
	@ApiField("total_real_pay_amount")
	private String totalRealPayAmount;

	/**
	 * 芝麻Go开始到到期过程中和任务相关的完成次数
	 */
	@ApiField("total_task_count")
	private String totalTaskCount;

	public String getQuitType() {
		return this.quitType;
	}
	public void setQuitType(String quitType) {
		this.quitType = quitType;
	}

	public String getTotalDiscountAmount() {
		return this.totalDiscountAmount;
	}
	public void setTotalDiscountAmount(String totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}

	public String getTotalRealPayAmount() {
		return this.totalRealPayAmount;
	}
	public void setTotalRealPayAmount(String totalRealPayAmount) {
		this.totalRealPayAmount = totalRealPayAmount;
	}

	public String getTotalTaskCount() {
		return this.totalTaskCount;
	}
	public void setTotalTaskCount(String totalTaskCount) {
		this.totalTaskCount = totalTaskCount;
	}

}
