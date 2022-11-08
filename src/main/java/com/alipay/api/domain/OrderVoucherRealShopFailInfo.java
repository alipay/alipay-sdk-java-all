package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 失败的代运营商业关系门店信息
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:47:07
 */
public class OrderVoucherRealShopFailInfo extends AlipayObject {

	private static final long serialVersionUID = 8332859986623686884L;

	/**
	 * 请求失败提示信息。
	 */
	@ApiField("fail_message")
	private String failMessage;

	/**
	 * 请求失败原因。
	 */
	@ApiListField("fail_reasons")
	@ApiField("string")
	private List<String> failReasons;

	/**
	 * 请求失败的代运营商业关系门店 ID。
	 */
	@ApiField("real_shop_id")
	private String realShopId;

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

	public String getRealShopId() {
		return this.realShopId;
	}
	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}

}
