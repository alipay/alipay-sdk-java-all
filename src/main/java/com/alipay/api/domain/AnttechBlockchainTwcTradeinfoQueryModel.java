package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询支付订单详情
 *
 * @author auto create
 * @since 1.0, 2021-01-22 17:01:57
 */
public class AnttechBlockchainTwcTradeinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8467651654276291178L;

	/**
	 * 支付者用户的支付宝id
	 */
	@ApiField("buyeruid")
	private String buyeruid;

	/**
	 * 卖家支付宝账户
	 */
	@ApiField("selleruid")
	private String selleruid;

	/**
	 * 交易金额
	 */
	@ApiField("tradefee")
	private String tradefee;

	/**
	 * 支付订单id
	 */
	@ApiField("tradeid")
	private String tradeid;

	public String getBuyeruid() {
		return this.buyeruid;
	}
	public void setBuyeruid(String buyeruid) {
		this.buyeruid = buyeruid;
	}

	public String getSelleruid() {
		return this.selleruid;
	}
	public void setSelleruid(String selleruid) {
		this.selleruid = selleruid;
	}

	public String getTradefee() {
		return this.tradefee;
	}
	public void setTradefee(String tradefee) {
		this.tradefee = tradefee;
	}

	public String getTradeid() {
		return this.tradeid;
	}
	public void setTradeid(String tradeid) {
		this.tradeid = tradeid;
	}

}
