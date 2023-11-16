package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certify.rarename.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 16:56:41
 */
public class AlipayUserCertifyRarenameTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 8518727532339123694L;

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
