package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易驱动还款
 *
 * @author auto create
 * @since 1.0, 2022-02-15 15:23:40
 */
public class MybankCreditGuaranteeTradedrivePayModel extends AlipayObject {

	private static final long serialVersionUID = 7724151194888634781L;

	/**
	 * 业务日期
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 交易驱动金额，单位分
	 */
	@ApiField("order_encash_amt")
	private String orderEncashAmt;

	/**
	 * 交易驱动金额对应币种
	 */
	@ApiField("order_encash_ccy")
	private String orderEncashCcy;

	/**
	 * 还款业务编码。交易驱动还款时，根据AE的收款信息业务ID生成
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * AE卖家id
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	/**
	 * 会员站点：AE:速卖通，ALIPAY:支付宝，MYBANK:网商银行，TAOBAO：淘宝，B2B_CN：中文站，B2B_EN：国际站
	 */
	@ApiField("site")
	private String site;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getOrderEncashAmt() {
		return this.orderEncashAmt;
	}
	public void setOrderEncashAmt(String orderEncashAmt) {
		this.orderEncashAmt = orderEncashAmt;
	}

	public String getOrderEncashCcy() {
		return this.orderEncashCcy;
	}
	public void setOrderEncashCcy(String orderEncashCcy) {
		this.orderEncashCcy = orderEncashCcy;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

}
