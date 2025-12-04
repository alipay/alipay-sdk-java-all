package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发起业务开通
 *
 * @author auto create
 * @since 1.0, 2025-06-11 10:50:57
 */
public class AntMerchantExpandBizaccessOrderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6346122857517516962L;

	/**
	 * 受益人证照
	 */
	@ApiField("benefit_info")
	private CertificateInfoForEntry benefitInfo;

	/**
	 * 关联外部单号
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 服务商抽佣信息。本对象为空表示无需抽佣配置。一期只支持传入一个
	 */
	@ApiListField("isv_commission_info")
	@ApiField("isv_commission_info")
	private List<IsvCommissionInfo> isvCommissionInfo;

	/**
	 * 法人证照
	 */
	@ApiField("legal_info")
	private CertificateInfoForEntry legalInfo;

	/**
	 * 法人登录号
	 */
	@ApiField("legal_person_logon_id")
	private String legalPersonLogonId;

	/**
	 * 商家主体证件信息。对于企业或个体户商户，其值为营业执照信息。事业单位、民办非当前无需传入。
	 */
	@ApiField("license_info")
	private CommonMerchantLicenseInfo licenseInfo;

	/**
	 * 商户二级类目code，当该字段为空时，则使用商户本身的mccCode进行业务开通。
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 商户登录号
	 */
	@ApiField("merchant_logon_id")
	private String merchantLogonId;

	/**
	 * 商户名称。对于企业和个体户，值为营业执照上的名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 商户类型
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 是否需要代开发授权，默认为false。注意，如果重复发起代开发授权，会刷新商户的token。请调用后参考文档进行token重新获取。https://opendocs.alipay.com/isv/03l4iy?pathHash=92c490b7
	 */
	@ApiField("need_interface_auth")
	private Boolean needInterfaceAuth;

	/**
	 * 是否需要代运营授权，默认为false
	 */
	@ApiField("need_operation_auth")
	private Boolean needOperationAuth;

	/**
	 * 是否需要代入驻
	 */
	@ApiField("need_register_merchant")
	private Boolean needRegisterMerchant;

	/**
	 * 某些场景，允许传入可选开通的产品。具体传参与业务BD联系沟通
	 */
	@ApiListField("optional_front_prod_code")
	@ApiField("string")
	private List<String> optionalFrontProdCode;

	/**
	 * 联系方式
	 */
	@ApiField("phone")
	private String phone;

	/**
	 * 价格信息
	 */
	@ApiListField("price_infos")
	@ApiField("merchant_price_related_info")
	private List<MerchantPriceRelatedInfo> priceInfos;

	/**
	 * 商户上传资质详情
	 */
	@ApiListField("qualifications")
	@ApiField("common_merchant_license_info")
	private List<CommonMerchantLicenseInfo> qualifications;

	/**
	 * 服务商代商户业务开通的业务场景码，目前已开放AXF_MERCHANT_PERIOD_PAY安心付周期卡
	 */
	@ApiListField("scene_biz_code")
	@ApiField("string")
	private List<String> sceneBizCode;

	public CertificateInfoForEntry getBenefitInfo() {
		return this.benefitInfo;
	}
	public void setBenefitInfo(CertificateInfoForEntry benefitInfo) {
		this.benefitInfo = benefitInfo;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public List<IsvCommissionInfo> getIsvCommissionInfo() {
		return this.isvCommissionInfo;
	}
	public void setIsvCommissionInfo(List<IsvCommissionInfo> isvCommissionInfo) {
		this.isvCommissionInfo = isvCommissionInfo;
	}

	public CertificateInfoForEntry getLegalInfo() {
		return this.legalInfo;
	}
	public void setLegalInfo(CertificateInfoForEntry legalInfo) {
		this.legalInfo = legalInfo;
	}

	public String getLegalPersonLogonId() {
		return this.legalPersonLogonId;
	}
	public void setLegalPersonLogonId(String legalPersonLogonId) {
		this.legalPersonLogonId = legalPersonLogonId;
	}

	public CommonMerchantLicenseInfo getLicenseInfo() {
		return this.licenseInfo;
	}
	public void setLicenseInfo(CommonMerchantLicenseInfo licenseInfo) {
		this.licenseInfo = licenseInfo;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getMerchantLogonId() {
		return this.merchantLogonId;
	}
	public void setMerchantLogonId(String merchantLogonId) {
		this.merchantLogonId = merchantLogonId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public Boolean getNeedInterfaceAuth() {
		return this.needInterfaceAuth;
	}
	public void setNeedInterfaceAuth(Boolean needInterfaceAuth) {
		this.needInterfaceAuth = needInterfaceAuth;
	}

	public Boolean getNeedOperationAuth() {
		return this.needOperationAuth;
	}
	public void setNeedOperationAuth(Boolean needOperationAuth) {
		this.needOperationAuth = needOperationAuth;
	}

	public Boolean getNeedRegisterMerchant() {
		return this.needRegisterMerchant;
	}
	public void setNeedRegisterMerchant(Boolean needRegisterMerchant) {
		this.needRegisterMerchant = needRegisterMerchant;
	}

	public List<String> getOptionalFrontProdCode() {
		return this.optionalFrontProdCode;
	}
	public void setOptionalFrontProdCode(List<String> optionalFrontProdCode) {
		this.optionalFrontProdCode = optionalFrontProdCode;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<MerchantPriceRelatedInfo> getPriceInfos() {
		return this.priceInfos;
	}
	public void setPriceInfos(List<MerchantPriceRelatedInfo> priceInfos) {
		this.priceInfos = priceInfos;
	}

	public List<CommonMerchantLicenseInfo> getQualifications() {
		return this.qualifications;
	}
	public void setQualifications(List<CommonMerchantLicenseInfo> qualifications) {
		this.qualifications = qualifications;
	}

	public List<String> getSceneBizCode() {
		return this.sceneBizCode;
	}
	public void setSceneBizCode(List<String> sceneBizCode) {
		this.sceneBizCode = sceneBizCode;
	}

}
