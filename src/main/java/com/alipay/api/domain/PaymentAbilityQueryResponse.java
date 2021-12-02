package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付能力返回结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class PaymentAbilityQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 8449378263469578778L;

	/**
	 * 附加信息，json格式字符串。暂时包含信息：是否是支付宝钱包用户，是否是数字娱乐行业活跃用户。
	 */
	@ApiField("extra_infos")
	private String extraInfos;

	/**
	 * 接口返回的支付能力等级
	 */
	@ApiField("level")
	private String level;

	/**
	 * 返回的单据号
	 */
	@ApiField("order_id")
	private String orderId;

	public String getExtraInfos() {
		return this.extraInfos;
	}
	public void setExtraInfos(String extraInfos) {
		this.extraInfos = extraInfos;
	}

	public String getLevel() {
		return this.level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
