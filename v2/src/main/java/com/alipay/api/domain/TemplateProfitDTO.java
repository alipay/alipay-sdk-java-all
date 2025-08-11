package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版利益点信息
 *
 * @author auto create
 * @since 1.0, 2020-09-03 15:40:07
 */
public class TemplateProfitDTO extends AlipayObject {

	private static final long serialVersionUID = 8459929265462623769L;

	/**
	 * 利益前缀，如“立减10元”，利益前缀为：立减。随机立减券、减至券不填会使用默认值，其它类型可空。支持自定义动态参数传值，但动态参数需定义为：$_r_profit_pre_desc$。
	 */
	@ApiField("profit_pre_desc")
	private String profitPreDesc;

	/**
	 * 利益单位，如“立减10元”，利益单位为：元。除商品券、兑换券可空之外，其它类型不填均有默认值。支持自定义动态参数传值，但动态参数需定义为：$_r_profit_unit$。
	 */
	@ApiField("profit_unit")
	private String profitUnit;

	/**
	 * 利益值，如“立减10元”，利益值为：10。与卡券的子类型联动使用。除商品券、随机立减券、兑换券可自定义文案之外，其它类型利益值均限制为数字。支持自定义动态参数传值，但动态参数需定义为：$_r_profit_value$。
	 */
	@ApiField("profit_value")
	private String profitValue;

	public String getProfitPreDesc() {
		return this.profitPreDesc;
	}
	public void setProfitPreDesc(String profitPreDesc) {
		this.profitPreDesc = profitPreDesc;
	}

	public String getProfitUnit() {
		return this.profitUnit;
	}
	public void setProfitUnit(String profitUnit) {
		this.profitUnit = profitUnit;
	}

	public String getProfitValue() {
		return this.profitValue;
	}
	public void setProfitValue(String profitValue) {
		this.profitValue = profitValue;
	}

}
