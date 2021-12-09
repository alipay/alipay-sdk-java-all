package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.activity.qualification.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-24 13:15:01
 */
public class AntMerchantExpandActivityQualificationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6671475156163115431L;

	/** 
	 * 用户无资格时的具体原因
	 */
	@ApiField("detail_msg")
	private String detailMsg;

	/** 
	 * 用户无资格时的错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 是否有资格
	 */
	@ApiField("has_qualification")
	private String hasQualification;

	public void setDetailMsg(String detailMsg) {
		this.detailMsg = detailMsg;
	}
	public String getDetailMsg( ) {
		return this.detailMsg;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setHasQualification(String hasQualification) {
		this.hasQualification = hasQualification;
	}
	public String getHasQualification( ) {
		return this.hasQualification;
	}

}
