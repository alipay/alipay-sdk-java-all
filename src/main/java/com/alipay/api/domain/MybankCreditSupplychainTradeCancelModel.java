package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易取消
 *
 * @author auto create
 * @since 1.0, 2018-07-06 12:00:14
 */
public class MybankCreditSupplychainTradeCancelModel extends AlipayObject {

	private static final long serialVersionUID = 3522584846687957686L;

	/**
	 * 买家会员信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 渠道，枚举如下：TMGXBL：天猫供销保理，TYZBL：通用自保理，TMZBL：天猫自保理，DSCYFRZ：大搜车预付融资，TMJX：天猫经销池融资
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 扩展字段，json类型的字符串
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 幂等编号，用于幂等控制，格式：机构ipRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 卖家会员信息
	 */
	@ApiField("seller")
	private Member seller;

	/**
	 * FACTORING：保理，PREPAYMENT：预付融资，CREDITPAY：信任付，POOL：池融资
	 */
	@ApiField("trade_type")
	private String tradeType;

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public Member getSeller() {
		return this.seller;
	}
	public void setSeller(Member seller) {
		this.seller = seller;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
