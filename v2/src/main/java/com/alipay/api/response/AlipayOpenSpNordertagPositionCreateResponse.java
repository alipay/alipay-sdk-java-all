package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordertag.position.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-14 13:36:30
 */
public class AlipayOpenSpNordertagPositionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3663683185212185228L;

	/** 
	 * 点位id,主要为新建点位时生成的点位唯一标识
	 */
	@ApiField("tag_position_id")
	private String tagPositionId;

	public void setTagPositionId(String tagPositionId) {
		this.tagPositionId = tagPositionId;
	}
	public String getTagPositionId( ) {
		return this.tagPositionId;
	}

}
