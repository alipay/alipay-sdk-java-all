package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserAsset;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.assetbyskuid.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-16 13:47:38
 */
public class AnttechNftAssetbyskuidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5887655471874437296L;

	/** 
	 * 用户资产列表
	 */
	@ApiListField("asset_list")
	@ApiField("user_asset")
	private List<UserAsset> assetList;

	/** 
	 * 请求消息id，全链路唯一标记，建议打印，排查问题需提供
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	/** 
	 * 列表总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setAssetList(List<UserAsset> assetList) {
		this.assetList = assetList;
	}
	public List<UserAsset> getAssetList( ) {
		return this.assetList;
	}

	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}
	public String getReqMsgId( ) {
		return this.reqMsgId;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
