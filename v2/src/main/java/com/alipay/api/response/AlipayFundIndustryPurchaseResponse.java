package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.industry.purchase response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-10 18:10:31
 */
public class AlipayFundIndustryPurchaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7141318948593417678L;

	/** 
	 * 实际基金申购的金额（单位元），与入参一致
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 基金申购时间，与报送清算的时间保持一致
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/** 
	 * 支付宝申购流水号。如果发生申购撤销，需要把这笔流水号从文件中带回来
	 */
	@ApiField("operation_id")
	private String operationId;

	/** 
	 * 入参携带的外部请求号，原样返回
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}
	public Date getGmtPay( ) {
		return this.gmtPay;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getOperationId( ) {
		return this.operationId;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
