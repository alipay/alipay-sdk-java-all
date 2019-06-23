package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品券模板
 *
 * @author auto create
 * @since 1.0, 2017-04-20 15:17:55
 */
public class AlipayItemVoucherTemplete extends AlipayObject {

	private static final long serialVersionUID = 2829744451589559654L;

	/**
	 * 延迟生效时间（手动领取条件下，可跟valid_period组合使用）
	 */
	@ApiField("delay_minute")
	private Long delayMinute;

	/**
	 * 券使用规则描述，包括描述标题及描述内容列表。子参数只支持title、details；其余参数暂不支持，请不要填写。
	 */
	@ApiListField("desc_details")
	@ApiField("alipay_item_description")
	private List<AlipayItemDescription> descDetails;

	/**
	 * 折扣率，填写0-1间的小数且不包括0和1，如八折则传入0.8。（折扣券类型必选字段，代金券不需要）
	 */
	@ApiField("discount_rate")
	private Long discountRate;

	/**
	 * 外部单品列表
	 */
	@ApiField("external_goods_list")
	private AlipayItemGoodsList externalGoodsList;

	/**
	 * 使用时间规则，控制商品的生效时间。
时间单位：MINUTE、HOUR、WEEK_DAY、DAY、WEEK、MONTH
限制规则：INCLUDE、INCLUDE_INTERVAL
例如：每周日、周二的 0点-23点59分
"limit_period_info_list":[{"rule":"INCLUDE","unit":"WEEK_DAY","value":"7,2"},{"rule":"INCLUDE_INTERVAL","unit":"MINUTE","value":"0,1439"}]
	 */
	@ApiListField("limit_period_info_list")
	@ApiField("alipay_item_limit_period_info")
	private List<AlipayItemLimitPeriodInfo> limitPeriodInfoList;

	/**
	 * 商品原金额，单位（元），（代金券类型可选字段，折扣券不需要）
	 */
	@ApiField("original_amount")
	private Long originalAmount;

	/**
	 * 券原折扣,0-1之间，做展示使用（折扣券类型可选字段，代金券不需要）
	 */
	@ApiField("original_rate")
	private Long originalRate;

	/**
	 * 减至金额，单位（元），代表券可抵扣至多少（代金券类型可选字段，折扣券不需要）
	 */
	@ApiField("reduce_to_amount")
	private Long reduceToAmount;

	/**
	 * 折扣金额取整规则
AUTO_ROUNDING_YUAN：自动抹零到元
AUTO_ROUNDING_JIAO：自动抹零到角
ROUNDING_UP_YUAN：四舍五入到元
ROUNDING_UP_JIAO：四舍五入到角
	 */
	@ApiField("rounding_rule")
	private String roundingRule;

	/**
	 * 起步金额，单位（元）
	 */
	@ApiField("threshold_amount")
	private Long thresholdAmount;

	/**
	 * 起步数量，用于指定可享受优惠的起步单品购买数量
	 */
	@ApiField("threshold_quantity")
	private Long thresholdQuantity;

	/**
	 * 领券之后多长时间内可以核销，单位：分钟，传入数值需大于1440（一天）
	 */
	@ApiField("valid_period")
	private Long validPeriod;

	/**
	 * 价值金额，单位（元）
CASH类型为代金券金额
DISCOUNT类型为优惠封顶金额
在代金券类型时，value_amout与reduce_to_amount不能同时为空，不能同时不为空。
	 */
	@ApiField("value_amount")
	private Long valueAmount;

	/**
	 * 券的描述信息，目前客户端将统一展示“折扣须知”
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券类型，DISCOUNT（折扣券）、CASH（代金券）
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public Long getDelayMinute() {
		return this.delayMinute;
	}
	public void setDelayMinute(Long delayMinute) {
		this.delayMinute = delayMinute;
	}

	public List<AlipayItemDescription> getDescDetails() {
		return this.descDetails;
	}
	public void setDescDetails(List<AlipayItemDescription> descDetails) {
		this.descDetails = descDetails;
	}

	public Long getDiscountRate() {
		return this.discountRate;
	}
	public void setDiscountRate(Long discountRate) {
		this.discountRate = discountRate;
	}

	public AlipayItemGoodsList getExternalGoodsList() {
		return this.externalGoodsList;
	}
	public void setExternalGoodsList(AlipayItemGoodsList externalGoodsList) {
		this.externalGoodsList = externalGoodsList;
	}

	public List<AlipayItemLimitPeriodInfo> getLimitPeriodInfoList() {
		return this.limitPeriodInfoList;
	}
	public void setLimitPeriodInfoList(List<AlipayItemLimitPeriodInfo> limitPeriodInfoList) {
		this.limitPeriodInfoList = limitPeriodInfoList;
	}

	public Long getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(Long originalAmount) {
		this.originalAmount = originalAmount;
	}

	public Long getOriginalRate() {
		return this.originalRate;
	}
	public void setOriginalRate(Long originalRate) {
		this.originalRate = originalRate;
	}

	public Long getReduceToAmount() {
		return this.reduceToAmount;
	}
	public void setReduceToAmount(Long reduceToAmount) {
		this.reduceToAmount = reduceToAmount;
	}

	public String getRoundingRule() {
		return this.roundingRule;
	}
	public void setRoundingRule(String roundingRule) {
		this.roundingRule = roundingRule;
	}

	public Long getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(Long thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public Long getThresholdQuantity() {
		return this.thresholdQuantity;
	}
	public void setThresholdQuantity(Long thresholdQuantity) {
		this.thresholdQuantity = thresholdQuantity;
	}

	public Long getValidPeriod() {
		return this.validPeriod;
	}
	public void setValidPeriod(Long validPeriod) {
		this.validPeriod = validPeriod;
	}

	public Long getValueAmount() {
		return this.valueAmount;
	}
	public void setValueAmount(Long valueAmount) {
		this.valueAmount = valueAmount;
	}

	public String getVoucherDesc() {
		return this.voucherDesc;
	}
	public void setVoucherDesc(String voucherDesc) {
		this.voucherDesc = voucherDesc;
	}

	public String getVoucherType() {
		return this.voucherType;
	}
	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}

}
