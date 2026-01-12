package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租赁行业商品库上传接口
 *
 * @author auto create
 * @since 1.0, 2025-12-06 16:20:55
 */
public class AlipayOpenAppRentindustryItemUploadModel extends AlipayObject {

	private static final long serialVersionUID = 6346278826298934883L;

	/**
	 * 商品SKU映射信息
	 */
	@ApiListField("item_sku_infos")
	@ApiField("merchant_upload_spu_info")
	private List<MerchantUploadSpuInfo> itemSkuInfos;

	public List<MerchantUploadSpuInfo> getItemSkuInfos() {
		return this.itemSkuInfos;
	}
	public void setItemSkuInfos(List<MerchantUploadSpuInfo> itemSkuInfos) {
		this.itemSkuInfos = itemSkuInfos;
	}

}
