package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.factoring.selleradmit.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-21 17:29:04
 */
public class MybankCreditSupplychainFactoringSelleradmitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3644721851322379143L;

	/** 
	 * 是否已提交加白申请
	 */
	@ApiField("exsit")
	private String exsit;

	/** 
	 * 不准入原因代码
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 门店不准入原因
	 */
	@ApiField("refuse_msg")
	private String refuseMsg;

	/** 
	 * 门店是否为不准入
	 */
	@ApiField("refused")
	private String refused;

	/** 
	 * 是否加白成功
	 */
	@ApiField("white")
	private String white;

	public void setExsit(String exsit) {
		this.exsit = exsit;
	}
	public String getExsit( ) {
		return this.exsit;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRefuseCode( ) {
		return this.refuseCode;
	}

	public void setRefuseMsg(String refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public String getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setRefused(String refused) {
		this.refused = refused;
	}
	public String getRefused( ) {
		return this.refused;
	}

	public void setWhite(String white) {
		this.white = white;
	}
	public String getWhite( ) {
		return this.white;
	}

}
