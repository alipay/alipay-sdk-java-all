package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.finish response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-30 17:02:05
 */
public class AlipayMerchantOrderFinishResponse extends AlipayResponse {

	private static final long serialVersionUID = 8892427856319281144L;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 支付资金明细。如果本次完结补充金额是0，该字段为空字符串
	 */
	@ApiField("fund_detail")
	private String fundDetail;

	/** 
	 * 完结成功时间，如果商户多次发起完结返回第一次完结成功的时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/** 
	 * 业务订单编号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 本次完结补充金额。例如在租赁场景中，用户归还物品的时候如果损坏，商户可与用户沟通后传入需要从押金中扣除的金额，如果不需要扣款传入0，单位为元，精确到小数点后两位，取值范围[0,100000000]
	 */
	@ApiField("supplement_amount")
	private String supplementAmount;

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setFundDetail(String fundDetail) {
		this.fundDetail = fundDetail;
	}
	public String getFundDetail( ) {
		return this.fundDetail;
	}

	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}
	public Date getGmtPay( ) {
		return this.gmtPay;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setSupplementAmount(String supplementAmount) {
		this.supplementAmount = supplementAmount;
	}
	public String getSupplementAmount( ) {
		return this.supplementAmount;
	}

}
