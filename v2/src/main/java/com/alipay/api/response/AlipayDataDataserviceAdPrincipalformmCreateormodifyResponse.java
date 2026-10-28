package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principalformm.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-25 13:42:53
 */
public class AlipayDataDataserviceAdPrincipalformmCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5615199345945855522L;

	/** 
	 * 灯火商家信息唯一键id
	 */
	@ApiField("principal_id")
	private Long principalId;

	/** 
	 * 商户标签，商户生成后的标签，可定位到此商户
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}
	public Long getPrincipalId( ) {
		return this.principalId;
	}

	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}
	public String getPrincipalTag( ) {
		return this.principalTag;
	}

}
