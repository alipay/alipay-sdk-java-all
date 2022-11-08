package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家券失败门店详情
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:46:52
 */
public class OrderVoucherShopFailInfo extends AlipayObject {

	private static final long serialVersionUID = 4133889327774951141L;

	/**
	 * 请求失败提示信息。
	 */
	@ApiField("fail_message")
	private String failMessage;

	/**
	 * 请求失败的原因。
	 */
	@ApiListField("fail_reasons")
	@ApiField("string")
	private List<String> failReasons;

	/**
	 * 请求失败的支付门店 ID。
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getFailMessage() {
		return this.failMessage;
	}
	public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}

	public List<String> getFailReasons() {
		return this.failReasons;
	}
	public void setFailReasons(List<String> failReasons) {
		this.failReasons = failReasons;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
