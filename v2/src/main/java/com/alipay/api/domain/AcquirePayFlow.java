package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 数据集
 *
 * @author auto create
 * @since 1.0, 2026-05-06 10:07:48
 */
public class AcquirePayFlow extends AlipayObject {

	private static final long serialVersionUID = 3498922564415892146L;

	/**
	 * null
	 */
	@ApiListField("shop_list")
	@ApiField("acquire_pay_flow_shop_info")
	private List<AcquirePayFlowShopInfo> shopList;

	/**
	 * 店铺数量
	 */
	@ApiField("shop_num")
	private String shopNum;

	public List<AcquirePayFlowShopInfo> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<AcquirePayFlowShopInfo> shopList) {
		this.shopList = shopList;
	}

	public String getShopNum() {
		return this.shopNum;
	}
	public void setShopNum(String shopNum) {
		this.shopNum = shopNum;
	}

}
