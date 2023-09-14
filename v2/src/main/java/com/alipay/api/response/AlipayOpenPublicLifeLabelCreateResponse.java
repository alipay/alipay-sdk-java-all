package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.life.label.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 19:47:31
 */
public class AlipayOpenPublicLifeLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1763862757268524394L;

	/** 
	 * 标签id
	 */
	@ApiField("label_id")
	private String labelId;

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}
	public String getLabelId( ) {
		return this.labelId;
	}

}
