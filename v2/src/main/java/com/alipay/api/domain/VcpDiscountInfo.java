package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 券折扣计算模型
 *
 * @author auto create
 * @since 1.0, 2022-11-14 23:56:09
 */
public class VcpDiscountInfo extends AlipayObject {

	private static final long serialVersionUID = 8573855519924614618L;

	/**
	 * 计算规则列表
	 */
	@ApiListField("calc_rules")
	@ApiField("vcp_calc_rule")
	private List<VcpCalcRule> calcRules;

	/**
	 * 计算类型
	 */
	@ApiField("calc_type_mode")
	private String calcTypeMode;

	/**
	 * 封顶金额
	 */
	@ApiField("ceiling_amount")
	private String ceilingAmount;

	/**
	 * 跨sku封顶件数
	 */
	@ApiField("ceiling_count")
	private Long ceilingCount;

	/**
	 * 优惠类型
	 */
	@ApiField("discount_type")
	private String discountType;

	public List<VcpCalcRule> getCalcRules() {
		return this.calcRules;
	}
	public void setCalcRules(List<VcpCalcRule> calcRules) {
		this.calcRules = calcRules;
	}

	public String getCalcTypeMode() {
		return this.calcTypeMode;
	}
	public void setCalcTypeMode(String calcTypeMode) {
		this.calcTypeMode = calcTypeMode;
	}

	public String getCeilingAmount() {
		return this.ceilingAmount;
	}
	public void setCeilingAmount(String ceilingAmount) {
		this.ceilingAmount = ceilingAmount;
	}

	public Long getCeilingCount() {
		return this.ceilingCount;
	}
	public void setCeilingCount(Long ceilingCount) {
		this.ceilingCount = ceilingCount;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

}
