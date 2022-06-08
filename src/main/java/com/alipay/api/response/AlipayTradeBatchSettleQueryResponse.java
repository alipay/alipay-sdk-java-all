package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BatchSettleDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.batch.settle.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-28 22:15:17
 */
public class AlipayTradeBatchSettleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8816394951945454852L;

	/** 
	 * 批量结算时传入的外部流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 批量结算详情
	 */
	@ApiListField("settle_detail")
	@ApiField("batch_settle_detail")
	private List<BatchSettleDetail> settleDetail;

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

	public void setSettleDetail(List<BatchSettleDetail> settleDetail) {
		this.settleDetail = settleDetail;
	}
	public List<BatchSettleDetail> getSettleDetail( ) {
		return this.settleDetail;
	}

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleNo( ) {
		return this.settleNo;
	}

}
