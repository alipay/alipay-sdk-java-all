package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.searchlibrary.bai.upload response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 15:07:29
 */
public class AlipayDataIotdataSearchlibraryBaiUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8864872256827369951L;

	/** 
	 * 更新失败原因
	 */
	@ApiField("update_desc")
	private String updateDesc;

	/** 
	 * 更新是否成功
	 */
	@ApiField("update_result")
	private Boolean updateResult;

	public void setUpdateDesc(String updateDesc) {
		this.updateDesc = updateDesc;
	}
	public String getUpdateDesc( ) {
		return this.updateDesc;
	}

	public void setUpdateResult(Boolean updateResult) {
		this.updateResult = updateResult;
	}
	public Boolean getUpdateResult( ) {
		return this.updateResult;
	}

}
