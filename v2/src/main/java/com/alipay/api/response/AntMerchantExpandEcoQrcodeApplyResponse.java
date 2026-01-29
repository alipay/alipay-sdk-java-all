package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AssetEcoQrcodeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.eco.qrcode.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-04 19:37:20
 */
public class AntMerchantExpandEcoQrcodeApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4789173278817492668L;

	/** 
	 * 用于生态发的空码，码信息详情
	 */
	@ApiField("qrcode_info")
	private AssetEcoQrcodeInfo qrcodeInfo;

	public void setQrcodeInfo(AssetEcoQrcodeInfo qrcodeInfo) {
		this.qrcodeInfo = qrcodeInfo;
	}
	public AssetEcoQrcodeInfo getQrcodeInfo( ) {
		return this.qrcodeInfo;
	}

}
