package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MultiChannelJoinGiftRecordVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.group.groupgift.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-19 14:52:05
 */
public class AlipayMerchantGroupGroupgiftBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3144352366715271919L;

	/** 
	 * 入群有礼配置记录列表
	 */
	@ApiListField("join_gift_record_list")
	@ApiField("multi_channel_join_gift_record_v_o")
	private List<MultiChannelJoinGiftRecordVO> joinGiftRecordList;

	/** 
	 * 入群有礼总条数。取值单位是"条"。
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setJoinGiftRecordList(List<MultiChannelJoinGiftRecordVO> joinGiftRecordList) {
		this.joinGiftRecordList = joinGiftRecordList;
	}
	public List<MultiChannelJoinGiftRecordVO> getJoinGiftRecordList( ) {
		return this.joinGiftRecordList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
