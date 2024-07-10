package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 修改支付方式排序
 *
 * @author auto create
 * @since 1.0, 2018-11-16 17:30:03
 */
public class KoubeiCateringPosPaymodesortModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5537446159858464691L;

	/**
	 * 支付方式名称列表
	 */
	@ApiListField("pay_names")
	@ApiField("string")
	private List<String> payNames;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public List<String> getPayNames() {
		return this.payNames;
	}
	public void setPayNames(List<String> payNames) {
		this.payNames = payNames;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
