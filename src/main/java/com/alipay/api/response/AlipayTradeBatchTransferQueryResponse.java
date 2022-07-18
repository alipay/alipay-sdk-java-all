package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BatchRoyaltyDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.transfer.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-06-29 22:50:20
 */
public class AlipayTradeBatchTransferQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8875949893724227557L;

	/** 
	 * 批量结算时传入的外部流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 批量结算详情
	 */
	@ApiListField("royalty_detail")
	@ApiField("batch_royalty_detail")
	private List<BatchRoyaltyDetail> royaltyDetail;

	/** 
	 * 结算单据号
	 */
	@ApiField("settle_no")
	private String settleNo;

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setRoyaltyDetail(List<BatchRoyaltyDetail> royaltyDetail) {
		this.royaltyDetail = royaltyDetail;
	}
	public List<BatchRoyaltyDetail> getRoyaltyDetail( ) {
		return this.royaltyDetail;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleNo( ) {
		return this.settleNo;
	}

}
