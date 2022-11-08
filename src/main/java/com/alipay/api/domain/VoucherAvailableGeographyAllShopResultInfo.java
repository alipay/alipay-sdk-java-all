package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 全部门店结果
 *
 * @author auto create
 * @since 1.0, 2022-08-24 15:33:23
 */
public class VoucherAvailableGeographyAllShopResultInfo extends AlipayObject {

	private static final long serialVersionUID = 6775385575516591121L;

	/**
	 * 请求失败的不可用门店详情。
	 */
	@ApiListField("fail_exclude_shop_infos")
	@ApiField("voucher_fail_shop_info")
	private List<VoucherFailShopInfo> failExcludeShopInfos;

	/**
	 * 请求成功的不可用门店列表。
	 */
	@ApiListField("success_exclude_shop_ids")
	@ApiField("string")
	private List<String> successExcludeShopIds;

	public List<VoucherFailShopInfo> getFailExcludeShopInfos() {
		return this.failExcludeShopInfos;
	}
	public void setFailExcludeShopInfos(List<VoucherFailShopInfo> failExcludeShopInfos) {
		this.failExcludeShopInfos = failExcludeShopInfos;
	}

	public List<String> getSuccessExcludeShopIds() {
		return this.successExcludeShopIds;
	}
	public void setSuccessExcludeShopIds(List<String> successExcludeShopIds) {
		this.successExcludeShopIds = successExcludeShopIds;
	}

}
