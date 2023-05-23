package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 06:55:16
 */
public class AlipayCommerceEducateFacefeatureDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 8467232594167928685L;

	/** 
	 * 出库失败的faceId集合。
	 */
	@ApiListField("face_ids")
	@ApiField("string")
	private List<String> faceIds;

	public void setFaceIds(List<String> faceIds) {
		this.faceIds = faceIds;
	}
	public List<String> getFaceIds( ) {
		return this.faceIds;
	}

}
