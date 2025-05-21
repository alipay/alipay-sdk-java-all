package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 规格信息，数量，大小，尺寸等
 *
 * @author auto create
 * @since 1.0, 2023-11-01 19:38:07
 */
public class VoucherGoodsQuantitySpecificationInfo extends AlipayObject {

	private static final long serialVersionUID = 5794686146536174754L;

	/**
	 * 定向类型用于规格设置，比如：FIX 表示 固定满X件，APPOINT 表示指定第N件
	 */
	@ApiField("directional_type")
	private String directionalType;

	/**
	 * 数量
	 */
	@ApiField("specification_quantity")
	private Long specificationQuantity;

	/**
	 * 单位
	 */
	@ApiField("specification_unit")
	private String specificationUnit;

	public String getDirectionalType() {
		return this.directionalType;
	}
	public void setDirectionalType(String directionalType) {
		this.directionalType = directionalType;
	}

	public Long getSpecificationQuantity() {
		return this.specificationQuantity;
	}
	public void setSpecificationQuantity(Long specificationQuantity) {
		this.specificationQuantity = specificationQuantity;
	}

	public String getSpecificationUnit() {
		return this.specificationUnit;
	}
	public void setSpecificationUnit(String specificationUnit) {
		this.specificationUnit = specificationUnit;
	}

}
