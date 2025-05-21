package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 使用规则
 *
 * @author auto create
 * @since 1.0, 2024-11-20 11:38:57
 */
public class StandardInfo extends AlipayObject {

	private static final long serialVersionUID = 7291541394848313972L;

	/**
	 * 当前规则可使用的其他资产来源信息
	 */
	@ApiField("asset_share_source_info")
	private AssetShareSourceInfo assetShareSourceInfo;

	/**
	 * 消费模式，不填为默认模式，枚举值：COUPON_ONLY（仅支持点券）
COUPON_AND_CAP（支持点券+余额）
DEFAULT（默认模式）
点券：消费时找员工的点券，没有或者用完了不可付；
点券+余额：消费时找员工的点券，没有找员工的余额，没有或者用完了不可付。
默认：有给员工设置员工余额以员工余额为准，用完为止。否则只受规则里的限额和企业账户资金上限管控；
	 */
	@ApiField("consume_mode")
	private String consumeMode;

	/**
	 * 费用类型子类
	 */
	@ApiField("expense_type_sub_category")
	private String expenseTypeSubCategory;

	/**
	 * 开票规则id，可通过接口alipay.ebpp.invoice.enterpriseconsume.enterpriseopenrule.create 创建并得到开票规则ID
	 */
	@ApiField("open_rule_id")
	private String openRuleId;

	/**
	 * 外部使用规则id，制度内使用规则该字段不允许重复
	 */
	@ApiField("outer_source_id")
	private String outerSourceId;

	/**
	 * 支付策略 当笔消费金额大于规则可用余额时，用于控制支付策略，该字段缺省时采取因公账户和个人账户组合支付策略
	 */
	@ApiField("payment_policy")
	private String paymentPolicy;

	/**
	 * 个人收款码转账是否支持因公付，默认为0。可选值：0（不支持）、1（支持）
	 */
	@ApiField("personal_qrcode_mode")
	private Long personalQrcodeMode;

	/**
	 * 使用规则条件列表
	 */
	@ApiListField("standard_condition_info_list")
	@ApiField("standard_condition_info")
	private List<StandardConditionInfo> standardConditionInfoList;

	/**
	 * 使用规则描述(敏感词校验)
	 */
	@ApiField("standard_desc")
	private String standardDesc;

	/**
	 * 制度ID（创建使用规则时非必填）
	 */
	@ApiField("standard_id")
	private String standardId;

	/**
	 * 规则名称
	 */
	@ApiField("standard_name")
	private String standardName;

	public AssetShareSourceInfo getAssetShareSourceInfo() {
		return this.assetShareSourceInfo;
	}
	public void setAssetShareSourceInfo(AssetShareSourceInfo assetShareSourceInfo) {
		this.assetShareSourceInfo = assetShareSourceInfo;
	}

	public String getConsumeMode() {
		return this.consumeMode;
	}
	public void setConsumeMode(String consumeMode) {
		this.consumeMode = consumeMode;
	}

	public String getExpenseTypeSubCategory() {
		return this.expenseTypeSubCategory;
	}
	public void setExpenseTypeSubCategory(String expenseTypeSubCategory) {
		this.expenseTypeSubCategory = expenseTypeSubCategory;
	}

	public String getOpenRuleId() {
		return this.openRuleId;
	}
	public void setOpenRuleId(String openRuleId) {
		this.openRuleId = openRuleId;
	}

	public String getOuterSourceId() {
		return this.outerSourceId;
	}
	public void setOuterSourceId(String outerSourceId) {
		this.outerSourceId = outerSourceId;
	}

	public String getPaymentPolicy() {
		return this.paymentPolicy;
	}
	public void setPaymentPolicy(String paymentPolicy) {
		this.paymentPolicy = paymentPolicy;
	}

	public Long getPersonalQrcodeMode() {
		return this.personalQrcodeMode;
	}
	public void setPersonalQrcodeMode(Long personalQrcodeMode) {
		this.personalQrcodeMode = personalQrcodeMode;
	}

	public List<StandardConditionInfo> getStandardConditionInfoList() {
		return this.standardConditionInfoList;
	}
	public void setStandardConditionInfoList(List<StandardConditionInfo> standardConditionInfoList) {
		this.standardConditionInfoList = standardConditionInfoList;
	}

	public String getStandardDesc() {
		return this.standardDesc;
	}
	public void setStandardDesc(String standardDesc) {
		this.standardDesc = standardDesc;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getStandardName() {
		return this.standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

}
