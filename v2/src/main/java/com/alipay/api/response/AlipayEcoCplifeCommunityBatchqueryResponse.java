package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CPCommunitySet;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.community.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:42:28
 */
public class AlipayEcoCplifeCommunityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4866587497244547752L;

	/** 
	 * 若查询到符合条件的小区，返回物业小区摘要信息列表
	 */
	@ApiListField("community_list")
	@ApiField("c_p_community_set")
	private List<CPCommunitySet> communityList;

	/** 
	 * 当前页码
	 */
	@ApiField("current_page_num")
	private Long currentPageNum;

	/** 
	 * 开发者帮助物业创建成功并符合查询条件的小区总数。
若不传入app_auth_token参数，则返回开发者代创建成功的所有小区总数。
若传入app_auth_token参数，则返回对应开发者帮助该授权物业公司创建成功的小区总数。
	 */
	@ApiField("total_community_count")
	private Long totalCommunityCount;

	public void setCommunityList(List<CPCommunitySet> communityList) {
		this.communityList = communityList;
	}
	public List<CPCommunitySet> getCommunityList( ) {
		return this.communityList;
	}

	public void setCurrentPageNum(Long currentPageNum) {
		this.currentPageNum = currentPageNum;
	}
	public Long getCurrentPageNum( ) {
		return this.currentPageNum;
	}

	public void setTotalCommunityCount(Long totalCommunityCount) {
		this.totalCommunityCount = totalCommunityCount;
	}
	public Long getTotalCommunityCount( ) {
		return this.totalCommunityCount;
	}

}
