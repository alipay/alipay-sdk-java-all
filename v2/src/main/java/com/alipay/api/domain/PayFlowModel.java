package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付交易模型
 *
 * @author auto create
 * @since 1.0, 2024-11-07 09:48:37
 */
public class PayFlowModel extends AlipayObject {

	private static final long serialVersionUID = 1793857148737823853L;

	/**
	 * 店铺信息列表
	 */
	@ApiListField("shop_list")
	@ApiField("pay_flow_shop_info_model")
	private List<PayFlowShopInfoModel> shopList;

	/**
	 * 店铺数量
	 */
	@ApiField("shop_num")
	private String shopNum;

	public List<PayFlowShopInfoModel> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<PayFlowShopInfoModel> shopList) {
		this.shopList = shopList;
	}

	public String getShopNum() {
		return this.shopNum;
	}
	public void setShopNum(String shopNum) {
		this.shopNum = shopNum;
	}

}
