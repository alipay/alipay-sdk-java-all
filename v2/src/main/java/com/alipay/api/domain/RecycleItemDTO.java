package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 回收商品，包含回收商品的款式、价格、状态等信息
 *
 * @author auto create
 * @since 1.0, 2025-02-12 10:17:22
 */
public class RecycleItemDTO extends AlipayObject {

	private static final long serialVersionUID = 8676615812528318777L;

	/**
	 * 产品code，用来描述商品的SPU_ID
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * null
	 */
	@ApiListField("skus")
	@ApiField("recycle_sku_d_t_o")
	private List<RecycleSkuDTO> skus;

	/**
	 * 记录当前商品的最新快照，用于排查商品的历史变更数据
	 */
	@ApiField("snapshot_id")
	private String snapshotId;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<RecycleSkuDTO> getSkus() {
		return this.skus;
	}
	public void setSkus(List<RecycleSkuDTO> skus) {
		this.skus = skus;
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}
	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}

}
