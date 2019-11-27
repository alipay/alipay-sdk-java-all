package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卖家退款
 *
 * @author auto create
 * @since 1.0, 2017-09-16 12:02:08
 */
public class MybankCreditSupplychainOrderRefundModel extends AlipayObject {

	private static final long serialVersionUID = 8126935226328229932L;

	/**
	 * 买家的网商参与者id
	 */
	@ApiField("buyer_ip_id")
	private String buyerIpId;

	/**
	 * 买家的网商会员角色id
	 */
	@ApiField("buyer_ip_role_id")
	private String buyerIpRoleId;

	/**
	 * 买家站点；ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("buyer_site")
	private String buyerSite;

	/**
	 * 买家站点会员ID
	 */
	@ApiField("buyer_site_user_id")
	private String buyerSiteUserId;

	/**
	 * 外部订单编号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 退款额度（元），精确到分
	 */
	@ApiField("refund_amount")
	private String refundAmount;

	/**
	 * 退款发起时间，精确到时分秒
	 */
	@ApiField("refund_apply_time")
	private Date refundApplyTime;

	/**
	 * 退款场景，例如确认收货前（BEFORE_CONFIRM）、确认收货后（AFTER_CONFIRM）
	 */
	@ApiField("refund_scene")
	private String refundScene;

	/**
	 * 请求流水号，用于幂等控制
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * 卖家的网商参与者id
	 */
	@ApiField("seller_ip_id")
	private String sellerIpId;

	/**
	 * 卖家的网商会员角色id
	 */
	@ApiField("seller_ip_role_id")
	private String sellerIpRoleId;

	/**
	 * 卖家站点，ALIPAY：支付宝站点，MYBANK：银行会员，B2B_CN：B2B中文站，B2B_EN：B2B国际站，TAOBAO：淘宝
	 */
	@ApiField("seller_site")
	private String sellerSite;

	/**
	 * 卖家站点会员ID
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

	public String getRefundAmount() {
		return this.refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Date getRefundApplyTime() {
		return this.refundApplyTime;
	}
	public void setRefundApplyTime(Date refundApplyTime) {
		this.refundApplyTime = refundApplyTime;
	}

	public String getRefundScene() {
		return this.refundScene;
	}
	public void setRefundScene(String refundScene) {
		this.refundScene = refundScene;
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
