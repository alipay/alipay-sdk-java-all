package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益信息描述
 *
 * @author auto create
 * @since 1.0, 2018-11-28 14:44:52
 */
public class MEquityInfo extends AlipayObject {

	private static final long serialVersionUID = 3546624643711438498L;

	/**
	 * 权益的展示信息，仅当equity_type=VOUCHER时，该值必填，其他类型无需设置
	 */
	@ApiField("equity_display_info")
	private MEquityDisplayInfo equityDisplayInfo;

	/**
	 * 权益类型，枚举取值：券类型：VOUCHER、立减实时优惠类型：DISCOUNT
	 */
	@ApiField("equity_type")
	private String equityType;

	/**
	 * 使用规则
	 */
	@ApiField("equity_use_rule")
	private MEquityUseRule equityUseRule;

	/**
	 * 权益的有效期信息，仅当equity_type=VOUCHER时，该值必填，其他类型无需设置
	 */
	@ApiField("equity_valid_info")
	private MEquityValidInfo equityValidInfo;

	/**
	 * 权益的价值信息
	 */
	@ApiField("equity_worth_info")
	private MEquityWorthInfo equityWorthInfo;

	public MEquityDisplayInfo getEquityDisplayInfo() {
		return this.equityDisplayInfo;
	}
	public void setEquityDisplayInfo(MEquityDisplayInfo equityDisplayInfo) {
		this.equityDisplayInfo = equityDisplayInfo;
	}

	public String getEquityType() {
		return this.equityType;
	}
	public void setEquityType(String equityType) {
		this.equityType = equityType;
	}

	public MEquityUseRule getEquityUseRule() {
		return this.equityUseRule;
	}
	public void setEquityUseRule(MEquityUseRule equityUseRule) {
		this.equityUseRule = equityUseRule;
	}

	public MEquityValidInfo getEquityValidInfo() {
		return this.equityValidInfo;
	}
	public void setEquityValidInfo(MEquityValidInfo equityValidInfo) {
		this.equityValidInfo = equityValidInfo;
	}

	public MEquityWorthInfo getEquityWorthInfo() {
		return this.equityWorthInfo;
	}
	public void setEquityWorthInfo(MEquityWorthInfo equityWorthInfo) {
		this.equityWorthInfo = equityWorthInfo;
	}

}
