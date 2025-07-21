package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝代运营商业关系物理门店资产增加方式选项模型
 *
 * @author auto create
 * @since 1.0, 2023-03-15 16:44:03
 */
public class BusinessRelationShopMemberAddOption extends AlipayObject {

	private static final long serialVersionUID = 6712363548461969125L;

	/**
	 * 增加方式对应的业务值 如类型选择为TRADE_NO,则该值为订单号实际值
	 */
	@ApiField("biz_value")
	private String bizValue;

	/**
	 * 物理门店资产增加方式类型 TRADE_NO：通过订单号增加账户
	 */
	@ApiField("option_type")
	private String optionType;

	public String getBizValue() {
		return this.bizValue;
	}
	public void setBizValue(String bizValue) {
		this.bizValue = bizValue;
	}

	public String getOptionType() {
		return this.optionType;
	}
	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

}
