package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据nftid维度查询藏品
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:41:23
 */
public class AnttechNftAssetNftidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6697187775829773976L;

	/**
	 * 用户账户
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 账号类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 资产唯一编码
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
