package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.mobile.qrcode.manage response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayMarketingMobileQrcodeManageResponse extends AlipayResponse {

	private static final long serialVersionUID = 6727628897614636246L;

	/** 
	 * 错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 码信息
	 */
	@ApiField("qrcode")
	private String qrcode;

	/** 
	 * 二维码图片地址
	 */
	@ApiField("qrcode_img_url")
	private String qrcodeImgUrl;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回的扩展信息
	 */
	@ApiField("return_ext_data")
	private String returnExtData;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
	public String getQrcode( ) {
		return this.qrcode;
	}

	public void setQrcodeImgUrl(String qrcodeImgUrl) {
		this.qrcodeImgUrl = qrcodeImgUrl;
	}
	public String getQrcodeImgUrl( ) {
		return this.qrcodeImgUrl;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setReturnExtData(String returnExtData) {
		this.returnExtData = returnExtData;
	}
	public String getReturnExtData( ) {
		return this.returnExtData;
	}

}
