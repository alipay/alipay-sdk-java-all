package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商未妥投上传接口
 *
 * @author auto create
 * @since 1.0, 2024-03-12 16:45:15
 */
public class AntMerchantOrderReverseSupplierApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8679149325127121699L;

	/**
	 * 供应商逆向申请明细
	 */
	@ApiField("asset_reverse_supplier_apply_detail")
	private AssetReverseSupplierApplyDetail assetReverseSupplierApplyDetail;

	public AssetReverseSupplierApplyDetail getAssetReverseSupplierApplyDetail() {
		return this.assetReverseSupplierApplyDetail;
	}
	public void setAssetReverseSupplierApplyDetail(AssetReverseSupplierApplyDetail assetReverseSupplierApplyDetail) {
		this.assetReverseSupplierApplyDetail = assetReverseSupplierApplyDetail;
	}

}
