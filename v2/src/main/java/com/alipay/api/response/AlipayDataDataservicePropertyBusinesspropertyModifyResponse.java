package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.property.businessproperty.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 02:20:48
 */
public class AlipayDataDataservicePropertyBusinesspropertyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3584599834798548746L;

	/** 
	 * 是否修改成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
