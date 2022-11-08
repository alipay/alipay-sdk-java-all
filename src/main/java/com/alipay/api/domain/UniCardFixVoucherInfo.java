package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 联营卡下的满减券。
限制：
1. 目前只支持满减券；
2. 本次只返回商家配置的券，不返回平台券。

 *
 * @author auto create
 * @since 1.0, 2022-07-22 19:55:31
 */
public class UniCardFixVoucherInfo extends AlipayObject {

	private static final long serialVersionUID = 6477742836177983421L;

	/**
	 * 券活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 面额，每张代金券可以抵扣的金额。
限制：
币种为人民币，单位为元。小数点以后最多保留两位。
取值范围:0.1<=x<=3000
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 门槛金额。该字段不填写，认为无门槛。
限制： 只有当订单金额大于等于门槛金额时券才能使用。
币种为人民币，单位为元。小数点以后最多保留两位。
设置门槛：取值范围:0.1<=x<= 50000。
如果设置了门槛金额，则必须大于等于0.1，不可以等于0
	 */
	@ApiField("floor_amount")
	private String floorAmount;

	/**
	 * 用户券id。支付宝为用户优惠券唯一分配的id。
	 */
	@ApiField("voucher_id")
	private String voucherId;

	/**
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/**
	 * 券状态：
枚举值:
SENDED:可用
USED:已核销(即完全使用),
EXPIRED:已过期(只能查询6个月内数据)
DELETED:已删除
	 */
	@ApiField("voucher_status")
	private String voucherStatus;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getFloorAmount() {
		return this.floorAmount;
	}
	public void setFloorAmount(String floorAmount) {
		this.floorAmount = floorAmount;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

	public String getVoucherStatus() {
		return this.voucherStatus;
	}
	public void setVoucherStatus(String voucherStatus) {
		this.voucherStatus = voucherStatus;
	}

}
