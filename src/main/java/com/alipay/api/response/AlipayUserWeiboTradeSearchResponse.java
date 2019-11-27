package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WeiboTradeRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.weibo.trade.search response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayUserWeiboTradeSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 2569886569769765661L;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private Long totalResults;

	/** 
	 * 微博交易记录列表
	 */
	@ApiListField("weibo_trade_records")
	@ApiField("weibo_trade_record")
	private List<WeiboTradeRecord> weiboTradeRecords;

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalResults(Long totalResults) {
		this.totalResults = totalResults;
	}
	public Long getTotalResults( ) {
		return this.totalResults;
	}

	public void setWeiboTradeRecords(List<WeiboTradeRecord> weiboTradeRecords) {
		this.weiboTradeRecords = weiboTradeRecords;
	}
	public List<WeiboTradeRecord> getWeiboTradeRecords( ) {
		return this.weiboTradeRecords;
	}

}
