package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizFundSettleDetailInfo;
import com.alipay.api.domain.BizFundSettleSummary;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.settle.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-08 11:46:48
 */
public class AlipayMarketingActivitySettleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4543372662547986264L;

	/** 
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 兑换券发起结算之后的每笔订单的资金结算明细，如入账，结算金额等
	 */
	@ApiListField("settle_info")
	@ApiField("biz_fund_settle_detail_info")
	private List<BizFundSettleDetailInfo> settleInfo;

	/** 
	 * 兑换券发起结算之后关于结算的汇总信息的描述
	 */
	@ApiField("summary")
	private BizFundSettleSummary summary;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setSettleInfo(List<BizFundSettleDetailInfo> settleInfo) {
		this.settleInfo = settleInfo;
	}
	public List<BizFundSettleDetailInfo> getSettleInfo( ) {
		return this.settleInfo;
	}

	public void setSummary(BizFundSettleSummary summary) {
		this.summary = summary;
	}
	public BizFundSettleSummary getSummary( ) {
		return this.summary;
	}

}
