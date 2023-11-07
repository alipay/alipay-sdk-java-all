package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.groupkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:28:57
 */
public class AlipayCommerceEducateFacefeatureGroupkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1862856593276333434L;

	/** 
	 * 学校人脸库ID
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
