package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MonoRecordDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.getmonorecording.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:27
 */
public class AnttechOceanbaseObglobalGetmonorecordingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4582559724118456837L;

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
	 * 结果对象
	 */
	@ApiField("result")
	private MonoRecordDTO result;

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

	public void setResult(MonoRecordDTO result) {
		this.result = result;
	}
	public MonoRecordDTO getResult( ) {
		return this.result;
	}

}
