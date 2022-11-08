package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.bail.operation.deposit.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-27 14:27:53
 */
public class AlipayFundBailOperationDepositCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1448519158838783188L;

	/** 
	 * 保证金协议号
	 */
	@ApiField("auth_no")
	private String authNo;

	/** 
	 * 错误码,当result_code为FAIL时，对应的错误码
	 */
	@ApiField("biz_error")
	private String bizError;

	/** 
	 * 操作创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 支付宝资金操作流水号
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 商户请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 处理结果码，代表创单是否成功。
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 请求失败时，返回的错误描述
	 */
	@ApiField("result_message")
	private String resultMessage;

	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	public String getAuthNo( ) {
		return this.authNo;
	}

	public void setBizError(String bizError) {
		this.bizError = bizError;
	}
	public String getBizError( ) {
		return this.bizError;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getOperationId( ) {
		return this.operationId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

}
