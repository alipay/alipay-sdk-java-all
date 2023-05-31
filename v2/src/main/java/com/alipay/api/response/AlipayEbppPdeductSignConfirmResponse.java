package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.sign.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 04:31:55
 */
public class AlipayEbppPdeductSignConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 5393432364595549273L;

	/** 
	 * 支付宝代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝是否签约成功，T：成功，F:失败
	 */
	@ApiField("alipay_sign_status")
	private String alipaySignStatus;

	/** 
	 * 业务处理结果，默认9999
	 */
	@ApiField("rtn_flag")
	private String rtnFlag;

	/** 
	 * 签约处理结果文字信息，一般返回成功或失败原因
	 */
	@ApiField("rtn_msg")
	private String rtnMsg;

	/** 
	 * 流水号，用于交易跟踪，无业务意义
	 */
	@ApiField("serial_no")
	private String serialNo;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setAlipaySignStatus(String alipaySignStatus) {
		this.alipaySignStatus = alipaySignStatus;
	}
	public String getAlipaySignStatus( ) {
		return this.alipaySignStatus;
	}

	public void setRtnFlag(String rtnFlag) {
		this.rtnFlag = rtnFlag;
	}
	public String getRtnFlag( ) {
		return this.rtnFlag;
	}

	public void setRtnMsg(String rtnMsg) {
		this.rtnMsg = rtnMsg;
	}
	public String getRtnMsg( ) {
		return this.rtnMsg;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getSerialNo( ) {
		return this.serialNo;
	}

}
