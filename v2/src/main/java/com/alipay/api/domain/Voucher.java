package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券对象
 *
 * @author auto create
 * @since 1.0, 2019-06-25 19:47:25
 */
public class Voucher extends AlipayObject {

	private static final long serialVersionUID = 1758321992686224329L;

	/**
	 * 是否允许拆分，券在核销的时候是否允许券的面额拆分使用。(仅限渠道类型为ISV企业福利：ISV_ENTERPRISE_BENIFIT的场景使用)
	 */
	@ApiField("allow_split")
	private Boolean allowSplit;

	/**
	 * 券剩余面额，单位元
券详情查询接口返回，可拆分券中的券详情展示用
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 券副标题
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 券的说明条款
	 */
	@ApiListField("clause_terms")
	@ApiField("clause_term")
	private List<ClauseTerm> clauseTerms;

	/**
	 * 延迟生效信息
	 */
	@ApiField("delay_info")
	private DelayInfo delayInfo;

	/**
	 * 券详细说明
最多包含500个字符
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 券使用说明描述列表
	 */
	@ApiListField("desc_detail_list")
	@ApiField("voucher_desc_detail")
	private List<VoucherDescDetail> descDetailList;

	/**
	 * 券的展示信息
	 */
	@ApiField("display_config")
	private DisplayConfig displayConfig;

	/**
	 * 券是否可转赠，默认为可转赠
	 */
	@ApiField("donate_flag")
	private String donateFlag;

	/**
	 * 券生效的方式，目前支持以下方式
立即生效：IMMEDIATELY
延迟生效：DELAY
仅在券有效期类型为相对有效期时生效
	 */
	@ApiField("effect_type")
	private String effectType;

	/**
	 * 券有效期的结束时间
仅在券有效期类型为绝对有效期时生效
必须晚于活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 券的扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 单品信息
兑换券不允许设置单品信息
减至券必须设置单品信息
其他类型券可按需设置
	 */
	@ApiField("item_info")
	private ItemInfo itemInfo;

	/**
	 * 券LOGO文件ID，调用图片上传接口alipay.offline.material.image.upload获得
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 最高优惠金额，单位元
指用券最高可以优惠的金额
必须为合法金额类型字符串仅当券类型为折扣券（RATE），每满减券（PER_FULL_CUT）有效
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 券叠加的属性，
仅全场券可设置该选项；
NO_MULTI:不可与其他全场券和单品券叠加;
MULTI_USE_WITH_SINGLE:
该全场优惠和单品优惠的叠加
；MULTI_USE_WITH_OTHE
RS:该全场优惠和其他所有优惠都可以叠加
	 */
	@ApiField("multi_use_mode")
	private String multiUseMode;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 折扣率
仅当券类型为折扣券时有效
有效折扣率取值范围0.11-0.99
仅允许保留小数点后两位
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 券相对有效期，单位天
仅在券有效期类型为相对有效期时生效
如，设5表示领券领取后5日内有效
	 */
	@ApiField("relative_time")
	private String relativeTime;

	/**
	 * 券核销时，抹零方式，目前支持：
NOT_AUTO_ROUNDING:不自动抹零
AUTO_ROUNDING_YUAN:自动抹零到元
AUTO_ROUNDING_JIAO:自动抹零到角
ROUNDING_UP_YUAN:四舍五入到元
ROUNDING_UP_JIAO:四舍五入到角
	 */
	@ApiField("rounding_rule")
	private String roundingRule;

	/**
	 * 券有效期的开始时间
仅在券有效期类型为绝对有效期时生效
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 券类型，目前支持以下类型：
EXCHANGE：兑换券；
MONEY：代金券；
REDUCETO：减至券；
RATE：折扣券；
PER_FULL_CUT：每满减券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 券的使用说明
使用须知最多6条，且每条最多100字
	 */
	@ApiListField("use_instructions")
	@ApiField("string")
	private List<String> useInstructions;

	/**
	 * 券的使用规则信息
	 */
	@ApiField("use_rule")
	private UseRule useRule;

	/**
	 * 券有效期类型，目前支持以下类型：
RELATIVE：相对有效期
FIXED：绝对有效期
	 */
	@ApiField("validate_type")
	private String validateType;

	/**
	 * 该字段仅在兑换券条件下(即券类型为EXCHANGE)，用于设置兑换券的核销方式
USER_CLICK:用户自己点击券上的按钮核销
MERCHANT_SCAN：商户通过APP扫码核销
其他情况下此字段为空
	 */
	@ApiField("verify_mode")
	private String verifyMode;

	/**
	 * 券图片文件ID,调用上传图片接口alipay.offline.material.image.upload获得
	 */
	@ApiField("voucher_img")
	private String voucherImg;

	/**
	 * 券的备注

用于收银系统识别指定券使用；如备注中传入“123”，券发出后核销时将在当面付接口将该值传回，供收银系统识别
	 */
	@ApiField("voucher_note")
	private String voucherNote;

	/**
	 * 券面额，单位元必须为合法金额类型字符串券类型为代金券（MONEY）、减至券（REDUCETO）、每满减券（PER_FULL_CUT）时必填
如：
代金券：10元代金券中的10为券面额；
每满减券：毎满100减10元，其中的10为券面额；
减至券：单品原价100，现价10元，其中10为券面额，单品减至券的券面额必须低于单品原价
	 */
	@ApiField("worth_value")
	private String worthValue;

	public Boolean getAllowSplit() {
		return this.allowSplit;
	}
	public void setAllowSplit(Boolean allowSplit) {
		this.allowSplit = allowSplit;
	}

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public List<ClauseTerm> getClauseTerms() {
		return this.clauseTerms;
	}
	public void setClauseTerms(List<ClauseTerm> clauseTerms) {
		this.clauseTerms = clauseTerms;
	}

	public DelayInfo getDelayInfo() {
		return this.delayInfo;
	}
	public void setDelayInfo(DelayInfo delayInfo) {
		this.delayInfo = delayInfo;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<VoucherDescDetail> getDescDetailList() {
		return this.descDetailList;
	}
	public void setDescDetailList(List<VoucherDescDetail> descDetailList) {
		this.descDetailList = descDetailList;
	}

	public DisplayConfig getDisplayConfig() {
		return this.displayConfig;
	}
	public void setDisplayConfig(DisplayConfig displayConfig) {
		this.displayConfig = displayConfig;
	}

	public String getDonateFlag() {
		return this.donateFlag;
	}
	public void setDonateFlag(String donateFlag) {
		this.donateFlag = donateFlag;
	}

	public String getEffectType() {
		return this.effectType;
	}
	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public ItemInfo getItemInfo() {
		return this.itemInfo;
	}
	public void setItemInfo(ItemInfo itemInfo) {
		this.itemInfo = itemInfo;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getMaxAmount() {
		return this.maxAmount;
	}
	public void setMaxAmount(String maxAmount) {
		this.maxAmount = maxAmount;
	}

	public String getMultiUseMode() {
		return this.multiUseMode;
	}
	public void setMultiUseMode(String multiUseMode) {
		this.multiUseMode = multiUseMode;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRelativeTime() {
		return this.relativeTime;
	}
	public void setRelativeTime(String relativeTime) {
		this.relativeTime = relativeTime;
	}

	public String getRoundingRule() {
		return this.roundingRule;
	}
	public void setRoundingRule(String roundingRule) {
		this.roundingRule = roundingRule;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public List<String> getUseInstructions() {
		return this.useInstructions;
	}
	public void setUseInstructions(List<String> useInstructions) {
		this.useInstructions = useInstructions;
	}

	public UseRule getUseRule() {
		return this.useRule;
	}
	public void setUseRule(UseRule useRule) {
		this.useRule = useRule;
	}

	public String getValidateType() {
		return this.validateType;
	}
	public void setValidateType(String validateType) {
		this.validateType = validateType;
	}

	public String getVerifyMode() {
		return this.verifyMode;
	}
	public void setVerifyMode(String verifyMode) {
		this.verifyMode = verifyMode;
	}

	public String getVoucherImg() {
		return this.voucherImg;
	}
	public void setVoucherImg(String voucherImg) {
		this.voucherImg = voucherImg;
	}

	public String getVoucherNote() {
		return this.voucherNote;
	}
	public void setVoucherNote(String voucherNote) {
		this.voucherNote = voucherNote;
	}

	public String getWorthValue() {
		return this.worthValue;
	}
	public void setWorthValue(String worthValue) {
		this.worthValue = worthValue;
	}

}
