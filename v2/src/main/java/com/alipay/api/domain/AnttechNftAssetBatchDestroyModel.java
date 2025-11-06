package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 藏品批量销毁
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:38:22
 */
public class AnttechNftAssetBatchDestroyModel extends AlipayObject {

	private static final long serialVersionUID = 8758559799954397689L;

	/**
	 * 上游幂等单号
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用户编码
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 用户类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 资产列表
	 */
	@ApiListField("nft_id_set")
	@ApiField("string")
	private List<String> nftIdSet;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

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

	public List<String> getNftIdSet() {
		return this.nftIdSet;
	}
	public void setNftIdSet(List<String> nftIdSet) {
		this.nftIdSet = nftIdSet;
	}

}
