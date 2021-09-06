package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询物料申请人信息
 *
 * @author auto create
 * @since 1.0, 2019-08-21 19:52:13
 */
public class AlipayCommerceIotMdeviceprodAssetapplyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2529812848553685545L;

	/**
	 * 物料平台的申请单ID
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	public String getApplyOrderId() {
		return this.applyOrderId;
	}
	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}

}
