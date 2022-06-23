package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.groupkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-29 15:06:44
 */
public class AlipayCommerceEducateFacefeatureGroupkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3552171285728843521L;

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
