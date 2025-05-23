package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserAsset;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.nft.customer.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-17 17:41:39
 */
public class AnttechNftCustomerBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4657981888237481567L;

	/** 
	 * 用户资产列表
	 */
	@ApiListField("asset_list")
	@ApiField("user_asset")
	private List<UserAsset> assetList;

	/** 
	 * 页码，查询时传入
	 */
	@ApiField("page")
	private Long page;

	/** 
	 * 页长，查询时传入
	 */
	@ApiField("page_size")
	private String pageSize;

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

	public void setPage(Long page) {
		this.page = page;
	}
	public Long getPage( ) {
		return this.page;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
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
