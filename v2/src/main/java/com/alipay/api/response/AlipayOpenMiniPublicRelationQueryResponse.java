package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.public.relation.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-18 10:27:42
 */
public class AlipayOpenMiniPublicRelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8194239667265551914L;

	/** 
	 * 生活号ID
	 */
	@ApiField("public_id")
	private String publicId;

	/** 
	 * 生活号名称
	 */
	@ApiField("public_name")
	private String publicName;

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public String getPublicId( ) {
		return this.publicId;
	}

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}
	public String getPublicName( ) {
		return this.publicName;
	}

}
