package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.order.istdcancel.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-27 22:00:38
 */
public class AlipayCommerceLogisticsOrderIstdcancelPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 5626318193983385218L;

	/** 
	 * 是否允许取消
	 */
	@ApiField("allow_cancel")
	private Boolean allowCancel;

	/** 
	 * 即时配送公司返回的错误码
	 */
	@ApiField("third_error_code")
	private String thirdErrorCode;

	/** 
	 * 即时配送公司返回的错误描述
	 */
	@ApiField("third_error_msg")
	private String thirdErrorMsg;

	public void setAllowCancel(Boolean allowCancel) {
		this.allowCancel = allowCancel;
	}
	public Boolean getAllowCancel( ) {
		return this.allowCancel;
	}

	public void setThirdErrorCode(String thirdErrorCode) {
		this.thirdErrorCode = thirdErrorCode;
	}
	public String getThirdErrorCode( ) {
		return this.thirdErrorCode;
	}

	public void setThirdErrorMsg(String thirdErrorMsg) {
		this.thirdErrorMsg = thirdErrorMsg;
	}
	public String getThirdErrorMsg( ) {
		return this.thirdErrorMsg;
	}

}
