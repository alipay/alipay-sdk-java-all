package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.tree.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-26 15:20:17
 */
public class AlipayIserviceCcmSwTreeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7796489129944589553L;

	/** 
	 * 类目树字符串
	 */
	@ApiField("tree")
	private String tree;

	public void setTree(String tree) {
		this.tree = tree;
	}
	public String getTree( ) {
		return this.tree;
	}

}
