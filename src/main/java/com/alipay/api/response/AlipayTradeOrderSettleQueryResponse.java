package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RoyaltyDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.order.settle.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-03 21:10:34
 */
public class AlipayTradeOrderSettleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2531957346536754914L;

	/** 
	 * 分账受理时间
	 */
	@ApiField("operation_dt")
	private Date operationDt;

	/** 
	 * 商户分账请求单号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 分账明细
	 */
	@ApiListField("royalty_detail_list")
	@ApiField("royalty_detail")
	private List<RoyaltyDetail> royaltyDetailList;

	public void setOperationDt(Date operationDt) {
		this.operationDt = operationDt;
	}
	public Date getOperationDt( ) {
		return this.operationDt;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRoyaltyDetailList(List<RoyaltyDetail> royaltyDetailList) {
		this.royaltyDetailList = royaltyDetailList;
	}
	public List<RoyaltyDetail> getRoyaltyDetailList( ) {
		return this.royaltyDetailList;
	}

}
