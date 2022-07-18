package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.dooropenresult.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-07 10:52:15
 */
public class AlipayOpenIotmbsDooropenresultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6881772168947793191L;

	/** 
	 * 成功true失败false
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
