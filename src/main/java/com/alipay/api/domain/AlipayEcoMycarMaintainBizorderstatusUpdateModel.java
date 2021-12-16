package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单状态变更通知接口
 *
 * @author auto create
 * @since 1.0, 2020-12-31 11:46:56
 */
public class AlipayEcoMycarMaintainBizorderstatusUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 7259526856118487984L;

	/**
	 * 支付宝交易流水号
如果保养订单变更状态为已支付，则必填
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/**
	 * ISV订单业务状态文案，车主平台状态和ISV订单状态存在差异时，记录ISV对应的业务状态。
	 */
	@ApiField("biz_status_txt")
	private String bizStatusTxt;

	/**
	 * 行业类目标识
洗车-015；保养-016；4S-020
	 */
	@ApiField("industry_code")
	private String industryCode;

	/**
	 * 物流公司编号。支付宝支持物流公司编号。具体查看 
支付宝支持物流公司编码.zip。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * 物流公司名称。支付宝支付物流公司名称。具体查看 支付宝支持物流公司编码.zip。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("logistics_company")
	private String logisticsCompany;

	/**
	 * 流单号， ISV上传商品物流单号，用于物流流水的查询。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("logistics_no")
	private String logisticsNo;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 车主平台业务订单状态
1-未支付；
4-已关闭；
6-支付完成；
7-已出库；
8-已收货； 
11-服务开始；
55-服务完成/已核销；
56-订单完成；
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 支付宝账号
如果保养订单变更状态为已支付，则必填
	 */
	@ApiField("pay_account")
	private String payAccount;

	/**
	 * 支付时间yyyy-MM-dd HH:mm:ss
如果保养订单变更状态为已支付，则必填
	 */
	@ApiField("pay_time")
	private String payTime;

	/**
	 * 订单发货地址。记录订单发货的详细地址。省^^^市^^^区^^^详细地址。
如果保养订单变更状态为已出库，则必填
	 */
	@ApiField("sender_addr")
	private String senderAddr;

	public String getAlipayTradeNo() {
		return this.alipayTradeNo;
	}
	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}

	public String getBizStatusTxt() {
		return this.bizStatusTxt;
	}
	public void setBizStatusTxt(String bizStatusTxt) {
		this.bizStatusTxt = bizStatusTxt;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getLogisticsCompany() {
		return this.logisticsCompany;
	}
	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public String getLogisticsNo() {
		return this.logisticsNo;
	}
	public void setLogisticsNo(String logisticsNo) {
		this.logisticsNo = logisticsNo;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPayAccount() {
		return this.payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}

	public String getPayTime() {
		return this.payTime;
	}
	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}

	public String getSenderAddr() {
		return this.senderAddr;
	}
	public void setSenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}

}
