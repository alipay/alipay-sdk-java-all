package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 收结易扩展字段
 *
 * @author auto create
 * @since 1.0, 2024-11-25 23:11:52
 */
public class UnifiedSettleExtendParams extends AlipayObject {

	private static final long serialVersionUID = 1589339638758758382L;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 退款原因
	 */
	@ApiField("refund_reason")
	private String refundReason;

	/**
	 * 直付通二级商户id，直付通收单模式必传
	 */
	@ApiField("second_merchant_no")
	private String secondMerchantNo;

	/**
	 * 直付通收单模式必传，目前仅支持alipay
	 */
	@ApiField("second_merchant_type")
	private String secondMerchantType;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRefundReason() {
		return this.refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	public String getSecondMerchantNo() {
		return this.secondMerchantNo;
	}
	public void setSecondMerchantNo(String secondMerchantNo) {
		this.secondMerchantNo = secondMerchantNo;
	}

	public String getSecondMerchantType() {
		return this.secondMerchantType;
	}
	public void setSecondMerchantType(String secondMerchantType) {
		this.secondMerchantType = secondMerchantType;
	}

}
