package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗权益品同步接口
 *
 * @author auto create
 * @since 1.0, 2025-07-03 13:46:16
 */
public class AlipayCommerceMedicalBenefitgoodsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6236261857738968474L;

	/**
	 * 权益品的新增-CREATE、更新-UPDATE、下架操作-OFFLINE、上架操作-ONLINE
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 产品详情信息
	 */
	@ApiField("product")
	private BenefitGoodDetail product;

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public BenefitGoodDetail getProduct() {
		return this.product;
	}
	public void setProduct(BenefitGoodDetail product) {
		this.product = product;
	}

}
