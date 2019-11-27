package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 买家账单还款
 *
 * @author auto create
 * @since 1.0, 2017-09-15 17:19:39
 */
public class MybankCreditSupplychainDebitnotePayModel extends AlipayObject {

	private static final long serialVersionUID = 6412117463472646139L;

	/**
	 * 买家ip_id
	 */
	@ApiField("buyer_ip_id")
	private String buyerIpId;

	/**
	 * 买家ip_role_id
	 */
	@ApiField("buyer_ip_role_id")
	private String buyerIpRoleId;

	/**
	 * 买家站点
	 */
	@ApiField("buyer_site")
	private String buyerSite;

	/**
	 * 买家站点UserId
	 */
	@ApiField("buyer_site_user_id")
	private String buyerSiteUserId;

	/**
	 * 交易订单编号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 付款金额，后台校验
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 付款类型：PRE_PAY(提前付款);CURRENT_PAY(到期付款);OVD_PAY(逾期付款)
	 */
	@ApiField("repay_type")
	private String repayType;

	/**
	 * 幂等编号，用于幂等控制，格式 instIpRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 卖家ip_id
	 */
	@ApiField("seller_ip_id")
	private String sellerIpId;

	/**
	 * 卖家ip_role_id
	 */
	@ApiField("seller_ip_role_id")
	private String sellerIpRoleId;

	/**
	 * 卖家站点
	 */
	@ApiField("seller_site")
	private String sellerSite;

	/**
	 * 卖家站点UserId
	 */
	@ApiField("seller_site_user_id")
	private String sellerSiteUserId;

	public String getBuyerIpId() {
		return this.buyerIpId;
	}
	public void setBuyerIpId(String buyerIpId) {
		this.buyerIpId = buyerIpId;
	}

	public String getBuyerIpRoleId() {
		return this.buyerIpRoleId;
	}
	public void setBuyerIpRoleId(String buyerIpRoleId) {
		this.buyerIpRoleId = buyerIpRoleId;
	}

	public String getBuyerSite() {
		return this.buyerSite;
	}
	public void setBuyerSite(String buyerSite) {
		this.buyerSite = buyerSite;
	}

	public String getBuyerSiteUserId() {
		return this.buyerSiteUserId;
	}
	public void setBuyerSiteUserId(String buyerSiteUserId) {
		this.buyerSiteUserId = buyerSiteUserId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getRepayType() {
		return this.repayType;
	}
	public void setRepayType(String repayType) {
		this.repayType = repayType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSellerIpId() {
		return this.sellerIpId;
	}
	public void setSellerIpId(String sellerIpId) {
		this.sellerIpId = sellerIpId;
	}

	public String getSellerIpRoleId() {
		return this.sellerIpRoleId;
	}
	public void setSellerIpRoleId(String sellerIpRoleId) {
		this.sellerIpRoleId = sellerIpRoleId;
	}

	public String getSellerSite() {
		return this.sellerSite;
	}
	public void setSellerSite(String sellerSite) {
		this.sellerSite = sellerSite;
	}

	public String getSellerSiteUserId() {
		return this.sellerSiteUserId;
	}
	public void setSellerSiteUserId(String sellerSiteUserId) {
		this.sellerSiteUserId = sellerSiteUserId;
	}

}
