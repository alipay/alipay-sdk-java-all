package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.repayment.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-15 10:35:37
 */
public class AlipayFundFlexiblestaffingRepaymentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3377923241719649912L;

	/** 
	 * 资金单Id
	 */
	@ApiField("fund_order_id")
	private String fundOrderId;

	/** 
	 * 外部唯一订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 完成转账时间
	 */
	@ApiField("trans_date")
	private Date transDate;

	public void setFundOrderId(String fundOrderId) {
		this.fundOrderId = fundOrderId;
	}
	public String getFundOrderId( ) {
		return this.fundOrderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public Date getTransDate( ) {
		return this.transDate;
	}

}
