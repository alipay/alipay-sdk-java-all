package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签约参数。用于sdk支付并签约中传入签约信息。
 *
 * @author auto create
 * @since 1.0, 2024-09-04 20:08:37
 */
public class SignParams extends AlipayObject {

	private static final long serialVersionUID = 2854328679168625397L;

	/**
	 * 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。
	 */
	@ApiField("access_params")
	private AccessParams accessParams;

	/**
	 * 是否允许花芝GO降级成原代扣（即销售方案指定的代扣产品），在花芝GO场景下才会使用该值。取值：true-允许降级，false-不允许降级。默认为true。
	 */
	@ApiField("allow_huazhi_degrade")
	private Boolean allowHuazhiDegrade;

	/**
	 * 设置签约请求的有效时间，单位为秒。如传入600，商户发起签约请求到用户进入支付宝签约页面的时间差不能超过10分钟。
	 */
	@ApiField("effect_time")
	private String effectTime;

	/**
	 * 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值。
	 */
	@ApiField("external_agreement_no")
	private String externalAgreementNo;

	/**
	 * 用户在商户网站的登录账号，用于在签约页面展示，如果为空，则不展示
	 */
	@ApiField("external_logon_id")
	private String externalLogonId;

	/**
	 * 周期管控规则参数period_rule_params，在签约周期扣款产品（如CYCLE_PAY_AUTH_P）时必传，在签约其他产品时无需传入。 周期扣款产品，会按照这里传入的参数提示用户，并对发起扣款的时间、金额、次数等做相应限制。
	 */
	@ApiField("period_rule_params")
	private PeriodRuleParams periodRuleParams;

	/**
	 * 个人签约产品码，商户和支付宝签约时确定。
	 */
	@ApiField("personal_product_code")
	private String personalProductCode;

	/**
	 * 商家和支付宝签约的产品码。 商家扣款产品传入固定值：GENERAL_WITHHOLDING
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户指定优先渠道扣款参数
	 */
	@ApiListField("recommend_sort_channel_params")
	@ApiField("open_api_specified_channel_params_pojo")
	private List<OpenApiSpecifiedChannelParamsPojo> recommendSortChannelParams;

	/**
	 * 签约成功后商户用于接收异步通知的地址。如果不传入，签约与支付的异步通知都会发到外层notify_url参数传入的地址；如果外层也未传入，签约与支付的异步通知都会发到商户appid配置的网关地址。
	 */
	@ApiField("sign_notify_url")
	private String signNotifyUrl;

	/**
	 * 协议签约场景，商户和支付宝签约时确定，商户可咨询技术支持。
	 */
	@ApiField("sign_scene")
	private String signScene;

	/**
	 * 此参数用于传递子商户信息，无特殊需求时不用关注。目前商户代扣、海外代扣、淘旅行信用住产品支持传入该参数（在销售方案中“是否允许自定义子商户信息”需要选是）。
	 */
	@ApiField("sub_merchant")
	private SignMerchantParams subMerchant;

	public AccessParams getAccessParams() {
		return this.accessParams;
	}
	public void setAccessParams(AccessParams accessParams) {
		this.accessParams = accessParams;
	}

	public Boolean getAllowHuazhiDegrade() {
		return this.allowHuazhiDegrade;
	}
	public void setAllowHuazhiDegrade(Boolean allowHuazhiDegrade) {
		this.allowHuazhiDegrade = allowHuazhiDegrade;
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

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<OpenApiSpecifiedChannelParamsPojo> getRecommendSortChannelParams() {
		return this.recommendSortChannelParams;
	}
	public void setRecommendSortChannelParams(List<OpenApiSpecifiedChannelParamsPojo> recommendSortChannelParams) {
		this.recommendSortChannelParams = recommendSortChannelParams;
	}

	public String getSignNotifyUrl() {
		return this.signNotifyUrl;
	}
	public void setSignNotifyUrl(String signNotifyUrl) {
		this.signNotifyUrl = signNotifyUrl;
	}

	public String getSignScene() {
		return this.signScene;
	}
	public void setSignScene(String signScene) {
		this.signScene = signScene;
	}

	public SignMerchantParams getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SignMerchantParams subMerchant) {
		this.subMerchant = subMerchant;
	}

}
