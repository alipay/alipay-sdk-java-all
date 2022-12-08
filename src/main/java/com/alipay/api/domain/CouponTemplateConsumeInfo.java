package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 红包模板消耗信息
 *
 * @author auto create
 * @since 1.0, 2021-12-10 14:56:47
 */
public class CouponTemplateConsumeInfo extends AlipayObject {

	private static final long serialVersionUID = 5711818885164416985L;

	/**
	 * 该活动上已领取红包金额，分为单位
999代表已领取9.99元

请注意：该结果可能存在2个小时之内的时间延迟，特殊情况下可能延迟会更久
	 */
	@ApiField("receive_amount")
	private Long receiveAmount;

	/**
	 * 该活动上已领取红包数量
比如:999代表该活上已被领取999个红包
请注意：该结果可能存在2个小时之内的时间延迟，特殊情况下可能延迟会更久
	 */
	@ApiField("receive_count")
	private Long receiveCount;

	/**
	 * 该活动上已退款的红包总金额，分为单位
999代表总共退款9.99元

请注意：该结果可能存在2个小时之内的时间延迟，特殊情况下可能延迟会更久
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/**
	 * 该活动上已核销红包金额，分为单位
888代表已领取8.88元

请注意：该结果可能存在2个小时之内的时间延迟，特殊情况下可能延迟会更久
	 */
	@ApiField("used_amount")
	private Long usedAmount;

	/**
	 * 该活动上已核销红包数量
比如:888代表该活上所有领取的红包中已核销了888个红包
请注意：该结果可能存在2个小时之内的时间延迟，特殊情况下可能延迟会更久
	 */
	@ApiField("used_count")
	private Long usedCount;

	public Long getReceiveAmount() {
		return this.receiveAmount;
	}
	public void setReceiveAmount(Long receiveAmount) {
		this.receiveAmount = receiveAmount;
	}

	public Long getReceiveCount() {
		return this.receiveCount;
	}
	public void setReceiveCount(Long receiveCount) {
		this.receiveCount = receiveCount;
	}

	public Long getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Long getUsedAmount() {
		return this.usedAmount;
	}
	public void setUsedAmount(Long usedAmount) {
		this.usedAmount = usedAmount;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

}
