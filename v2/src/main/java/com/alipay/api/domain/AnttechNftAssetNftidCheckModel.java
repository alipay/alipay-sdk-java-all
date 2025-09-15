package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据nftId确认用户是否拥有藏品
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:38:40
 */
public class AnttechNftAssetNftidCheckModel extends AlipayObject {

	private static final long serialVersionUID = 7656778414438972181L;

	/**
	 * 用户账号
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 账号类型THIRD_UID博域
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * nftid客户的资产idmynftcore提供的
	 */
	@ApiField("nft_id")
	private String nftId;

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getNftId() {
		return this.nftId;
	}
	public void setNftId(String nftId) {
		this.nftId = nftId;
	}

}
