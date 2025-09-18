package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NOrderTagQueryByCoilNoResp;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordertag.qrcodeurl.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-10 19:32:29
 */
public class AlipayOpenSpNordertagQrcodeurlQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7533868997626943833L;

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
