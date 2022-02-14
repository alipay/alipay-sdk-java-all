package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.HbProductOrderQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditmerchant.productorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-19 17:00:41
 */
public class AlipayPcreditHuabeiPcreditmerchantProductorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5518564497149722595L;

	/** 
	 * 业务返回成功与否标志
	 */
	@ApiField("biz_success")
	private Boolean bizSuccess;

	/** 
	 * 订购查询请求对象
	 */
	@ApiField("data")
	private HbProductOrderQueryResponse data;

	/** 
	 * 业务错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 业务错误描述信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	public void setBizSuccess(Boolean bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public Boolean getBizSuccess( ) {
		return this.bizSuccess;
	}

	public void setData(HbProductOrderQueryResponse data) {
		this.data = data;
	}
	public HbProductOrderQueryResponse getData( ) {
		return this.data;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

}
