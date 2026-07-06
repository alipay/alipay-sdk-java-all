package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.sku.customize.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 16:27:46
 */
public class AnttechNftSkuCustomizeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5863864181228944185L;

	/** 
	 * 发放状态：WAITING待发放，FINISHED发放完成，CANCEL审核返回失败，FAILED无法发放，RECYCLE藏品被回收
	 */
	@ApiField("distribution_status")
	private String distributionStatus;

	/** 
	 * 失败原因:UGC_ASSET_CAMP_USER_TYPE_CAN_NOT_AWARD企业用户不支持领取藏品,UGC_ASSET_CAMP_NFT_NO_INVENTORY自定义藏品无库存
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 藏品nftId
	 */
	@ApiField("nft_id")
	private String nftId;

	public void setDistributionStatus(String distributionStatus) {
		this.distributionStatus = distributionStatus;
	}
	public String getDistributionStatus( ) {
		return this.distributionStatus;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setNftId(String nftId) {
		this.nftId = nftId;
	}
	public String getNftId( ) {
		return this.nftId;
	}

}
