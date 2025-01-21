package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下点餐物料申请单门店信息进度查询
 *
 * @author auto create
 * @since 1.0, 2024-11-04 11:21:28
 */
public class AlipayOpenSpNordermaterialsapplyShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1175375189647854478L;

	/**
	 * 创建物料申请接口时，返回的ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 门店单标识
	 */
	@ApiField("shop_order_no")
	private String shopOrderNo;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getShopOrderNo() {
		return this.shopOrderNo;
	}
	public void setShopOrderNo(String shopOrderNo) {
		this.shopOrderNo = shopOrderNo;
	}

}
