package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserTradeInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.usertrade.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-18 20:56:39
 */
public class AlipayFundUsertradeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7242847813838547162L;

	/** 
	 * 拉取的结束时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("end_time")
	private String endTime;

	/** 
	 * 是否有下一页
	 */
	@ApiField("has_next")
	private Boolean hasNext;

	/** 
	 * 入参中的分页页码
	 */
	@ApiField("page_index")
	private String pageIndex;

	/** 
	 * 入参中的分页大小
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 拉取的起始时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("start_time")
	private String startTime;

	/** 
	 * 交易时间区间内的总交易数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 用户交易数据
	 */
	@ApiListField("trade_info_list")
	@ApiField("user_trade_info_d_t_o")
	private List<UserTradeInfoDTO> tradeInfoList;

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime( ) {
		return this.endTime;
	}

	public void setHasNext(Boolean hasNext) {
		this.hasNext = hasNext;
	}
	public Boolean getHasNext( ) {
		return this.hasNext;
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

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime( ) {
		return this.startTime;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTradeInfoList(List<UserTradeInfoDTO> tradeInfoList) {
		this.tradeInfoList = tradeInfoList;
	}
	public List<UserTradeInfoDTO> getTradeInfoList( ) {
		return this.tradeInfoList;
	}

}
