package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 即时配送商家门店审核状态更新
 *
 * @author auto create
 * @since 1.0, 2020-09-26 20:18:11
 */
public class AlipayOpenInstantdeliveryMerchantshopstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 6495459193652243569L;

	/**
	 * 要更新的商家门店列表
	 */
	@ApiListField("merchant_shop_infos")
	@ApiField("merchant_shop_info")
	private List<MerchantShopInfo> merchantShopInfos;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public List<MerchantShopInfo> getMerchantShopInfos() {
		return this.merchantShopInfos;
	}
	public void setMerchantShopInfos(List<MerchantShopInfo> merchantShopInfos) {
		this.merchantShopInfos = merchantShopInfos;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
