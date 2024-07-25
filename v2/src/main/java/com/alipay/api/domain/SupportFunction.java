package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支持的功能
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:48
 */
public class SupportFunction extends AlipayObject {

	private static final long serialVersionUID = 2688531772333359863L;

	/**
	 * 卡名称
	 */
	@ApiField("card_name")
	private String cardName;

	/**
	 * 卡类型编码，为智能卡系统的内部编码规则
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 功能，支持开卡(issue)，圈存(load)，充值转账(recharge)
	 */
	@ApiListField("function_type")
	@ApiField("string")
	private List<String> functionType;

	/**
	 * 智能卡的跳转地址
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	public String getCardName() {
		return this.cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public List<String> getFunctionType() {
		return this.functionType;
	}
	public void setFunctionType(List<String> functionType) {
		this.functionType = functionType;
	}

	public String getGotoUrl() {
		return this.gotoUrl;
	}
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

}
