package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * DumTestFFAA描述
 *
 * @author auto create
 * @since 1.0, 2024-04-19 16:46:21
 */
public class DumTestFFAA extends AlipayObject {

	private static final long serialVersionUID = 7273688525156785879L;

	/**
	 * 商家侧小程序商品ID，指商家提报给小程序商品库的商品。当前接口的extend_params.trade_component_order_id字段不为空时该字段必填，且与交易组件订单参数保持一致。了解小程序商品请参考：<a 
href="https://opendocs.alipay.com/mini/06uila?pathHash=63b6fba7">https://opendocs.alipay.com/mini/06uila?pathHash=63b6fba7</a>
	 */
	@ApiField("field_a")
	private String fieldA;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getFieldA() {
		return this.fieldA;
	}
	public void setFieldA(String fieldA) {
		this.fieldA = fieldA;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
