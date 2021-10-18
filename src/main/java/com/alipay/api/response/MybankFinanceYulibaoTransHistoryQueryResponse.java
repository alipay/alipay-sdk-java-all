package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YLBTransDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.yulibao.trans.history.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-02 11:20:07
 */
public class MybankFinanceYulibaoTransHistoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7445128143922135583L;

	/** 
	 * 历史交易记录查询的当前页码
	 */
	@ApiField("current_page")
	private Long currentPage;

	/** 
	 * 当前查询是否具有下一页的数据，true-有，fasle-没有
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 历史交易详情信息
	 */
	@ApiListField("history_trans_detail_infos")
	@ApiField("y_l_b_trans_detail_info")
	private List<YLBTransDetailInfo> historyTransDetailInfos;

	/** 
	 * 当前查询在不分页情况下的数据总数
	 */
	@ApiField("total_item_count")
	private String totalItemCount;

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}
	public Long getCurrentPage( ) {
		return this.currentPage;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setHistoryTransDetailInfos(List<YLBTransDetailInfo> historyTransDetailInfos) {
		this.historyTransDetailInfos = historyTransDetailInfos;
	}
	public List<YLBTransDetailInfo> getHistoryTransDetailInfos( ) {
		return this.historyTransDetailInfos;
	}

	public void setTotalItemCount(String totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	public String getTotalItemCount( ) {
		return this.totalItemCount;
	}

}
