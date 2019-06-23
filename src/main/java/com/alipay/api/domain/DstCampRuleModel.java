package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 优惠规则
 *
 * @author auto create
 * @since 1.0, 2018-10-22 17:53:22
 */
public class DstCampRuleModel extends AlipayObject {

	private static final long serialVersionUID = 3599234485594743789L;

	/**
	 * 支付宝收银台:PC端:PC   安全支付端:WIRELESS_CLIENT   无线WAP端:WIRELESS_WAP   协议支付;AGREEMENTPAY
	 */
	@ApiField("alipay_cashier")
	private String alipayCashier;

	/**
	 * 优惠规则类型,主要有2种:账户优惠传 account、渠道优惠channel. 现在开放账户优惠account  默认请传account
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 规则id 新增不传，修改传
	 */
	@ApiField("id")
	private String id;

	/**
	 * 同一个支付宝账户享受优惠次数.0表示不限制
	 */
	@ApiField("prize_count_per_account")
	private String prizeCountPerAccount;

	/**
	 * 产品类型 支付宝交易:trade   支付宝账单中心:commonDeduct   支付宝转账中心:ttc   支付宝通用代扣:billcenter
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 立减规则，这个参数有支付宝运营小二提供给商户，录入
	 */
	@ApiField("rule_uuid")
	private String ruleUuid;

	/**
	 * 关联的凭证id,这个参数商户调凭证创建接口返回凭证id 然后设置到这个值
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getAlipayCashier() {
		return this.alipayCashier;
	}
	public void setAlipayCashier(String alipayCashier) {
		this.alipayCashier = alipayCashier;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPrizeCountPerAccount() {
		return this.prizeCountPerAccount;
	}
	public void setPrizeCountPerAccount(String prizeCountPerAccount) {
		this.prizeCountPerAccount = prizeCountPerAccount;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getRuleUuid() {
		return this.ruleUuid;
	}
	public void setRuleUuid(String ruleUuid) {
		this.ruleUuid = ruleUuid;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
