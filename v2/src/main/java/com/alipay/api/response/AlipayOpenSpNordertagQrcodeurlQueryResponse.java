package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NOrderTagQueryByCoilNoResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordertag.qrcodeurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-14 13:35:57
 */
public class AlipayOpenSpNordertagQrcodeurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8678136579952442644L;

	/** 
	 * 物料信息返回值
	 */
	@ApiField("tag_info")
	private NOrderTagQueryByCoilNoResp tagInfo;

	public void setTagInfo(NOrderTagQueryByCoilNoResp tagInfo) {
		this.tagInfo = tagInfo;
	}
	public NOrderTagQueryByCoilNoResp getTagInfo( ) {
		return this.tagInfo;
	}

}
