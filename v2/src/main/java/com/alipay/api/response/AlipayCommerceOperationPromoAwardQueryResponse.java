package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TradeAwardDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promo.award.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-13 16:52:51
 */
public class AlipayCommerceOperationPromoAwardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7687644695785973232L;

	/** 
	 * 激励金额，单位：分
	 */
	@ApiField("award_amount")
	private Long awardAmount;

	/** 
	 * 当前页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 报名记录ID（已废弃，请勿依赖）
	 */
	@ApiField("sign_up_id")
	private String signUpId;

	/** 
	 * 活动期间累计已发放激励（单位：分），与入参时间范围无关
	 */
	@ApiField("total_awarded_amount")
	private Long totalAwardedAmount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page")
	private Long totalPage;

	/** 
	 * null
	 */
	@ApiListField("trade_award_details")
	@ApiField("trade_award_detail")
	private List<TradeAwardDetail> tradeAwardDetails;

	/** 
	 * 总笔数
	 */
	@ApiField("trade_count")
	private Long tradeCount;

	public void setAwardAmount(Long awardAmount) {
		this.awardAmount = awardAmount;
	}
	public Long getAwardAmount( ) {
		return this.awardAmount;
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

	public void setSignUpId(String signUpId) {
		this.signUpId = signUpId;
	}
	public String getSignUpId( ) {
		return this.signUpId;
	}

	public void setTotalAwardedAmount(Long totalAwardedAmount) {
		this.totalAwardedAmount = totalAwardedAmount;
	}
	public Long getTotalAwardedAmount( ) {
		return this.totalAwardedAmount;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

	public void setTradeAwardDetails(List<TradeAwardDetail> tradeAwardDetails) {
		this.tradeAwardDetails = tradeAwardDetails;
	}
	public List<TradeAwardDetail> getTradeAwardDetails( ) {
		return this.tradeAwardDetails;
	}

	public void setTradeCount(Long tradeCount) {
		this.tradeCount = tradeCount;
	}
	public Long getTradeCount( ) {
		return this.tradeCount;
	}

}
