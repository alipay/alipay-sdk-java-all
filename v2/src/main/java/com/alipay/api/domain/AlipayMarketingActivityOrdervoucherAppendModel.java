package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 追加订单券活动
 *
 * @author auto create
 * @since 1.0, 2023-10-30 19:20:18
 */
public class AlipayMarketingActivityOrdervoucherAppendModel extends AlipayObject {

	private static final long serialVersionUID = 3545441546598939489L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 商户接入模式
	 */
	@ApiField("merchant_access_mode")
	private String merchantAccessMode;

	/**
	 * 外部业务单号，用作幂等控制。

幂等作用：
参数不变的情况下，再次请求返回与上一次相同的结果。

外部接入方需保证业务单号唯一。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发行券的数量。

限制：
券总预算<= 999999

特别说明：
该字段的含义是追加到的数量。
不可减少，只能增加。

code_mode=
MERCHANT_UPLOAD 的情况下，voucher_quantity 需要与导入码的总数量保持一致（即历史导入数量 + 追加导入数量）。
	 */
	@ApiField("voucher_quantity")
	private Long voucherQuantity;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMerchantAccessMode() {
		return this.merchantAccessMode;
	}
	public void setMerchantAccessMode(String merchantAccessMode) {
		this.merchantAccessMode = merchantAccessMode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getVoucherQuantity() {
		return this.voucherQuantity;
	}
	public void setVoucherQuantity(Long voucherQuantity) {
		this.voucherQuantity = voucherQuantity;
	}

}
