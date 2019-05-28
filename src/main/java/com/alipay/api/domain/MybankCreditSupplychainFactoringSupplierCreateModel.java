package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链金融-自保理-创建供应商
 *
 * @author auto create
 * @since 1.0, 2018-12-21 15:34:32
 */
public class MybankCreditSupplychainFactoringSupplierCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8811373519915997744L;

	/**
	 * 采购商网商银行参与者会员ID
	 */
	@ApiField("buyer_ip_id")
	private String buyerIpId;

	/**
	 * 采购商网商银行参与者会员角色ID
	 */
	@ApiField("buyer_ip_role_id")
	private String buyerIpRoleId;

	/**
	 * 采购商会员站点：ALIPAY:支付宝(当前支持)
	 */
	@ApiField("buyer_site")
	private String buyerSite;

	/**
	 * 采购商支付宝ID
	 */
	@ApiField("buyer_site_user_id")
	private String buyerSiteUserId;

	/**
	 * 收款渠道
	 */
	@ApiField("rcv_account_type")
	private String rcvAccountType;

	/**
	 * 供应商收款银行卡号
	 */
	@ApiField("seller_bank_acc")
	private String sellerBankAcc;

	/**
	 * 供应商账户名
	 */
	@ApiField("seller_bank_acc_name")
	private String sellerBankAccName;

	/**
	 * 供应商支行联行号-外标(企业时必填)
	 */
	@ApiField("seller_bank_branch_union_code")
	private String sellerBankBranchUnionCode;

	/**
	 * 供应商银行名称
	 */
	@ApiField("seller_bank_name")
	private String sellerBankName;

	/**
	 * 供应商联系人邮箱
	 */
	@ApiField("seller_contact_email")
	private String sellerContactEmail;

	/**
	 * 供应商联系人
	 */
	@ApiField("seller_contact_name")
	private String sellerContactName;

	/**
	 * 供应商联系人电话
	 */
	@ApiField("seller_contact_phone")
	private String sellerContactPhone;

	/**
	 * 供应商支付宝会员登录ID
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

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

	public String getRcvAccountType() {
		return this.rcvAccountType;
	}
	public void setRcvAccountType(String rcvAccountType) {
		this.rcvAccountType = rcvAccountType;
	}

	public String getSellerBankAcc() {
		return this.sellerBankAcc;
	}
	public void setSellerBankAcc(String sellerBankAcc) {
		this.sellerBankAcc = sellerBankAcc;
	}

	public String getSellerBankAccName() {
		return this.sellerBankAccName;
	}
	public void setSellerBankAccName(String sellerBankAccName) {
		this.sellerBankAccName = sellerBankAccName;
	}

	public String getSellerBankBranchUnionCode() {
		return this.sellerBankBranchUnionCode;
	}
	public void setSellerBankBranchUnionCode(String sellerBankBranchUnionCode) {
		this.sellerBankBranchUnionCode = sellerBankBranchUnionCode;
	}

	public String getSellerBankName() {
		return this.sellerBankName;
	}
	public void setSellerBankName(String sellerBankName) {
		this.sellerBankName = sellerBankName;
	}

	public String getSellerContactEmail() {
		return this.sellerContactEmail;
	}
	public void setSellerContactEmail(String sellerContactEmail) {
		this.sellerContactEmail = sellerContactEmail;
	}

	public String getSellerContactName() {
		return this.sellerContactName;
	}
	public void setSellerContactName(String sellerContactName) {
		this.sellerContactName = sellerContactName;
	}

	public String getSellerContactPhone() {
		return this.sellerContactPhone;
	}
	public void setSellerContactPhone(String sellerContactPhone) {
		this.sellerContactPhone = sellerContactPhone;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

}
