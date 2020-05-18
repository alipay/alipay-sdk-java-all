package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 默认结算规则。在收单时不做特别指定规则时，将使用本对象设置的结算规则
 *
 * @author auto create
 * @since 1.0, 2020-03-13 14:30:41
 */
public class DefaultSettleRule extends AlipayObject {

	private static final long serialVersionUID = 2591324293792744114L;

	/**
	 * 默认结算目标。当默认结算类型为NONE时可不填；当默认结算类型为bankCard时填写银行卡卡号，其值需在进件填写的结算银行卡范围内；当默认结算类型为alipayAccount时填写支付宝账号登录号，其值需在进件填写的结算支付宝账号范围内。
	 */
	@ApiField("default_settle_target")
	private String defaultSettleTarget;

	/**
	 * 默认结算类型，可选值有NONE/bankCard/alipayAccount。NONE标识无默认结算规则，设置NONE和不设置本对象效果一致；bankCard表示结算到银行卡；alipayAccount表示结算到支付宝账号
	 */
	@ApiField("default_settle_type")
	private String defaultSettleType;

	public String getDefaultSettleTarget() {
		return this.defaultSettleTarget;
	}
	public void setDefaultSettleTarget(String defaultSettleTarget) {
		this.defaultSettleTarget = defaultSettleTarget;
	}

	public String getDefaultSettleType() {
		return this.defaultSettleType;
	}
	public void setDefaultSettleType(String defaultSettleType) {
		this.defaultSettleType = defaultSettleType;
	}

}
