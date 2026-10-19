package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * nftid持有人信息查询接口
 *
 * @author auto create
 * @since 1.0, 2026-09-22 18:12:55
 */
public class AnttechNftNftidOwnerQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1451923556946234388L;

	/**
	 * 预测的持有用户id，可能为空
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 预测持有用户id类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 藏品的nftId
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
