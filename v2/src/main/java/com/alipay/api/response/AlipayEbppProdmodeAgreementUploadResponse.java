package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.prodmode.agreement.upload response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:52
 */
public class AlipayEbppProdmodeAgreementUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6368517457499364861L;

	/** 
	 * true:表示上传文件成功
false:表示上传文件失败
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 上传文件成功备注说明。
	 */
	@ApiField("memo")
	private String memo;

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo( ) {
		return this.memo;
	}

}
