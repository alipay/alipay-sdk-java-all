package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbAdvertAdvChannelDetailResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.advchannel.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionAdvchannelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6283929539676889744L;

	/** 
	 * 广告渠道绑定相信信息
	 */
	@ApiField("data")
	private KbAdvertAdvChannelDetailResponse data;

	/** 
	 * 当前页码，默认1
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/** 
	 * 每页记录数，默认10，最大100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setData(KbAdvertAdvChannelDetailResponse data) {
		this.data = data;
	}
	public KbAdvertAdvChannelDetailResponse getData( ) {
		return this.data;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}
	public Long getPageIndex( ) {
		return this.pageIndex;
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
