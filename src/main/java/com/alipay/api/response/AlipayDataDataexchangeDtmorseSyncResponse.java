package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.dtmorse.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-10-12 21:09:43
 */
public class AlipayDataDataexchangeDtmorseSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1395167596357855232L;

	/** 
	 * 结果扩展字段，用于补充出参内容
	 */
	@ApiField("result_extent")
	private String resultExtent;

	/** 
	 * 操作结果信息，用于标识操作是否成功。true：表示成功，false：表示失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setResultExtent(String resultExtent) {
		this.resultExtent = resultExtent;
	}
	public String getResultExtent( ) {
		return this.resultExtent;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
