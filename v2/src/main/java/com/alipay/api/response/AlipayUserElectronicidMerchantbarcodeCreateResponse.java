package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.electronicid.merchantbarcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-17 14:41:55
 */
public class AlipayUserElectronicidMerchantbarcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6665677157236932461L;

	/** 
	 * 二维码码串
	 */
	@ApiField("barcode")
	private String barcode;

	/** 
	 * 二维码图片链接
	 */
	@ApiField("image_url")
	private String imageUrl;

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBarcode( ) {
		return this.barcode;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImageUrl( ) {
		return this.imageUrl;
	}

}
