package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TradeRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.trade.search response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-08 10:24:55
 */
public class AlipayUserTradeSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 1836482413192571472L;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private String totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_results")
	private String totalResults;

	/** 
	 * 交易记录列表
	 */
	@ApiListField("trade_records")
	@ApiField("trade_record")
	private List<TradeRecord> tradeRecords;

	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}
	public String getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
	public String getTotalResults( ) {
		return this.totalResults;
	}

	public void setTradeRecords(List<TradeRecord> tradeRecords) {
		this.tradeRecords = tradeRecords;
	}
	public List<TradeRecord> getTradeRecords( ) {
		return this.tradeRecords;
	}

}
