package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.liferecord.sign response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:12:44
 */
public class ZhimaCustomerLiferecordSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 8885492938585252549L;

	/** 
	 * 业务处理是否成功
	 */
	@ApiField("process_success")
	private Boolean processSuccess;

	/** 
	 * 结果code
	 */
	@ApiField("sub_code")
	private String subCode;

	/** 
	 * code对应的数值码
	 */
	@ApiField("sub_code_number")
	private Long subCodeNumber;

	/** 
	 * 异常码说明
	 */
	@ApiField("sub_message")
	private String subMessage;

	/** 
	 * 接口调用是否成功
	 */
	@ApiField("sub_success")
	private Boolean subSuccess;

	public void setProcessSuccess(Boolean processSuccess) {
		this.processSuccess = processSuccess;
	}
	public Boolean getProcessSuccess( ) {
		return this.processSuccess;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubCode( ) {
		return this.subCode;
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
