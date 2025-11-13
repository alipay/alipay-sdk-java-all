package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.cardbin.private.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:01
 */
public class AlipayFinancialnetAuthCardbinPrivateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5712278143453355794L;

	/** 
	 * 卡类型，CC为信用卡，DC为借记卡
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 机构ID
	 */
	@ApiField("inst_id")
	private String instId;

	/** 
	 * 机构名称
	 */
	@ApiField("inst_name")
	private String instName;

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}
	public String getInstName( ) {
		return this.instName;
	}

}
