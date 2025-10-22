package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GroupPromoteChannelVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.promotechannel.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-28 16:12:26
 */
public class AlipayMerchantGroupPromotechannelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6484539661283598627L;

	/** 
	 * 群组推广渠道信息列表信息
	 */
	@ApiField("group_promote_channel_list")
	private GroupPromoteChannelVO groupPromoteChannelList;

	/** 
	 * 分页查询页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页查询单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 分页查询结果总数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setGroupPromoteChannelList(GroupPromoteChannelVO groupPromoteChannelList) {
		this.groupPromoteChannelList = groupPromoteChannelList;
	}
	public GroupPromoteChannelVO getGroupPromoteChannelList( ) {
		return this.groupPromoteChannelList;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
