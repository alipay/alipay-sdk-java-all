package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FxiaokeCreateLeadsParams;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.fxiaokeleads.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-18 11:17:28
 */
public class AnttechOceanbaseObglobalFxiaokeleadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6244575931523617964L;

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
	 * 纷享销客调用海图创建商机接口成功后的返回值
	 */
	@ApiField("result")
	private FxiaokeCreateLeadsParams result;

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

	public void setResult(FxiaokeCreateLeadsParams result) {
		this.result = result;
	}
	public FxiaokeCreateLeadsParams getResult( ) {
		return this.result;
	}

}
