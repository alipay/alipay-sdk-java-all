package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-21 13:26:58
 */
public class AlipayMerchantIndirectFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6616772722653489732L;

	/** 
	 * 结果值
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 描述性向
	 */
	@ApiField("result_info")
	private String resultInfo;

	/** 
	 * 状态标识(SU=成功/FA=失败)
	 */
	@ApiField("result_status")
	private String resultStatus;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}
	public String getResultInfo( ) {
		return this.resultInfo;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getResultStatus( ) {
		return this.resultStatus;
	}

}
