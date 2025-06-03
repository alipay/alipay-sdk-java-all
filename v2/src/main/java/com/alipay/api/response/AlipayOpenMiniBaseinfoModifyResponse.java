package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.baseinfo.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-26 11:42:26
 */
public class AlipayOpenMiniBaseinfoModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5541614246753835473L;

	/** 
	 * 小程序基础信息修改结果，无开发中版本或仅有开发中版本修改立即生效，有上架版本会启动小程序信息审核，审核通过后信息修改生效。
	 */
	@ApiField("modify_status")
	private String modifyStatus;

	public void setModifyStatus(String modifyStatus) {
		this.modifyStatus = modifyStatus;
	}
	public String getModifyStatus( ) {
		return this.modifyStatus;
	}

}
