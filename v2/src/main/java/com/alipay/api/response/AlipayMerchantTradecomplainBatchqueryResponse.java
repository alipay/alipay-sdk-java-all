package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TradeComplainQueryResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.tradecomplain.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-17 14:07:03
 */
public class AlipayMerchantTradecomplainBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4239952854365641364L;

	/** 
	 * 当前页码数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页记录数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总页码数
	 */
	@ApiField("total_page_num")
	private Long totalPageNum;

	/** 
	 * 交易纠纷工单列表信息
	 */
	@ApiListField("trade_complain_infos")
	@ApiField("trade_complain_query_response")
	private List<TradeComplainQueryResponse> tradeComplainInfos;

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

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalPageNum(Long totalPageNum) {
		this.totalPageNum = totalPageNum;
	}
	public Long getTotalPageNum( ) {
		return this.totalPageNum;
	}

	public void setTradeComplainInfos(List<TradeComplainQueryResponse> tradeComplainInfos) {
		this.tradeComplainInfos = tradeComplainInfos;
	}
	public List<TradeComplainQueryResponse> getTradeComplainInfos( ) {
		return this.tradeComplainInfos;
	}

}
