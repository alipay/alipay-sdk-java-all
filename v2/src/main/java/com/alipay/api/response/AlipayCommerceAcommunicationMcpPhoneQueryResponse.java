package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OrderStatus;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.acommunication.mcp.phone.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-16 10:27:44
 */
public class AlipayCommerceAcommunicationMcpPhoneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3617571545246275172L;

	/** 
	 * 话费订单号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 充值面额(单位：元)
	 */
	@ApiField("face")
	private String face;

	/** 
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/** 
	 * 订单完成时间
	 */
	@ApiField("gmt_finish")
	private String gmtFinish;

	/** 
	 * 支付时间
	 */
	@ApiField("gmt_pay")
	private String gmtPay;

	/** 
	 * 运营商中文简称
	 */
	@ApiField("isp_abbr_cn")
	private String ispAbbrCn;

	/** 
	 * 充值手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/** 
	 * 归属省份
	 */
	@ApiField("province")
	private String province;

	/** 
	 * 订单状态信息
	 */
	@ApiField("status")
	private OrderStatus status;

	/** 
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setFace(String face) {
		this.face = face;
	}
	public String getFace( ) {
		return this.face;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public String getGmtCreate( ) {
		return this.gmtCreate;
	}

	public void setGmtFinish(String gmtFinish) {
		this.gmtFinish = gmtFinish;
	}
	public String getGmtFinish( ) {
		return this.gmtFinish;
	}

	public void setGmtPay(String gmtPay) {
		this.gmtPay = gmtPay;
	}
	public String getGmtPay( ) {
		return this.gmtPay;
	}

	public void setIspAbbrCn(String ispAbbrCn) {
		this.ispAbbrCn = ispAbbrCn;
	}
	public String getIspAbbrCn( ) {
		return this.ispAbbrCn;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile( ) {
		return this.mobile;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince( ) {
		return this.province;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public OrderStatus getStatus( ) {
		return this.status;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
