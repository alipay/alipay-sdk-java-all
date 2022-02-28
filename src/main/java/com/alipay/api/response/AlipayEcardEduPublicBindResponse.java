package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecard.edu.public.bind response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:21
 */
public class AlipayEcardEduPublicBindResponse extends AlipayResponse {

	private static final long serialVersionUID = 3631325377193259885L;

	/** 
	 * 机构编码
	 */
	@ApiField("agent_code")
	private String agentCode;

	/** 
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/** 
	 * 成功
	 */
	@ApiField("return_code")
	private String returnCode;

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAgentCode( ) {
		return this.agentCode;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo( ) {
		return this.cardNo;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	public String getReturnCode( ) {
		return this.returnCode;
	}

}
