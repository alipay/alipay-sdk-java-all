package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.leadsmember.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-07 15:28:53
 */
public class AnttechOceanbaseObglobalLeadsmemberModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4323468251662385439L;

	/** 
	 * 业务错误码
	 */
	@ApiField("biz_error_code")
	private String bizErrorCode;

	/** 
	 * 业务错误信息
	 */
	@ApiField("biz_error_msg")
	private String bizErrorMsg;

	/** 
	 * 业务是否成功
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 业务结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setBizErrorCode(String bizErrorCode) {
		this.bizErrorCode = bizErrorCode;
	}
	public String getBizErrorCode( ) {
		return this.bizErrorCode;
	}

	public void setBizErrorMsg(String bizErrorMsg) {
		this.bizErrorMsg = bizErrorMsg;
	}
	public String getBizErrorMsg( ) {
		return this.bizErrorMsg;
	}

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
