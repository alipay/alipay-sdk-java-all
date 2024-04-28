package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.rarename.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:29:04
 */
public class AlipayUserCertifyRarenameTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 3318497778285237383L;

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
