package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝个人协议签约接口
 *
 * @author auto create
 * @since 1.0, 2021-09-30 18:24:57
 */
public class AlipayUserAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 1783798336611395238L;

	/**
	 * 用户的支付宝登录账号，支持邮箱或手机号码格式。
本参数与alipay_user_id不可同时为空，若都填写，则以alipay_user_id为准。
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 用户的支付宝id，本参数与alipay_logon_id不可同时为空，若都填写，则以本参数为准，优先级高于alipay_logon_id。
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 资产信息，针对于泛金融机构，签约时必须传入资产信息。json格式。
	 */
	@ApiField("asset_params")
	private AssetParams assetParams;

	/**
	 * 支付宝账户绑定的手机，系统会对账户绑定的手机与传入的手机号做一致性校验。
商户调用必传。
阿里集团内部调用，可不传。
	 */
	@ApiField("binded_mobile")
	private String bindedMobile;

	/**
	 * 签约确认方式，用户进行协议签约时的确认方式，不同产品所支持的确认方式不同。
目前仅支持如下两类：
M：手机校验码回填确认方式。
如果为空，则默认为无需用户确认。
	 */
	@ApiField("confirm_type")
	private String confirmType;

	/**
	 * 设备信息参数，在使用设备维度签约代扣协议时，可以传这些信息
	 */
	@ApiField("device_params")
	private DeviceParams deviceParams;

	/**
	 * 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。
自定义传入，格式规则：支持大写小写字母和数字，最长32位。
商户系统按需传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 用户在商户网站的登录账号，用于在签约页面展示，如果为空，则不展示
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 业务透传参数
	 */
	@ApiField("pass_params")
	private String passParams;

	/**
	 * 周期管控规则参数period_rule_params，在签约周期扣款产品（如CYCLE_PAY_AUTH_P）时必传，在签约其他产品时无需传入。 周期扣款产品，会按照这里传入的参数提示用户，并对发起扣款的时间、金额、次数等做相应限制。
	 */
	@ApiField("period_rule_params")
	private PeriodRuleParams periodRuleParams;

	/**
	 * 个人签约产品码，商户和支付宝签约时确定，商户可咨询技术支持。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 签约产品属性，json格式
	 */
	@ApiField("prod_params")
	private ProdParams prodParams;

	/**
	 * 销售产品码，商户签约的支付宝合同所对应的产品码。
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 签约营销参数，此值为json格式；具体的key需与营销约定
	 */
	@ApiField("promo_params")
	private String promoParams;

	/**
	 * 卡id(由固定前缀+32位数字构成)
	 */
	@ApiField("provisioning_bundle_id")
	private String provisioningBundleId;

	/**
	 * 协议签约场景，商户和支付宝签约时确定，商户可咨询技术支持。
当传入商户签约号external_sign_no时，场景不能为默认值DEFAULT|DEFAULT。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 当前用户签约请求的协议有效周期。
整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。
目前支持的时间单位：
1. d：天
2. m：月
如果未传入，默认为长期有效。
	 */
	@ApiField("sign_validity_period")
	private String signValidityPeriod;

	/**
	 * 商户希望该协议在代扣支付时指定使用的资产列表，如指定只能使用余额支付
	 */
	@ApiListField("specified_channel")
	@ApiField("specified_channel_param")
	private List<SpecifiedChannelParam> specifiedChannel;

	/**
	 * 此参数用于传递子商户信息，目前商户代扣、海外代扣、淘旅行信用住产品支持传入该参数(销售方案中是否允许自定义子商户信息选是)；
目前支持四个key值：
sub_merchant_id (子商户id)
sub_merchant_name (子商户名称)
sub_merchant_service_name (子商户服务名称)
sub_merchant_service_description (子商户服务描述)
	 */
	@ApiField("sub_merchant")
	private String subMerchant;

	/**
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。
取值范围：
1. PARTNER（平台商户）
2. MERCHANT（集团商户），集团下子商户可共享用户签约内容
默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	/**
	 * 商户希望限制的签约用户的年龄范围，min表示可签该协议的用户年龄下限，max表示年龄上限。如{"min": "18","max": "30"}表示18=<年龄<=30的用户可以签约该协议。
	 */
	@ApiField("user_age_range")
	private String userAgeRange;

	/**
	 * 校验信息，针对双因子校验逻辑，如果logonId为email时，必须传入证件号后4位信息。Json格式。
	 */
	@ApiField("verify_params")
	private VerifyParams verifyParams;

	/**
	 * 芝麻授权信息，针对于信用代扣签约。json格式。
	 */
	@ApiField("zm_auth_params")
	private ZmAuthParams zmAuthParams;

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public AssetParams getAssetParams() {
		return this.assetParams;
	}
	public void setAssetParams(AssetParams assetParams) {
		this.assetParams = assetParams;
	}

	public String getBindedMobile() {
		return this.bindedMobile;
	}
	public void setBindedMobile(String bindedMobile) {
		this.bindedMobile = bindedMobile;
	}

	public String getConfirmType() {
		return this.confirmType;
	}
	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
	}

	public DeviceParams getDeviceParams() {
		return this.deviceParams;
	}
	public void setDeviceParams(DeviceParams deviceParams) {
		this.deviceParams = deviceParams;
	}

	public String getExternalAgreementNo() {
		return this.externalAgreementNo;
	}
	public void setExternalAgreementNo(String externalAgreementNo) {
		this.externalAgreementNo = externalAgreementNo;
	}

	public String getExternalLogonId() {
		return this.externalLogonId;
	}
	public void setExternalLogonId(String externalLogonId) {
		this.externalLogonId = externalLogonId;
	}

	public String getPassParams() {
		return this.passParams;
	}
	public void setPassParams(String passParams) {
		this.passParams = passParams;
	}

	public PeriodRuleParams getPeriodRuleParams() {
		return this.periodRuleParams;
	}
	public void setPeriodRuleParams(PeriodRuleParams periodRuleParams) {
		this.periodRuleParams = periodRuleParams;
	}

	public String getPersonalProductCode() {
		return this.personalProductCode;
	}
	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

	public ProdParams getProdParams() {
		return this.prodParams;
	}
	public void setProdParams(ProdParams prodParams) {
		this.prodParams = prodParams;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getPromoParams() {
		return this.promoParams;
	}
	public void setPromoParams(String promoParams) {
		this.promoParams = promoParams;
	}

	public String getProvisioningBundleId() {
		return this.provisioningBundleId;
	}
	public void setProvisioningBundleId(String provisioningBundleId) {
		this.provisioningBundleId = provisioningBundleId;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public String getSignValidityPeriod() {
		return this.signValidityPeriod;
	}
	public void setSignValidityPeriod(String signValidityPeriod) {
		this.signValidityPeriod = signValidityPeriod;
	}

	public List<SpecifiedChannelParam> getSpecifiedChannel() {
		return this.specifiedChannel;
	}
	public void setSpecifiedChannel(List<SpecifiedChannelParam> specifiedChannel) {
		this.specifiedChannel = specifiedChannel;
	}

	public String getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(String subMerchant) {
		this.subMerchant = subMerchant;
	}

	public String getThirdPartyType() {
		return this.thirdPartyType;
	}
	public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}

	public String getUserAgeRange() {
		return this.userAgeRange;
	}
	public void setUserAgeRange(String userAgeRange) {
		this.userAgeRange = userAgeRange;
	}

	public VerifyParams getVerifyParams() {
		return this.verifyParams;
	}
	public void setVerifyParams(VerifyParams verifyParams) {
		this.verifyParams = verifyParams;
	}

	public ZmAuthParams getZmAuthParams() {
		return this.zmAuthParams;
	}
	public void setZmAuthParams(ZmAuthParams zmAuthParams) {
		this.zmAuthParams = zmAuthParams;
	}

}
