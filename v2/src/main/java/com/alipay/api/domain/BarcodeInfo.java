package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 条形码信息
 *
 * @author auto create
 * @since 1.0, 2023-03-23 19:15:54
 */
public class BarcodeInfo extends AlipayObject {

	private static final long serialVersionUID = 7687383696515874276L;

	/**
	 * 条形码数字字符串
	 */
	@ApiField("barcode")
	private String barcode;

	/**
	 * 条形码类型, 目前支持 ean8、ean13，前者对应的 barcode 为 8 位纯数字字符串，后者为 13 位纯数字字符串。
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
