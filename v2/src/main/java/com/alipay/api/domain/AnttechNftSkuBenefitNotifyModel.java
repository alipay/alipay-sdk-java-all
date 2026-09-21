package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 藏品更新权益通知
 *
 * @author auto create
 * @since 1.0, 2026-09-17 20:07:52
 */
public class AnttechNftSkuBenefitNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6482322457834836774L;

	/**
	 * NFT_ID / QR_STRING（为空时默认NFT_ID）
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * code_type为空或者code_type=NFT_ID时必填
	 */
	@ApiField("nft_id")
	private String nftId;

	/**
	 * code_type=QR_STRING时必填
	 */
	@ApiField("qr_string")
	private String qrString;

	/**
	 * sku编码，纯数字
	 */
	@ApiField("sku_id")
	private String skuId;

	public String getCodeType() {
		return this.codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getNftId() {
		return this.nftId;
	}
	public void setNftId(String nftId) {
		this.nftId = nftId;
	}

	public String getQrString() {
		return this.qrString;
	}
	public void setQrString(String qrString) {
		this.qrString = qrString;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

}
