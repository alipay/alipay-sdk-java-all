package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StandardFacePutInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.facefeature.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:55:10
 */
public class AlipayCommerceEducateFacefeatureCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4153241771266263632L;

	/** 
	 * 通用一脸通行用户入库结果
	 */
	@ApiListField("face_put_list")
	@ApiField("standard_face_put_info")
	private List<StandardFacePutInfo> facePutList;

	public void setFacePutList(List<StandardFacePutInfo> facePutList) {
		this.facePutList = facePutList;
	}
	public List<StandardFacePutInfo> getFacePutList( ) {
		return this.facePutList;
	}

}
