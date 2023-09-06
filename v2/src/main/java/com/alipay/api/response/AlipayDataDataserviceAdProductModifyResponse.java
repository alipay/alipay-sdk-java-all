package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.product.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-05 17:56:44
 */
public class AlipayDataDataserviceAdProductModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4132421794988379698L;

	/** 
	 * 是否更新成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
