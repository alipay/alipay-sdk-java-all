package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.dtbank.banktradeinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 21:27:35
 */
public class AlipayUserDtbankBanktradeinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3399959972237544921L;

	/** 
	 * 卡类型
CREDIT：信用卡，DEBIT：借记卡
	 */
	@ApiField("bank_card_type")
	private String bankCardType;

	/** 
	 * 银行机构id
ICBC：工行，
ABC：农行，
BOC：中行,
CEB：广大银行
	 */
	@ApiField("bank_inst_id")
	private String bankInstId;

	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	public String getBankCardType( ) {
		return this.bankCardType;
	}

	public void setBankInstId(String bankInstId) {
		this.bankInstId = bankInstId;
	}
	public String getBankInstId( ) {
		return this.bankInstId;
	}

}
