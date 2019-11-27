package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易明细
 *
 * @author auto create
 * @since 1.0, 2018-07-04 13:10:38
 */
public class ScpTrade extends AlipayObject {

	private static final long serialVersionUID = 8311963126994331619L;

	/**
	 * 交易过期时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 扩展数据
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 外部订单标题
	 */
	@ApiField("out_order_title")
	private String outOrderTitle;

	/**
	 * 卖家收款账户
	 */
	@ApiField("rcv_account")
	private Account rcvAccount;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private Member seller;

	/**
	 * 交易金额（单位：元）
	 */
	@ApiField("trade_amount")
	private String tradeAmount;

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
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

	public String getOutOrderTitle() {
		return this.outOrderTitle;
	}
	public void setOutOrderTitle(String outOrderTitle) {
		this.outOrderTitle = outOrderTitle;
	}

	public Account getRcvAccount() {
		return this.rcvAccount;
	}
	public void setRcvAccount(Account rcvAccount) {
		this.rcvAccount = rcvAccount;
	}

	public Member getSeller() {
		return this.seller;
	}
	public void setSeller(Member seller) {
		this.seller = seller;
	}

	public String getTradeAmount() {
		return this.tradeAmount;
	}
	public void setTradeAmount(String tradeAmount) {
		this.tradeAmount = tradeAmount;
	}

}
