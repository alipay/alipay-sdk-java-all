package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 工商个体户入驻接口
 *
 * @author auto create
 * @since 1.0, 2016-09-26 13:19:43
 */
public class AntMerchantExpandPersonalApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6373869185284228571L;

	/**
	 * 企业基本信息
	 */
	@ApiField("base_info")
	private BaseInfo baseInfo;

	/**
	 * 营业执照信息
	 */
	@ApiField("business_license_info")
	private BusinessLicenceInfo businessLicenseInfo;

	/**
	 * 支付宝登录别名,邮箱地址或手机号码，入驻申请结果会通知到该邮箱地址或手机号码。如填入的是已有的企业版支付宝账号则后续认证与签约基于该账号进行，如填入的邮箱地址或手机号码没有对应的支付宝账号则用该邮箱地址或手机号码创建一个企业版支付宝账户，如填入的是已有的非企业版支付宝账号则预校验失败。
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 个体工商户经营者信息
	 */
	@ApiField("operator_info")
	private OperatorInfo operatorInfo;

	/**
	 * 外部入驻申请单据号，需保证在开发者端不重复
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 工商个体户或个人银行账户信息
	 */
	@ApiField("personal_bank_account_info")
	private PersonnalBankAccountInfo personalBankAccountInfo;

	/**
	 * 门店信息
	 */
	@ApiField("shop_info")
	private ShopInfo shopInfo;

	public BaseInfo getBaseInfo() {
		return this.baseInfo;
	}
	public void setBaseInfo(BaseInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	public BusinessLicenceInfo getBusinessLicenseInfo() {
		return this.businessLicenseInfo;
	}
	public void setBusinessLicenseInfo(BusinessLicenceInfo businessLicenseInfo) {
		this.businessLicenseInfo = businessLicenseInfo;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public OperatorInfo getOperatorInfo() {
		return this.operatorInfo;
	}
	public void setOperatorInfo(OperatorInfo operatorInfo) {
		this.operatorInfo = operatorInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public PersonnalBankAccountInfo getPersonalBankAccountInfo() {
		return this.personalBankAccountInfo;
	}
	public void setPersonalBankAccountInfo(PersonnalBankAccountInfo personalBankAccountInfo) {
		this.personalBankAccountInfo = personalBankAccountInfo;
	}

	public ShopInfo getShopInfo() {
		return this.shopInfo;
	}
	public void setShopInfo(ShopInfo shopInfo) {
		this.shopInfo = shopInfo;
	}

}
