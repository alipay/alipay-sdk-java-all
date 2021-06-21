package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditbizorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-27 13:48:35
 */
public class ZhimaCreditPayafteruseCreditbizorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5693161689369395129L;

	/** 
	 * 订单创建时间
	 */
	@ApiField("create_time")
	private Date createTime;

	/** 
	 * 芝麻开通协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/** 
	 * 先享后付记账单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 先享后付记账单冻结金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 记账单交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 芝麻服务ID
	 */
	@ApiField("zm_service_id")
	private String zmServiceId;

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime( ) {
		return this.createTime;
	}

	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}
	public String getCreditAgreementId( ) {
		return this.creditAgreementId;
	}

	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}
	public String getCreditBizOrderId( ) {
		return this.creditBizOrderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setZmServiceId(String zmServiceId) {
		this.zmServiceId = zmServiceId;
	}
	public String getZmServiceId( ) {
		return this.zmServiceId;
	}

}
