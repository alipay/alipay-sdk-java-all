package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应链金融-自保理-创建供应商
 *
 * @author auto create
 * @since 1.0, 2021-04-01 19:58:22
 */
public class MybankCreditSupplychainFactoringSupplierCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6792864219785882872L;

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
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 运营商名称
	 */
	@ApiField("operator_name")
	private String operatorName;

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

	/**
	 * 门店所属城市
	 */
	@ApiField("store_city")
	private String storeCity;

	/**
	 * 门店所属区县
	 */
	@ApiField("store_county")
	private String storeCounty;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	/**
	 * 门店编号
	 */
	@ApiField("store_no")
	private String storeNo;

	/**
	 * 门店所属省份
	 */
	@ApiField("store_province")
	private String storeProvince;

	/**
	 * 门店背后主体证件号
	 */
	@ApiField("store_subject_cert_no")
	private String storeSubjectCertNo;

	/**
	 * 门店背后主体名称
	 */
	@ApiField("store_subject_name")
	private String storeSubjectName;

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

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOperatorName() {
		return this.operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
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

	public String getStoreCity() {
		return this.storeCity;
	}
	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	public String getStoreCounty() {
		return this.storeCounty;
	}
	public void setStoreCounty(String storeCounty) {
		this.storeCounty = storeCounty;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreNo() {
		return this.storeNo;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public String getStoreProvince() {
		return this.storeProvince;
	}
	public void setStoreProvince(String storeProvince) {
		this.storeProvince = storeProvince;
	}

	public String getStoreSubjectCertNo() {
		return this.storeSubjectCertNo;
	}
	public void setStoreSubjectCertNo(String storeSubjectCertNo) {
		this.storeSubjectCertNo = storeSubjectCertNo;
	}

	public String getStoreSubjectName() {
		return this.storeSubjectName;
	}
	public void setStoreSubjectName(String storeSubjectName) {
		this.storeSubjectName = storeSubjectName;
	}

}
