package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁iot进件退货订单申请
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:30:48
 */
public class AlipayCommerceIotDapplyRefundCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7816673189422674462L;

	/**
	 * 物料申请单号
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	public String getAssetApplyOrderId() {
		return this.assetApplyOrderId;
	}
	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
