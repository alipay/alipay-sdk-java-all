package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.tree.get response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-14 12:02:37
 */
public class AlipayIserviceCcmSwTreeGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1729636545167446563L;

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
