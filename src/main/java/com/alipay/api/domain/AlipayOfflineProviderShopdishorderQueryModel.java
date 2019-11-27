package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询店铺菜品数据接口
 *
 * @author auto create
 * @since 1.0, 2018-02-07 15:45:33
 */
public class AlipayOfflineProviderShopdishorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8838122187478125814L;

	/**
	 * 外部订单号 
数据为alipay.offline.provider.useraction.record接口中上传用户点菜菜单作为元数据。当前的outer_order_id  就是上传用户点菜菜单中action_detail对象里的outOrderId字段
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * 口碑店铺id，商户订购开发者服务插件后，口碑会通过服务市场管理推送订购信息给开发者，开发者可通过其中的订购插件订单明细查询获取此参数值，或通过商户授权口碑开店接口来获取。
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
