package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 失败的门店详情
 *
 * @author auto create
 * @since 1.0, 2022-07-20 18:01:34
 */
public class VoucherFailShopInfo extends AlipayObject {

	private static final long serialVersionUID = 6596228143554756155L;

	/**
	 * 请求失败提示信息
	 */
	@ApiField("fail_message")
	private String failMessage;

	/**
	 * 请求失败的原因。 枚举值: SHOP_INFO_NOT_PASS:门店信息不全 SHOP_NOT_EXIST:门店不存在 MERCHANT_SHOP_RELATION_NOT_EXIST:门店与商户没有关联关系 ACTIVITY_SHOP_NOT_EXIST:活动不存在该门店
	 */
	@ApiListField("fail_reasons")
	@ApiField("string")
	private List<String> failReasons;

	/**
	 * 请求失败的物理门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	/**
	 * 请求失败的支付门店ID
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

	public String getRealShopId() {
		return this.realShopId;
	}
	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
