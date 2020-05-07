package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模版利益点信息
 *
 * @author auto create
 * @since 1.0, 2020-04-24 17:41:02
 */
public class TemplateProfitDTO extends AlipayObject {

	private static final long serialVersionUID = 8657799526575184475L;

	/**
	 * 利益前缀，如“立减10元”，利益前缀为：立减。支持自定义动态参数传值，但动态参数需定义为：$_r_profit_pre_desc$。利益单位与利益前缀不能同时为空。
	 */
	@ApiField("profit_pre_desc")
	private String profitPreDesc;

	/**
	 * 利益单位，如“立减10元”，利益单位为：元。支持自定义动态参数传值，但动态参数需定义为：$_r_profit_unit$。利益单位与利益前缀不能同时为空。
	 */
	@ApiField("profit_unit")
	private String profitUnit;

	/**
	 * 利益值，如“立减10元”，利益值为：10。与卡券的子类型联动使用。当产品类型为free(优惠券)时，子类型及利益点有：qualificationVoucher（资格凭证）资格表述；cycleVoucher（周期券）N天；itemVoucher（商品券）商品名称/N次/N个/N份；当产品类型为market(营销券)时，子类型及利益点有：discountVoucher（折扣券）N折；randomReduceVoucher（随机立减券）立减N元；reduceVoucher（减至券）减至N元；cashVoucher（代金券）N元；当产品类型为price(兑换券)时，子类型及利益点有：priceVoucher（兑换券）N次/N个/N份。支持自定义动态参数传值，但动态参数需定义为：$_r_profit_value$。
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
