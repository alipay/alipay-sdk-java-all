package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 计费信息列表
 *
 * @author auto create
 * @since 1.0, 2024-09-26 18:30:35
 */
public class IndustryChargeInfo extends AlipayObject {

	private static final long serialVersionUID = 4431723763296428843L;

	/**
	 * 实收费用。单位：元。
	 */
	@ApiField("charge_fee")
	private String chargeFee;

	/**
	 * 收单手续费trade，花呗分期手续hbfq，其他手续费charge
	 */
	@ApiField("charge_type")
	private String chargeType;

	/**
	 * 是否合约指定收费账号出资，值为"Y"或"N"
	 */
	@ApiField("is_rating_on_switch")
	private String isRatingOnSwitch;

	/**
	 * 是否收款账号出资，值为"Y"或"N"
	 */
	@ApiField("is_rating_on_trade_receiver")
	private String isRatingOnTradeReceiver;

	/**
	 * 原始费用。单位：元。
	 */
	@ApiField("original_charge_fee")
	private String originalChargeFee;

	/**
	 * 组合支付收费明细
	 */
	@ApiListField("sub_fee_detail_list")
	@ApiField("industry_sub_fee")
	private List<IndustrySubFee> subFeeDetailList;

	/**
	 * 签约费率
	 */
	@ApiField("switch_fee_rate")
	private String switchFeeRate;

	public String getChargeFee() {
		return this.chargeFee;
	}
	public void setChargeFee(String chargeFee) {
		this.chargeFee = chargeFee;
	}

	public String getChargeType() {
		return this.chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getIsRatingOnSwitch() {
		return this.isRatingOnSwitch;
	}
	public void setIsRatingOnSwitch(String isRatingOnSwitch) {
		this.isRatingOnSwitch = isRatingOnSwitch;
	}

	public String getIsRatingOnTradeReceiver() {
		return this.isRatingOnTradeReceiver;
	}
	public void setIsRatingOnTradeReceiver(String isRatingOnTradeReceiver) {
		this.isRatingOnTradeReceiver = isRatingOnTradeReceiver;
	}

	public String getOriginalChargeFee() {
		return this.originalChargeFee;
	}
	public void setOriginalChargeFee(String originalChargeFee) {
		this.originalChargeFee = originalChargeFee;
	}

	public List<IndustrySubFee> getSubFeeDetailList() {
		return this.subFeeDetailList;
	}
	public void setSubFeeDetailList(List<IndustrySubFee> subFeeDetailList) {
		this.subFeeDetailList = subFeeDetailList;
	}

	public String getSwitchFeeRate() {
		return this.switchFeeRate;
	}
	public void setSwitchFeeRate(String switchFeeRate) {
		this.switchFeeRate = switchFeeRate;
	}

}
