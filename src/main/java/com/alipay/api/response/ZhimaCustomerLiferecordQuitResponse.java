package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.liferecord.quit response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-27 16:01:50
 */
public class ZhimaCustomerLiferecordQuitResponse extends AlipayResponse {

	private static final long serialVersionUID = 6594278719172227611L;

	/** 
	 * 操作是否成功
	 */
	@ApiField("operate_success")
	private Boolean operateSuccess;

	/** 
	 * 响应码
	 */
	@ApiField("res_code")
	private String resCode;

	/** 
	 * 响应码对应编号
	 */
	@ApiField("sub_code_number")
	private Long subCodeNumber;

	/** 
	 * 提示信息
	 */
	@ApiField("sub_message")
	private String subMessage;

	/** 
	 * 调用是否成功
	 */
	@ApiField("sub_success")
	private Boolean subSuccess;

	public void setOperateSuccess(Boolean operateSuccess) {
		this.operateSuccess = operateSuccess;
	}
	public Boolean getOperateSuccess( ) {
		return this.operateSuccess;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getResCode( ) {
		return this.resCode;
	}

	public void setSubCodeNumber(Long subCodeNumber) {
		this.subCodeNumber = subCodeNumber;
	}
	public Long getSubCodeNumber( ) {
		return this.subCodeNumber;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}
	public String getSubMessage( ) {
		return this.subMessage;
	}

	public void setSubSuccess(Boolean subSuccess) {
		this.subSuccess = subSuccess;
	}
	public Boolean getSubSuccess( ) {
		return this.subSuccess;
	}

}
