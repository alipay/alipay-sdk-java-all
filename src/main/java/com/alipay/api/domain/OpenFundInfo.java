package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放平台资金信息
 *
 * @author auto create
 * @since 1.0, 2022-12-08 15:43:09
 */
public class OpenFundInfo extends AlipayObject {

	private static final long serialVersionUID = 8253766692425619367L;

	/**
	 * 预算
	 */
	@ApiField("budget")
	private OpenBudget budget;

	/**
	 * 封顶金额
	 */
	@ApiField("ceiling_amount")
	private Long ceilingAmount;

	/**
	 * 账号描述：登录号、userId
	 */
	@ApiField("display_account")
	private String displayAccount;

	/**
	 * 资金账号：余额userId、余额宝userId、集分宝预算库ID、子模板(支付宝补贴模板)Id
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/**
	 * 资金模式 该值为内部计算获得，不允许上游设置
	 */
	@ApiField("fund_mode")
	private String fundMode;

	/**
	 * 出资方, 默认有资金部分平台出资, 无资金部分商户出资
	 */
	@ApiField("fund_provider")
	private String fundProvider;

	/**
	 * 资金比率
	 */
	@ApiField("fund_ratio")
	private Long fundRatio;

	/**
	 * 出资账号关联id，当出资账号是资金方案时，该属性值为资金关系组id
	 */
	@ApiField("fund_related_id")
	private String fundRelatedId;

	/**
	 * 资金源出资类型，走通兑模式传兑换源资产种类码
	 */
	@ApiField("fund_source_type")
	private String fundSourceType;

	/**
	 * 资金类型
	 */
	@ApiField("fund_type")
	private String fundType;

	/**
	 * 单间商品封顶优惠金额
	 */
	@ApiField("item_ceiling_amount")
	private Long itemCeilingAmount;

	/**
	 * 单间商品商户补贴优惠取整模式
	 */
	@ApiField("item_merchant_subsidy_rounding_mode")
	private String itemMerchantSubsidyRoundingMode;

	/**
	 * 微账务账号: 对于特殊场景需要保存 b类账户的微账务账号 例如yebcore
	 */
	@ApiField("minitrans_account")
	private String minitransAccount;

	/**
	 * 集分宝预算库：运营积分场景，fundAccount为商户id，系统会自动补充集分宝预算库
	 */
	@ApiField("point_budget_code")
	private String pointBudgetCode;

	/**
	 * 充值操作冻结码
	 */
	@ApiField("recharge_freeze_code")
	private String rechargeFreezeCode;

	/**
	 * 出资充值模式
	 */
	@ApiField("recharge_type")
	private String rechargeType;

	/**
	 * 退款资金账号：对于比较特殊的场景 支出和收入不是一个账号的 使用refundAccount作为退款账号
	 */
	@ApiField("refund_account")
	private String refundAccount;

	/**
	 * 退款优先级
	 */
	@ApiField("refund_funding_priority")
	private Long refundFundingPriority;

	public OpenBudget getBudget() {
		return this.budget;
	}
	public void setBudget(OpenBudget budget) {
		this.budget = budget;
	}

	public Long getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(Long ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public String getDisplayAccount() {
		return this.displayAccount;
	}
	public void setDisplayAccount(String displayAccount) {
		this.displayAccount = displayAccount;
	}

	public String getFundAccount() {
		return this.fundAccount;
	}
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}

	public String getFundMode() {
		return this.fundMode;
	}
	public void setFundMode(String fundMode) {
		this.fundMode = fundMode;
	}

	public String getFundProvider() {
		return this.fundProvider;
	}
	public void setFundProvider(String fundProvider) {
		this.fundProvider = fundProvider;
	}

	public Long getFundRatio() {
		return this.fundRatio;
	}
	public void setFundRatio(Long fundRatio) {
		this.fundRatio = fundRatio;
	}

	public String getFundRelatedId() {
		return this.fundRelatedId;
	}
	public void setFundRelatedId(String fundRelatedId) {
		this.fundRelatedId = fundRelatedId;
	}

	public String getFundSourceType() {
		return this.fundSourceType;
	}
	public void setFundSourceType(String fundSourceType) {
		this.fundSourceType = fundSourceType;
	}

	public String getFundType() {
		return this.fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public Long getItemCeilingAmount() {
		return this.itemCeilingAmount;
	}
	public void setItemCeilingAmount(Long itemCeilingAmount) {
		this.itemCeilingAmount = itemCeilingAmount;
	}

	public String getItemMerchantSubsidyRoundingMode() {
		return this.itemMerchantSubsidyRoundingMode;
	}
	public void setItemMerchantSubsidyRoundingMode(String itemMerchantSubsidyRoundingMode) {
		this.itemMerchantSubsidyRoundingMode = itemMerchantSubsidyRoundingMode;
	}

	public String getMinitransAccount() {
		return this.minitransAccount;
	}
	public void setMinitransAccount(String minitransAccount) {
		this.minitransAccount = minitransAccount;
	}

	public String getPointBudgetCode() {
		return this.pointBudgetCode;
	}
	public void setPointBudgetCode(String pointBudgetCode) {
		this.pointBudgetCode = pointBudgetCode;
	}

	public String getRechargeFreezeCode() {
		return this.rechargeFreezeCode;
	}
	public void setRechargeFreezeCode(String rechargeFreezeCode) {
		this.rechargeFreezeCode = rechargeFreezeCode;
	}

	public String getRechargeType() {
		return this.rechargeType;
	}
	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
	}

	public String getRefundAccount() {
		return this.refundAccount;
	}
	public void setRefundAccount(String refundAccount) {
		this.refundAccount = refundAccount;
	}

	public Long getRefundFundingPriority() {
		return this.refundFundingPriority;
	}
	public void setRefundFundingPriority(Long refundFundingPriority) {
		this.refundFundingPriority = refundFundingPriority;
	}

}
