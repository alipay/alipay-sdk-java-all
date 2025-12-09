package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈商场付限制集信息结构(带具体限制类型如门店的扩展信息)
 *
 * @author auto create
 * @since 1.0, 2023-08-04 15:48:05
 */
public class RuleLimitContentExtDTO extends AlipayObject {

	private static final long serialVersionUID = 6557722844524152152L;

	/**
	 * 门店编号类型，real_shop_no：外部系统门店编号，real_shop_id：支付宝侧内部物理门店编号
	 */
	@ApiField("limit_type")
	private String limitType;

	/**
	 * 外部或内部门店编号
	 */
	@ApiField("limit_value")
	private String limitValue;

	/**
	 * 限制对象的具体信息输出 如门店信息
	 */
	@ApiField("rule_limit_shop_content")
	private RuleLimitShopContentDTO ruleLimitShopContent;

	public String getLimitType() {
		return this.limitType;
	}
	public void setLimitType(String limitType) {
		this.limitType = limitType;
	}

	public String getLimitValue() {
		return this.limitValue;
	}
	public void setLimitValue(String limitValue) {
		this.limitValue = limitValue;
	}

	public RuleLimitShopContentDTO getRuleLimitShopContent() {
		return this.ruleLimitShopContent;
	}
	public void setRuleLimitShopContent(RuleLimitShopContentDTO ruleLimitShopContent) {
		this.ruleLimitShopContent = ruleLimitShopContent;
	}

}
