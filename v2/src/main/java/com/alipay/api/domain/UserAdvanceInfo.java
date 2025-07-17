package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户代扣垫资信息
 *
 * @author auto create
 * @since 1.0, 2019-05-20 17:35:58
 */
public class UserAdvanceInfo extends AlipayObject {

	private static final long serialVersionUID = 2117934543837518786L;

	/**
	 * 垫资查询结果：
0 查询成功
1 查询失败
如果返回查询失败，可重试
	 */
	@ApiField("consult_result")
	private String consultResult;

	/**
	 * true 代表当前时间点，支付宝停车平台准入当前用户垫资，考虑到极端情况下用户仍无法垫资，该项仅作为参考，车场服务商需自行判断用户在当前车场垫资资格。
false 代表当前时间点，支付宝停车平台不准入当前用户进行垫资
	 */
	@ApiField("user_alipay_parking_allow_advance")
	private Boolean userAlipayParkingAllowAdvance;

	/**
	 * 用户在支付宝停车平台剩余的总待还金额
	 */
	@ApiField("user_wait_repayment_amount")
	private String userWaitRepaymentAmount;

	/**
	 * 用户在支付宝停车平台总的未还垫资次数
	 */
	@ApiField("user_wait_repayment_order_count")
	private Long userWaitRepaymentOrderCount;

	public String getConsultResult() {
		return this.consultResult;
	}
	public void setConsultResult(String consultResult) {
		this.consultResult = consultResult;
	}

	public Boolean getUserAlipayParkingAllowAdvance() {
		return this.userAlipayParkingAllowAdvance;
	}
	public void setUserAlipayParkingAllowAdvance(Boolean userAlipayParkingAllowAdvance) {
		this.userAlipayParkingAllowAdvance = userAlipayParkingAllowAdvance;
	}

	public String getUserWaitRepaymentAmount() {
		return this.userWaitRepaymentAmount;
	}
	public void setUserWaitRepaymentAmount(String userWaitRepaymentAmount) {
		this.userWaitRepaymentAmount = userWaitRepaymentAmount;
	}

	public Long getUserWaitRepaymentOrderCount() {
		return this.userWaitRepaymentOrderCount;
	}
	public void setUserWaitRepaymentOrderCount(Long userWaitRepaymentOrderCount) {
		this.userWaitRepaymentOrderCount = userWaitRepaymentOrderCount;
	}

}
