package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.rarename.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:12
 */
public class AlipayUserCertifyRarenameTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8888833416485837318L;

	/** 
	 * 结果姓名列表，多个姓名之间用逗号分隔。
	 */
	@ApiField("ret_name_list")
	private String retNameList;

	public void setRetNameList(String retNameList) {
		this.retNameList = retNameList;
	}
	public String getRetNameList( ) {
		return this.retNameList;
	}

}
