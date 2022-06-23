package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 全部门店修改
 *
 * @author auto create
 * @since 1.0, 2022-06-09 17:02:03
 */
public class OrderVoucherMerchantAllShopModify extends AlipayObject {

	private static final long serialVersionUID = 2656276544565266847L;

	/**
	 * 券不可使用的门店列表。列表中的门店id是通过调用接口ant.merchant.expand.shop.create创建门店返回的支付宝门店id 接口参数是列表类型。 接口参数是列表类型。 限制： 1、创建活动时传入了该值修改才会生效。 2、exclude_shop_ids中的门店id必须是支付宝门店id。 3、exclude_shop_ids如果包含重复的门店id会自动进行去重操作。
	 */
	@ApiListField("exclude_shop_ids")
	@ApiField("string")
	private List<String> excludeShopIds;

	public List<String> getExcludeShopIds() {
		return this.excludeShopIds;
	}
	public void setExcludeShopIds(List<String> excludeShopIds) {
		this.excludeShopIds = excludeShopIds;
	}

}
