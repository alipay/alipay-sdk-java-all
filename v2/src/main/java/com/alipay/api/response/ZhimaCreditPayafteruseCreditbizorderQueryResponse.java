package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditbizorder.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 13:37:02
 */
public class ZhimaCreditPayafteruseCreditbizorderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6445733843689918521L;

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
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/** 
	 * 信用服务订单状态，区分不同产品：
（1）针对产品「先用后付」，涉及状态如下：INIT: 下单状态；TRADE_CLOSED: 订单取消或者交易全额退款； TRADE_FINISHED：扣款成功状态。

（2）针对产品「芝麻风险评估与召回」，状态定义如下：
[INIT: 下单状态]；[WAIT_FULFILL：待守约]；[OVERDUE：已逾期]；[TRADE_FINISHED:已守约]；
[TRADE_CLOSED：已取消]。
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 信用服务订单金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号。
先用后付产品下必传；芝麻风险评估与召回产品下不传。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 芝麻信用服务ID
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
