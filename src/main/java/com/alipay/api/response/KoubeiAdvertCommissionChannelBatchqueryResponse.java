package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbAdvertChannelResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.commission.channel.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiAdvertCommissionChannelBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1612964996184928875L;

	/** 
	 * 渠道信息
	 */
	@ApiField("data")
	private KbAdvertChannelResponse data;

	/** 
	 * 页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/** 
	 * 每页页数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setData(KbAdvertChannelResponse data) {
		this.data = data;
	}
	public KbAdvertChannelResponse getData( ) {
		return this.data;
	}

	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}
	public String getPageIndex( ) {
		return this.pageIndex;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
