package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 碰一下点餐物料申请单物料同步
 *
 * @author auto create
 * @since 1.0, 2025-04-18 15:31:29
 */
public class AlipayOpenSpNordermaterialsapplyMaterialsCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6273875442872325723L;

	/**
	 * 申请单ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 该门店下的物料信息
	 */
	@ApiListField("materials_info")
	@ApiField("create_materials_info")
	private List<CreateMaterialsInfo> materialsInfo;

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

	public List<CreateMaterialsInfo> getMaterialsInfo() {
		return this.materialsInfo;
	}
	public void setMaterialsInfo(List<CreateMaterialsInfo> materialsInfo) {
		this.materialsInfo = materialsInfo;
	}

	public String getShopOrderNo() {
		return this.shopOrderNo;
	}
	public void setShopOrderNo(String shopOrderNo) {
		this.shopOrderNo = shopOrderNo;
	}

}
