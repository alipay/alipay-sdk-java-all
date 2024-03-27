package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 可用商品修改
 *
 * @author auto create
 * @since 1.0, 2022-12-27 10:16:44
 */
public class PaymentVoucherAvailableGoodsModify extends AlipayObject {

	private static final long serialVersionUID = 1648711767575946453L;

	/**
	 * 可优惠商品编码，商家自定义商品编码。当用户支付时，交易中的商品编码和支付券配置的商品编码有任一匹配时，可以使用优惠券。
限制:
1、核销商品范围只能增大不能减小
	 */
	@ApiListField("goods_ids")
	@ApiField("string")
	private List<String> goodsIds;

	public List<String> getGoodsIds() {
		return this.goodsIds;
	}
	public void setGoodsIds(List<String> goodsIds) {
		this.goodsIds = goodsIds;
	}

}
