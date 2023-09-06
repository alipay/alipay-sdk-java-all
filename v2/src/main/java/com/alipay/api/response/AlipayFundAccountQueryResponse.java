package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ExtCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 21:46:43
 */
public class AlipayFundAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5824433531155352493L;

	/** 
	 * 账户可用余额，单位元，精确到小数点后两位。
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/** 
	 * 场景余额模式外标卡信息
	 */
	@ApiField("ext_card_info")
	private ExtCardInfo extCardInfo;

	/** 
	 * 当前支付宝账户的实时冻结余额
	 */
	@ApiField("freeze_amount")
	private String freezeAmount;

	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}
	public String getAvailableAmount( ) {
		return this.availableAmount;
	}

	public void setExtCardInfo(ExtCardInfo extCardInfo) {
		this.extCardInfo = extCardInfo;
	}
	public ExtCardInfo getExtCardInfo( ) {
		return this.extCardInfo;
	}

	public void setFreezeAmount(String freezeAmount) {
		this.freezeAmount = freezeAmount;
	}
	public String getFreezeAmount( ) {
		return this.freezeAmount;
	}

}
