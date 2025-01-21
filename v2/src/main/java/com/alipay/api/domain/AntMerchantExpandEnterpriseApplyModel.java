package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户入驻接口
 *
 * @author auto create
 * @since 1.0, 2021-04-19 17:35:27
 */
public class AntMerchantExpandEnterpriseApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3554198976551173737L;

	/**
	 * 企业基础信息
	 */
	@ApiField("base_info")
	private BaseInfo baseInfo;

	/**
	 * 企业对公账户信息
	 */
	@ApiField("business_bank_account_info")
	private BusinessBankAccountInfo businessBankAccountInfo;

	/**
	 * 企业营业执照信息
	 */
	@ApiField("business_license_info")
	private BusinessLicenceInfo businessLicenseInfo;

	/**
	 * 企业级商户法人信息
	 */
	@ApiField("legal_representative_info")
	private LegalRepresentativeInfo legalRepresentativeInfo;

	/**
	 * 支付宝登录别名,必须是邮箱地址。入驻申请结果会通知到该邮箱地址或手机号码。如填入的是已有的企业版支付宝账号则后续认证与签约基于该账号进行，如填入的邮箱地址没有对应的支付宝账号则用该邮箱地址创建一个企业版支付宝账户，如填入的是已有的非企业版支付宝账号则预校验失败。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 外部入驻申请单据号，需保证在开发者端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 企业的门店信息，签约当面付时必选
	 */
	@ApiField("shop_info")
	private ShopInfo shopInfo;

	public BaseInfo getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(BaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	public BusinessBankAccountInfo getBusinessBankAccountInfo() {
		return this.businessBankAccountInfo;
	}
	public void setBusinessBankAccountInfo(BusinessBankAccountInfo businessBankAccountInfo) {
		this.businessBankAccountInfo = businessBankAccountInfo;
	}

	public BusinessLicenceInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}
	public void setBusinessLicenseInfo(BusinessLicenceInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}

	public LegalRepresentativeInfo getLegalRepresentativeInfo() {
		return this.legalRepresentativeInfo;
	}
	public void setLegalRepresentativeInfo(LegalRepresentativeInfo legalRepresentativeInfo) {
		this.legalRepresentativeInfo = legalRepresentativeInfo;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public ShopInfo getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

}
