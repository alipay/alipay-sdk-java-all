package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FxiaokeCreateCustomerResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.customer.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-31 16:57:35
 */
public class AnttechOceanbaseObglobalCustomerCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7644975967238494518L;

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
	 * 创建客户结果
	 */
	@ApiField("result")
	private FxiaokeCreateCustomerResponse result;

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

	public void setResult(FxiaokeCreateCustomerResponse result) {
		this.result = result;
	}
	public FxiaokeCreateCustomerResponse getResult( ) {
		return this.result;
	}

}
