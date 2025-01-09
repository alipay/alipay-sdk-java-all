package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:51
 */
public class AlipayEbppIndustryOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2834622544229667281L;

	/** 
	 * 扩展属性，json串(key-value对)
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 订单创建时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/** 
	 * 订单支付时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/** 
	 * 退款时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_refund")
	private Date gmtRefund;

	/** 
	 * 订单成功时间GMT，yyyyMMdd HH:mm:ss
	 */
	@ApiField("gmt_success")
	private Date gmtSuccess;

	/** 
	 * 支付宝的业务订单号，具有唯一性。
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 回传外部流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 账单的状态，I-等待付款，P-处理中，已扣款待销账，C-单据关闭，F-失败，W-清算后退款，S-销账成功
	 */
	@ApiField("status")
	private String status;

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}
	public Date getGmtPay( ) {
		return this.gmtPay;
	}

	public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
	}
	public Date getGmtRefund( ) {
		return this.gmtRefund;
	}

	public void setGmtSuccess(Date gmtSuccess) {
		this.gmtSuccess = gmtSuccess;
	}
	public Date getGmtSuccess( ) {
		return this.gmtSuccess;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
