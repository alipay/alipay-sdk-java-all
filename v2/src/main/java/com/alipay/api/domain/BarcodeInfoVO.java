package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序商品条形码
 *
 * @author auto create
 * @since 1.0, 2022-12-15 20:11:26
 */
public class BarcodeInfoVO extends AlipayObject {

	private static final long serialVersionUID = 8853122966582156479L;

	/**
	 * 条形码数字字符串
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 条形码类型, 目前支持"ean8", "ean13", 前者对应的barcode为8位纯数字字符串，后者为13位纯数字字符串
	 */
	@ApiField("barcode_type")
	private String barcodeType;

	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getBarcodeType() {
		return this.barcodeType;
	}
	public void setBarcodeType(String barcodeType) {
		this.barcodeType = barcodeType;
	}

}
