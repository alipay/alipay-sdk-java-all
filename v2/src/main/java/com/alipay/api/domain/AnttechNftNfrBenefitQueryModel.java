package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询NFR权益状态接口
 *
 * @author auto create
 * @since 1.0, 2026-09-17 20:02:55
 */
public class AnttechNftNfrBenefitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2397144332556364989L;

	/**
	 * NFT_ID / QR_STRING（为空时默认NFT_ID）
	 */
	@ApiField("code_type")
	private String codeType;

	/**
	 * NFT标识，codeType=NFT_ID时必填
	 */
	@ApiField("nft_id")
	private String nftId;

	/**
	 * 12位随机字母数字，codeType=QR_STRING时必填
	 */
	@ApiField("qr_string")
	private String qrString;

	/**
	 * SKU编码，纯数字
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
