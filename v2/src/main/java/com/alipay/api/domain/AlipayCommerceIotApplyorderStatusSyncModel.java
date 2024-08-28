package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 供应商退货完成反馈接口
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:29:18
 */
public class AlipayCommerceIotApplyorderStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7173612154295843813L;

	/**
	 * 申请单状态
	 */
	@ApiField("apply_order_status")
	private String applyOrderStatus;

	/**
	 * 物料申请单号
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	public String getApplyOrderStatus() {
		return this.applyOrderStatus;
	}
	public void setApplyOrderStatus(String applyOrderStatus) {
		this.applyOrderStatus = applyOrderStatus;
	}

	public String getAssetApplyOrderId() {
		return this.assetApplyOrderId;
	}
	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}

}
