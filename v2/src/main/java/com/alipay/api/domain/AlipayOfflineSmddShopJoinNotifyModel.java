package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 微信进件通知
 *
 * @author auto create
 * @since 1.0, 2025-04-12 16:01:16
 */
public class AlipayOfflineSmddShopJoinNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2668868225868243342L;

	/**
	 * 审核备注
	 */
	@ApiField("audit_memo")
	private String auditMemo;

	/**
	 * 待提交/审核中/审核通过/审核拒绝/待处理
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/**
	 * 银行账户类型
	 */
	@ApiField("bank_account_type")
	private String bankAccountType;

	/**
	 * 开户行地址
	 */
	@ApiField("bank_address")
	private AddressBean bankAddress;

	/**
	 * 开户支行
	 */
	@ApiField("bank_branch_name")
	private String bankBranchName;

	/**
	 * 银行卡正面照
	 */
	@ApiField("bank_card_front_pic")
	private String bankCardFrontPic;

	/**
	 * 银行卡卡号
	 */
	@ApiField("bank_card_number")
	private String bankCardNumber;

	/**
	 * 开户银行
	 */
	@ApiField("bank_name")
	private String bankName;

	/**
	 * 主体类型
	 */
	@ApiField("business_entity_type")
	private String businessEntityType;

	/**
	 * 经营场景照
	 */
	@ApiField("business_environment_pic")
	private String businessEnvironmentPic;

	/**
	 * 营业执照有效期结束时间
	 */
	@ApiField("business_license_end_date")
	private String businessLicenseEndDate;

	/**
	 * 营业执照
	 */
	@ApiField("business_license_pic")
	private String businessLicensePic;

	/**
	 * 营业执照有效期开始时间
	 */
	@ApiField("business_license_start_date")
	private String businessLicenseStartDate;

	/**
	 * 收银台照
	 */
	@ApiField("cashier_desk_pic")
	private String cashierDeskPic;

	/**
	 * 商家地址
	 */
	@ApiField("company_address")
	private AddressBean companyAddress;

	/**
	 * 企业代码
	 */
	@ApiField("company_code")
	private String companyCode;

	/**
	 * 企业代码类型
	 */
	@ApiField("company_code_type")
	private String companyCodeType;

	/**
	 * 营业执照名称全称
	 */
	@ApiField("company_full_name")
	private String companyFullName;

	/**
	 * 应急联系电话
	 */
	@ApiField("emergency_contact_phone")
	private String emergencyContactPhone;

	/**
	 * 成立时间
	 */
	@ApiField("establishment_date")
	private String establishmentDate;

	/**
	 * 身份证住址
	 */
	@ApiField("id_card_address")
	private String idCardAddress;

	/**
	 * 身份证反面照（人像面）
	 */
	@ApiField("id_card_back_pic")
	private String idCardBackPic;

	/**
	 * 身份证有效期结束时间
	 */
	@ApiField("id_card_end_date")
	private String idCardEndDate;

	/**
	 * 身份证正面照（国徽面）
	 */
	@ApiField("id_card_front_pic")
	private String idCardFrontPic;

	/**
	 * 身份证有效期开始时间
	 */
	@ApiField("id_card_start_date")
	private String idCardStartDate;

	/**
	 * 法人身份证号
	 */
	@ApiField("legal_person_id_number")
	private String legalPersonIdNumber;

	/**
	 * 法人姓名
	 */
	@ApiField("legal_person_name")
	private String legalPersonName;

	/**
	 * 法人手机号
	 */
	@ApiField("legal_person_phone")
	private String legalPersonPhone;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户简称
	 */
	@ApiField("merchant_short_name")
	private String merchantShortName;

	/**
	 * 门头照
	 */
	@ApiField("out_door_pic")
	private String outDoorPic;

	/**
	 * 申请单号，保证唯一，幂等处理
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 根据thirdpay_org定义，现阶段填写huifu_id
	 */
	@ApiField("thirdpay_mer_id")
	private String thirdpayMerId;

	/**
	 * 类型
	 */
	@ApiField("thirdpay_org")
	private String thirdpayOrg;

	public String getAuditMemo() {
		return this.auditMemo;
	}
	public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getBankAccountType() {
		return this.bankAccountType;
	}
	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public AddressBean getBankAddress() {
		return this.bankAddress;
	}
	public void setBankAddress(AddressBean bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankBranchName() {
		return this.bankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getBankCardFrontPic() {
		return this.bankCardFrontPic;
	}
	public void setBankCardFrontPic(String bankCardFrontPic) {
		this.bankCardFrontPic = bankCardFrontPic;
	}

	public String getBankCardNumber() {
		return this.bankCardNumber;
	}
	public void setBankCardNumber(String bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBusinessEntityType() {
		return this.businessEntityType;
	}
	public void setBusinessEntityType(String businessEntityType) {
		this.businessEntityType = businessEntityType;
	}

	public String getBusinessEnvironmentPic() {
		return this.businessEnvironmentPic;
	}
	public void setBusinessEnvironmentPic(String businessEnvironmentPic) {
		this.businessEnvironmentPic = businessEnvironmentPic;
	}

	public String getBusinessLicenseEndDate() {
		return this.businessLicenseEndDate;
	}
	public void setBusinessLicenseEndDate(String businessLicenseEndDate) {
		this.businessLicenseEndDate = businessLicenseEndDate;
	}

	public String getBusinessLicensePic() {
		return this.businessLicensePic;
	}
	public void setBusinessLicensePic(String businessLicensePic) {
		this.businessLicensePic = businessLicensePic;
	}

	public String getBusinessLicenseStartDate() {
		return this.businessLicenseStartDate;
	}
	public void setBusinessLicenseStartDate(String businessLicenseStartDate) {
		this.businessLicenseStartDate = businessLicenseStartDate;
	}

	public String getCashierDeskPic() {
		return this.cashierDeskPic;
	}
	public void setCashierDeskPic(String cashierDeskPic) {
		this.cashierDeskPic = cashierDeskPic;
	}

	public AddressBean getCompanyAddress() {
		return this.companyAddress;
	}
	public void setCompanyAddress(AddressBean companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyCode() {
		return this.companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyCodeType() {
		return this.companyCodeType;
	}
	public void setCompanyCodeType(String companyCodeType) {
		this.companyCodeType = companyCodeType;
	}

	public String getCompanyFullName() {
		return this.companyFullName;
	}
	public void setCompanyFullName(String companyFullName) {
		this.companyFullName = companyFullName;
	}

	public String getEmergencyContactPhone() {
		return this.emergencyContactPhone;
	}
	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	public String getEstablishmentDate() {
		return this.establishmentDate;
	}
	public void setEstablishmentDate(String establishmentDate) {
		this.establishmentDate = establishmentDate;
	}

	public String getIdCardAddress() {
		return this.idCardAddress;
	}
	public void setIdCardAddress(String idCardAddress) {
		this.idCardAddress = idCardAddress;
	}

	public String getIdCardBackPic() {
		return this.idCardBackPic;
	}
	public void setIdCardBackPic(String idCardBackPic) {
		this.idCardBackPic = idCardBackPic;
	}

	public String getIdCardEndDate() {
		return this.idCardEndDate;
	}
	public void setIdCardEndDate(String idCardEndDate) {
		this.idCardEndDate = idCardEndDate;
	}

	public String getIdCardFrontPic() {
		return this.idCardFrontPic;
	}
	public void setIdCardFrontPic(String idCardFrontPic) {
		this.idCardFrontPic = idCardFrontPic;
	}

	public String getIdCardStartDate() {
		return this.idCardStartDate;
	}
	public void setIdCardStartDate(String idCardStartDate) {
		this.idCardStartDate = idCardStartDate;
	}

	public String getLegalPersonIdNumber() {
		return this.legalPersonIdNumber;
	}
	public void setLegalPersonIdNumber(String legalPersonIdNumber) {
		this.legalPersonIdNumber = legalPersonIdNumber;
	}

	public String getLegalPersonName() {
		return this.legalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		this.legalPersonName = legalPersonName;
	}

	public String getLegalPersonPhone() {
		return this.legalPersonPhone;
	}
	public void setLegalPersonPhone(String legalPersonPhone) {
		this.legalPersonPhone = legalPersonPhone;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantShortName() {
		return this.merchantShortName;
	}
	public void setMerchantShortName(String merchantShortName) {
		this.merchantShortName = merchantShortName;
	}

	public String getOutDoorPic() {
		return this.outDoorPic;
	}
	public void setOutDoorPic(String outDoorPic) {
		this.outDoorPic = outDoorPic;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getThirdpayMerId() {
		return this.thirdpayMerId;
	}
	public void setThirdpayMerId(String thirdpayMerId) {
		this.thirdpayMerId = thirdpayMerId;
	}

	public String getThirdpayOrg() {
		return this.thirdpayOrg;
	}
	public void setThirdpayOrg(String thirdpayOrg) {
		this.thirdpayOrg = thirdpayOrg;
	}

}
