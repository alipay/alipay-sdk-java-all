package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deduct.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayEbppInstserviceDeductQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6781947212532189155L;

	/** 
	 * 协议支付id
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 当前任务状态: not_exist , processing , success , failed
	 */
	@ApiField("current_status")
	private String currentStatus;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 扩展字段（JSON格式）
	 */
	@ApiField("extend_field")
	private String extendField;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public String getCurrentStatus( ) {
		return this.currentStatus;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

}
