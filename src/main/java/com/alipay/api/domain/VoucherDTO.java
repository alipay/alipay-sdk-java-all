package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券信息
 *
 * @author auto create
 * @since 1.0, 2016-05-01 19:05:24
 */
public class VoucherDTO extends AlipayObject {

	private static final long serialVersionUID = 8752324419666827459L;

	/**
	 * 券描述
	 */
	@ApiListField("clause_terms")
	@ApiField("voucher_term_d_t_o")
	private List<VoucherTermDTO> clauseTerms;

	/**
	 * 券说明
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 是否可转赠
	 */
	@ApiField("donate_flag")
	private String donateFlag;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 扩展参数
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 单品信息
	 */
	@ApiField("item_info")
	private ItemInfoDTO itemInfo;

	/**
	 * 券logo
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 最高优惠金额
	 */
	@ApiField("max_amount")
	private String maxAmount;

	/**
	 * 券名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 折扣率
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 相对时间
	 */
	@ApiField("relative_time")
	private String relativeTime;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 副标题
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 券类型.EXCHANGE:兑换券,MONEY:代金券,RATE:折扣券
	 */
	@ApiField("type")
	private String type;

	/**
	 * 使用说明
	 */
	@ApiListField("use_instructions")
	@ApiField("string")
	private List<String> useInstructions;

	/**
	 * 核销规则
	 */
	@ApiField("use_rule")
	private VoucherUseRuleDTO useRule;

	/**
	 * 有效期类型,RELATIVE:相对时间,FIXED:固定时间
	 */
	@ApiField("validate_type")
	private String validateType;

	/**
	 * 券图片
	 */
	@ApiField("voucher_img")
	private String voucherImg;

	/**
	 * 券面额
	 */
	@ApiField("worth_value")
	private String worthValue;

	public List<VoucherTermDTO> getClauseTerms() {
		return this.clauseTerms;
	}
	public void setClauseTerms(List<VoucherTermDTO> clauseTerms) {
		this.clauseTerms = clauseTerms;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDonateFlag() {
		return this.donateFlag;
	}
	public void setDonateFlag(String donateFlag) {
		this.donateFlag = donateFlag;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public ItemInfoDTO getItemInfo() {
		return this.itemInfo;
	}
	public void setItemInfo(ItemInfoDTO itemInfo) {
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

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
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

	public VoucherUseRuleDTO getUseRule() {
		return this.useRule;
	}
	public void setUseRule(VoucherUseRuleDTO useRule) {
		this.useRule = useRule;
	}

	public String getValidateType() {
		return this.validateType;
	}
	public void setValidateType(String validateType) {
		this.validateType = validateType;
	}

	public String getVoucherImg() {
		return this.voucherImg;
	}
	public void setVoucherImg(String voucherImg) {
		this.voucherImg = voucherImg;
	}

	public String getWorthValue() {
		return this.worthValue;
	}
	public void setWorthValue(String worthValue) {
		this.worthValue = worthValue;
	}

}
