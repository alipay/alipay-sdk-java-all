package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbAdvertAdvChannelResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.advchannel.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionAdvchannelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7714987687184738693L;

	/** 
	 * 业务数据
	 */
	@ApiListField("data")
	@ApiField("kb_advert_adv_channel_response")
	private List<KbAdvertAdvChannelResponse> data;

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

	public void setData(List<KbAdvertAdvChannelResponse> data) {
		this.data = data;
	}
	public List<KbAdvertAdvChannelResponse> getData( ) {
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
