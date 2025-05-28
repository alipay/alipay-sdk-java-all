package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 还款业务单代扣协议签约
 *
 * @author auto create
 * @since 1.0, 2024-12-27 15:48:28
 */
public class AlipayCommerceWithholdrepayorderAgreementSignModel extends AlipayObject {

	private static final long serialVersionUID = 6193232984797618159L;

	/**
	 * 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。 扫码或者短信页面签约需要拼装http的请求地址访问中间页面，钱包h5页面签约可直接拼接scheme的请求地址
	 */
	@ApiField("access_params")
	private AccessParams accessParams;

	/**
	 * 协议生效类型, 用于指定协议是立即生效还是等待商户通知再生效. 可空, 不填默认为立即生效.
	 */
	@ApiField("agreement_effect_type")
	private String agreementEffectType;

	/**
	 * 是否允许花芝GO降级成原代扣（即销售方案指定的代扣产品），在花芝GO场景下才会使用该值。取值：true-允许降级，false-不允许降级。默认为true。
	 */
	@ApiField("allow_huazhi_degrade")
	private Boolean allowHuazhiDegrade;

	/**
	 * 设备信息参数，在使用设备维度签约代扣协议时，可以传这些信息
	 */
	@ApiField("device_params")
	private DeviceParam deviceParams;

	/**
	 * 签约有效时间限制，单位是秒，有效范围是0-86400，商户传入此字段会用商户传入的值否则使用支付宝侧默认值，在有效时间外进行签约，会进行安全拦截；（备注：此字段适用于需要开通安全防控的商户，且依赖商户传入生成签约时的时间戳字段timestamp）
	 */
	@ApiField("effect_time")
	private String effectTime;

	/**
	 * 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 用户在商户网站的登录账号，用于在签约页面展示，如果为空，则不展示
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 用户实名信息参数，包含：姓名、身份证号、签约指定uid。商户传入用户实名信息参数，支付宝会对比用户在支付宝端的实名信息。
	 */
	@ApiField("identity_params")
	private IdentityParamDetails identityParams;

	/**
	 * 参数名：跳转商户处理url 应用场景：商户需要在签约流程中跳转到商户自己的页面做处理的场景，如获得用户授权获取实名信息等 如何获取：商户自己提供的页面地址 特殊说明：商户如果传递此参数，则会在签约流程中跳转所传递的地址，不传则不会跳转
	 */
	@ApiField("merchant_process_url")
	private String merchantProcessUrl;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务透传参数
	 */
	@ApiField("pass_params")
	private String passParams;

	/**
	 * 还款总期数
	 */
	@ApiField("period_count")
	private Long periodCount;

	/**
	 * 周期管控规则参数period_rule_params，在签约周期扣款产品（如CYCLE_PAY_AUTH_P）时必传，在签约其他产品时无需传入。 周期扣款产品，会按照这里传入的参数提示用户，并对发起扣款的时间、金额、次数等做相应限制。
	 */
	@ApiField("period_rule_params")
	private PeriodRuleParam periodRuleParams;

	/**
	 * 个人签约产品码，商户和支付宝签约时确定，商户可咨询技术支持。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 还款计划详情
	 */
	@ApiListField("plan_detail")
	@ApiField("open_api_withhold_plan_detail_pojo")
	private List<OpenApiWithholdPlanDetailPojo> planDetail;

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
	 * 协议签约场景，商户可根据 代扣产品常见场景值 选择符合自身的行业场景。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 当前用户签约请求的协议有效周期。 整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。 目前支持的时间单位： 1. d：天 2. m：月 如果未传入，默认为长期有效。
	 */
	@ApiField("sign_validity_period")
	private String signValidityPeriod;

	/**
	 * 商户签约指定可用渠道
	 */
	@ApiField("specified_asset")
	private SpecifiedAssets specifiedAsset;

	/**
	 * 商户指定优先扣款渠道
	 */
	@ApiField("specified_sort_channel_params")
	private SpecifiedChannelParams specifiedSortChannelParams;

	/**
	 * 此参数用于传递子商户信息，无特殊需求时不用关注。目前商户代扣、海外代扣、淘旅行信用住产品支持传入该参数（在销售方案中“是否允许自定义子商户信息”需要选是）。
	 */
	@ApiField("sub_merchant")
	private SubMerchantParam subMerchant;

	/**
	 * 签约第三方主体类型。对于三方协议，表示当前用户和哪一类的第三方主体进行签约。 默认为PARTNER。
	 */
	@ApiField("third_party_type")
	private String thirdPartyType;

	/**
	 * 总计还款金额（单位分）
	 */
	@ApiField("total_repay_amount")
	private Long totalRepayAmount;

	/**
	 * 商户希望限制的签约用户的年龄范围，min表示可签该协议的用户年龄下限，max表示年龄上限。如{"min": "18","max": "30"}表示18=<年龄<=30的用户可以签约该协议。
	 */
	@ApiField("user_age_range")
	private String userAgeRange;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 芝麻授权信息，针对于信用代扣签约。json格式。
	 */
	@ApiField("zm_auth_params")
	private ZmAuthParams zmAuthParams;

	public AccessParams getAccessParams() {
		return this.accessParams;
	}
	public void setAccessParams(AccessParams accessParams) {
		this.accessParams = accessParams;
	}

	public String getAgreementEffectType() {
		return this.agreementEffectType;
	}
	public void setAgreementEffectType(String agreementEffectType) {
		this.agreementEffectType = agreementEffectType;
	}

	public Boolean getAllowHuazhiDegrade() {
		return this.allowHuazhiDegrade;
	}
	public void setAllowHuazhiDegrade(Boolean allowHuazhiDegrade) {
		this.allowHuazhiDegrade = allowHuazhiDegrade;
	}

	public DeviceParam getDeviceParams() {
		return this.deviceParams;
	}
	public void setDeviceParams(DeviceParam deviceParams) {
		this.deviceParams = deviceParams;
	}

	public String getEffectTime() {
		return this.effectTime;
	}
	public void setEffectTime(String effectTime) {
		this.effectTime = effectTime;
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

	public IdentityParamDetails getIdentityParams() {
		return this.identityParams;
	}
	public void setIdentityParams(IdentityParamDetails identityParams) {
		this.identityParams = identityParams;
	}

	public String getMerchantProcessUrl() {
		return this.merchantProcessUrl;
	}
	public void setMerchantProcessUrl(String merchantProcessUrl) {
		this.merchantProcessUrl = merchantProcessUrl;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPassParams() {
		return this.passParams;
	}
	public void setPassParams(String passParams) {
		this.passParams = passParams;
	}

	public Long getPeriodCount() {
		return this.periodCount;
	}
	public void setPeriodCount(Long periodCount) {
		this.periodCount = periodCount;
	}

	public PeriodRuleParam getPeriodRuleParams() {
		return this.periodRuleParams;
	}
	public void setPeriodRuleParams(PeriodRuleParam periodRuleParams) {
		this.periodRuleParams = periodRuleParams;
	}

	public String getPersonalProductCode() {
		return this.personalProductCode;
	}
	public void setPersonalProductCode(String personalProductCode) {
		this.personalProductCode = personalProductCode;
	}

	public List<OpenApiWithholdPlanDetailPojo> getPlanDetail() {
		return this.planDetail;
	}
	public void setPlanDetail(List<OpenApiWithholdPlanDetailPojo> planDetail) {
		this.planDetail = planDetail;
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

	public SpecifiedAssets getSpecifiedAsset() {
		return this.specifiedAsset;
	}
	public void setSpecifiedAsset(SpecifiedAssets specifiedAsset) {
		this.specifiedAsset = specifiedAsset;
	}

	public SpecifiedChannelParams getSpecifiedSortChannelParams() {
		return this.specifiedSortChannelParams;
	}
	public void setSpecifiedSortChannelParams(SpecifiedChannelParams specifiedSortChannelParams) {
		this.specifiedSortChannelParams = specifiedSortChannelParams;
	}

	public SubMerchantParam getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SubMerchantParam subMerchant) {
		this.subMerchant = subMerchant;
	}

	public String getThirdPartyType() {
		return this.thirdPartyType;
	}
	public void setThirdPartyType(String thirdPartyType) {
		this.thirdPartyType = thirdPartyType;
	}

	public Long getTotalRepayAmount() {
		return this.totalRepayAmount;
	}
	public void setTotalRepayAmount(Long totalRepayAmount) {
		this.totalRepayAmount = totalRepayAmount;
	}

	public String getUserAgeRange() {
		return this.userAgeRange;
	}
	public void setUserAgeRange(String userAgeRange) {
		this.userAgeRange = userAgeRange;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public ZmAuthParams getZmAuthParams() {
		return this.zmAuthParams;
	}
	public void setZmAuthParams(ZmAuthParams zmAuthParams) {
		this.zmAuthParams = zmAuthParams;
	}

}
