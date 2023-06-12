package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.flexiblestaffing.repayment.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 19:31:56
 */
public class AlipayFundFlexiblestaffingRepaymentTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 3454556344656532927L;

	/** 
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 资金单ID
	 */
	@ApiField("fund_order_id")
	private String fundOrderId;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 还款转账产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 转账单据状态。 SUCCESS（该笔转账交易成功）：成功； FAIL：失败（具体失败原因请参见error_code以及fail_reason返回值）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 转账完成时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("trans_date")
	private String transDate;

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

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

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getTransDate( ) {
		return this.transDate;
	}

}
