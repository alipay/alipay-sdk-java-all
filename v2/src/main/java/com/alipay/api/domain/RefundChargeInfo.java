package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退费信息
 *
 * @author auto create
 * @since 1.0, 2022-11-14 17:49:49
 */
public class RefundChargeInfo extends AlipayObject {

	private static final long serialVersionUID = 4881934585529317734L;

	/**
	 * 收单手续费trade，花呗分期手续hbfq，其他手续费charge
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 实退费用
	 */
	@ApiField("refund_charge_fee")
	private String refundChargeFee;

	/**
	 * 组合支付退费明细
	 */
	@ApiListField("refund_sub_fee_detail_list")
	@ApiField("refund_sub_fee")
	private List<RefundSubFee> refundSubFeeDetailList;

	/**
	 * 签约费率
	 */
	@ApiField("switch_fee_rate")
	private String switchFeeRate;

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getRefundChargeFee() {
		return this.refundChargeFee;
	}
	public void setRefundChargeFee(String refundChargeFee) {
		this.refundChargeFee = refundChargeFee;
	}

	public List<RefundSubFee> getRefundSubFeeDetailList() {
		return this.refundSubFeeDetailList;
	}
	public void setRefundSubFeeDetailList(List<RefundSubFee> refundSubFeeDetailList) {
		this.refundSubFeeDetailList = refundSubFeeDetailList;
	}

	public String getSwitchFeeRate() {
		return this.switchFeeRate;
	}
	public void setSwitchFeeRate(String switchFeeRate) {
		this.switchFeeRate = switchFeeRate;
	}

}
