package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品规则通用模型
 *
 * @author auto create
 * @since 1.0, 2020-09-07 16:15:28
 */
public class KbdishRuleInfo extends AlipayObject {

	private static final long serialVersionUID = 4365895168488412338L;

	/**
	 * 规则的类型，枚举值如下：
DEFAULT_IN_CARTS  // "开台默认菜";
NON_WHOLE_ORDER_DISCOUNT", //"不参与整单优惠的菜";
MUST_IN_ORDER // "下单必点菜";
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 开台菜规则模型，在biz_type为开台菜的时候，此项必填。
	 */
	@ApiField("default_in_cart_info")
	private DefaultInCartInfo defaultInCartInfo;

	/**
	 * 菜品id，必填
	 */
	@ApiField("dish_id")
	private String dishId;

	/**
	 * 扩展信息，存放JSON
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 表示规则适用的范围，枚举值如下：

PARTNER_ID// 商户；

SHOP   //门店；

CATEGORY //菜谱。
	 */
	@ApiField("rule_type")
	private String ruleType;

	/**
	 * 根据rule_type的不同，此处填入规则适用的merchant_id,或者shop_id,或者cook_id的集合
	 */
	@ApiListField("rule_value")
	@ApiField("string")
	private List<String> ruleValue;

	/**
	 * 当biz_type为DEFAULT_IN_CARTS，即开台默认菜的时候，本项必填。
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * open:启用;stop:停用。
	 */
	@ApiField("status")
	private String status;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public DefaultInCartInfo getDefaultInCartInfo() {
		return this.defaultInCartInfo;
	}
	public void setDefaultInCartInfo(DefaultInCartInfo defaultInCartInfo) {
		this.defaultInCartInfo = defaultInCartInfo;
	}

	public String getDishId() {
		return this.dishId;
	}
	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getRuleType() {
		return this.ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public List<String> getRuleValue() {
		return this.ruleValue;
	}
	public void setRuleValue(List<String> ruleValue) {
		this.ruleValue = ruleValue;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
