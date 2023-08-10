package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑点餐信息修改
 *
 * @author auto create
 * @since 1.0, 2020-08-04 18:50:51
 */
public class KoubeiCateringConfigModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4614797761964155935L;

	/**
	 * 外部请求ID; 标识ISV本次修改的请求，由开发者自定义，不同的请求使用不同的ID，在门店notify消息中也会带有该参数，以此标明本次notify消息是对哪个请求的回应
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 店铺配置信息列表
	 */
	@ApiListField("shop_config_list")
	@ApiField("shop_order_config_info")
	private List<ShopOrderConfigInfo> shopConfigList;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ShopOrderConfigInfo> getShopConfigList() {
		return this.shopConfigList;
	}
	public void setShopConfigList(List<ShopOrderConfigInfo> shopConfigList) {
		this.shopConfigList = shopConfigList;
	}

}
