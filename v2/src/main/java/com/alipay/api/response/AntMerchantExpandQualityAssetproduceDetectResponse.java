package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ContentInfo;
import com.alipay.api.domain.ContentErrorInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.quality.assetproduce.detect response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-27 14:42:41
 */
public class AntMerchantExpandQualityAssetproduceDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 6676561469672794844L;

	/** 
	 * 品检内容
	 */
	@ApiField("detect_content_info")
	private ContentInfo detectContentInfo;

	/** 
	 * 品检错误码信息
	 */
	@ApiField("detect_error_code")
	private String detectErrorCode;

	/** 
	 * 品检错误描述
	 */
	@ApiField("detect_error_desc")
	private String detectErrorDesc;

	/** 
	 * 品检错误详情，里边有具体的每一行错误信息，包括错误字段，错误值
	 */
	@ApiField("detect_error_info")
	private ContentErrorInfo detectErrorInfo;

	/** 
	 * 品检成功标识
	 */
	@ApiField("detect_success")
	private Boolean detectSuccess;

	public void setDetectContentInfo(ContentInfo detectContentInfo) {
		this.detectContentInfo = detectContentInfo;
	}
	public ContentInfo getDetectContentInfo( ) {
		return this.detectContentInfo;
	}

	public void setDetectErrorCode(String detectErrorCode) {
		this.detectErrorCode = detectErrorCode;
	}
	public String getDetectErrorCode( ) {
		return this.detectErrorCode;
	}

	public void setDetectErrorDesc(String detectErrorDesc) {
		this.detectErrorDesc = detectErrorDesc;
	}
	public String getDetectErrorDesc( ) {
		return this.detectErrorDesc;
	}

	public void setDetectErrorInfo(ContentErrorInfo detectErrorInfo) {
		this.detectErrorInfo = detectErrorInfo;
	}
	public ContentErrorInfo getDetectErrorInfo( ) {
		return this.detectErrorInfo;
	}

	public void setDetectSuccess(Boolean detectSuccess) {
		this.detectSuccess = detectSuccess;
	}
	public Boolean getDetectSuccess( ) {
		return this.detectSuccess;
	}

}
