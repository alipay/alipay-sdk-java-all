package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 全部门店可用结果
 *
 * @author auto create
 * @since 1.0, 2022-08-24 15:39:30
 */
public class OrderVoucherMerchantAllShopResult extends AlipayObject {

	private static final long serialVersionUID = 7573521184488725223L;

	/**
	 * 请求失败的不可用门店详情。
	 */
	@ApiListField("exclude_shop_fail_infos")
	@ApiField("order_voucher_shop_fail_info")
	private List<OrderVoucherShopFailInfo> excludeShopFailInfos;

	/**
	 * 请求成功的不可用门店列表。
	 */
	@ApiListField("success_exclude_shop_ids")
	@ApiField("string")
	private List<String> successExcludeShopIds;

	public List<OrderVoucherShopFailInfo> getExcludeShopFailInfos() {
		return this.excludeShopFailInfos;
	}
	public void setExcludeShopFailInfos(List<OrderVoucherShopFailInfo> excludeShopFailInfos) {
		this.excludeShopFailInfos = excludeShopFailInfos;
	}

	public List<String> getSuccessExcludeShopIds() {
		return this.successExcludeShopIds;
	}
	public void setSuccessExcludeShopIds(List<String> successExcludeShopIds) {
		this.successExcludeShopIds = successExcludeShopIds;
	}

}
