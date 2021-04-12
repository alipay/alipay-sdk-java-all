package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品券模板（数据）
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AlipayDataItemVoucherTemplete extends AlipayObject {

	private static final long serialVersionUID = 3422674271757175325L;

	/**
	 * 延迟生效时间（手动领取条件下，可跟valid_period组合使用）
	 */
	@ApiField("delay_minute")
	private Long delayMinute;

	/**
	 * 券使用规则描述，包括描述标题及描述内容列表
	 */
	@ApiListField("desc_details")
	@ApiField("alipay_data_item_description")
	private List<AlipayDataItemDescription> descDetails;

	/**
	 * 折扣率，填写0~1间的小数且不包括0和1，如八折则传入0.8
	 */
	@ApiField("discount_rate")
	private String discountRate;

	/**
	 * 外部单品列表
	 */
	@ApiField("external_goods_list")
	private AlipayDataItemGoodsList externalGoodsList;

	/**
	 * 使用时间规则，控制商品的生效时间
	 */
	@ApiField("limit_period_info_list")
	private AlipayDataItemLimitPeriodInfo limitPeriodInfoList;

	/**
	 * 商品原金额，只有单品代金券有，丽人行业需要填写此字段
	 */
	@ApiField("original_amount")
	private String originalAmount;

	/**
	 * 券原折扣
	 */
	@ApiField("original_rate")
	private String originalRate;

	/**
	 * 单品代金券中的减至金额
	 */
	@ApiField("reduce_to_amount")
	private String reduceToAmount;

	/**
	 * 折扣金额取整规则 AUTO_ROUNDING_YUAN：自动抹零到元 AUTO_ROUNDING_JIAO：自动抹零到角 ROUNDING_UP_YUAN：四舍五入到元 ROUNDING_UP_JIAO：四舍五入到角
	 */
	@ApiField("rounding_rule")
	private String roundingRule;

	/**
	 * 起步数量，用于指定可享受优惠的起步单品购买数量
	 */
	@ApiField("threshold_amount")
	private String thresholdAmount;

	/**
	 * 起步数量，用于指定可享受优惠的起步单品购买数量
	 */
	@ApiField("threshold_quantity")
	private String thresholdQuantity;

	/**
	 * 领券之后多长时间内可以核销，单位：分钟，传入数值需大于1440（一天）
	 */
	@ApiField("valid_period")
	private Long validPeriod;

	/**
	 * 价值金额
CASH类型为代金券金额
DISCOUNT类型为优惠封顶金额
	 */
	@ApiField("value_amount")
	private String valueAmount;

	/**
	 * 券的描述信息，目前客户端将统一展示“折扣须知”
	 */
	@ApiField("voucher_desc")
	private String voucherDesc;

	/**
	 * 券类型：单品代金券为CASH类型，全场折扣券为DISCOUNT类型
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public Long getDelayMinute() {
		return this.delayMinute;
	}
	public void setDelayMinute(Long delayMinute) {
		this.delayMinute = delayMinute;
	}

	public List<AlipayDataItemDescription> getDescDetails() {
		return this.descDetails;
	}
	public void setDescDetails(List<AlipayDataItemDescription> descDetails) {
		this.descDetails = descDetails;
	}

	public String getDiscountRate() {
		return this.discountRate;
	}
	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

	public AlipayDataItemGoodsList getExternalGoodsList() {
		return this.externalGoodsList;
	}
	public void setExternalGoodsList(AlipayDataItemGoodsList externalGoodsList) {
		this.externalGoodsList = externalGoodsList;
	}

	public AlipayDataItemLimitPeriodInfo getLimitPeriodInfoList() {
		return this.limitPeriodInfoList;
	}
	public void setLimitPeriodInfoList(AlipayDataItemLimitPeriodInfo limitPeriodInfoList) {
		this.limitPeriodInfoList = limitPeriodInfoList;
	}

	public String getOriginalAmount() {
		return this.originalAmount;
	}
	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getOriginalRate() {
		return this.originalRate;
	}
	public void setOriginalRate(String originalRate) {
		this.originalRate = originalRate;
	}

	public String getReduceToAmount() {
		return this.reduceToAmount;
	}
	public void setReduceToAmount(String reduceToAmount) {
		this.reduceToAmount = reduceToAmount;
	}

	public String getRoundingRule() {
		return this.roundingRule;
	}
	public void setRoundingRule(String roundingRule) {
		this.roundingRule = roundingRule;
	}

	public String getThresholdAmount() {
		return this.thresholdAmount;
	}
	public void setThresholdAmount(String thresholdAmount) {
		this.thresholdAmount = thresholdAmount;
	}

	public String getThresholdQuantity() {
		return this.thresholdQuantity;
	}
	public void setThresholdQuantity(String thresholdQuantity) {
		this.thresholdQuantity = thresholdQuantity;
	}

	public Long getValidPeriod() {
		return this.validPeriod;
	}
	public void setValidPeriod(Long validPeriod) {
		this.validPeriod = validPeriod;
	}

	public String getValueAmount() {
		return this.valueAmount;
	}
	public void setValueAmount(String valueAmount) {
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
