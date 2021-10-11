package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.creative.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2021-09-23 09:36:23
 */
public class AlipayDataDataserviceAdCreativeCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6269687827566236636L;

	/** 
	 * 广告投放平台生成的创意ID
	 */
	@ApiField("creative_id")
	private Long creativeId;

	/** 
	 * 外部平台导入广告库后，广告投放创意对应的外部资源ID
	 */
	@ApiField("creative_outer_id")
	private String creativeOuterId;

	public void setCreativeId(Long creativeId) {
		this.creativeId = creativeId;
	}
	public Long getCreativeId( ) {
		return this.creativeId;
	}

	public void setCreativeOuterId(String creativeOuterId) {
		this.creativeOuterId = creativeOuterId;
	}
	public String getCreativeOuterId( ) {
		return this.creativeOuterId;
	}

}
