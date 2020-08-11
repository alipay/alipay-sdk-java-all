package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.groupkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-13 14:51:06
 */
public class AlipayCommerceEducateFacefeatureGroupkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7272199619967747193L;

	/** 
	 * 人脸库key
	 */
	@ApiField("group_key")
	private String groupKey;

	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}
	public String getGroupKey( ) {
		return this.groupKey;
	}

}
