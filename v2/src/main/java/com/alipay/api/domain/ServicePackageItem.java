package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 批量查询服务包订单列表服务项字段
 *
 * @author auto create
 * @since 1.0, 2026-04-10 16:25:07
 */
public class ServicePackageItem extends AlipayObject {

	private static final long serialVersionUID = 6468218222563425526L;

	/**
	 * 权益ID（商品ID或折扣权益ID）
	 */
	@ApiField("rights_id")
	private String rightsId;

	/**
	 * 服务项名称
	 */
	@ApiField("rights_name")
	private String rightsName;

	/**
	 * 权益类型：
1-商品权益
2-折扣权益
3-渠道价权益
	 */
	@ApiField("rights_type")
	private Long rightsType;

	/**
	 * 规格数量，单位：次
	 */
	@ApiField("spec_quantity")
	private Long specQuantity;

	/**
	 * 剩余规格数量，单位：次
	 */
	@ApiField("spec_quantity_left")
	private Long specQuantityLeft;

	/**
	 * 规格类型：
1-固定次数
2-无限次
	 */
	@ApiField("spec_type")
	private Long specType;

	public String getRightsId() {
		return this.rightsId;
	}
	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

	public String getRightsName() {
		return this.rightsName;
	}
	public void setRightsName(String rightsName) {
		this.rightsName = rightsName;
	}

	public Long getRightsType() {
		return this.rightsType;
	}
	public void setRightsType(Long rightsType) {
		this.rightsType = rightsType;
	}

	public Long getSpecQuantity() {
		return this.specQuantity;
	}
	public void setSpecQuantity(Long specQuantity) {
		this.specQuantity = specQuantity;
	}

	public Long getSpecQuantityLeft() {
		return this.specQuantityLeft;
	}
	public void setSpecQuantityLeft(Long specQuantityLeft) {
		this.specQuantityLeft = specQuantityLeft;
	}

	public Long getSpecType() {
		return this.specType;
	}
	public void setSpecType(Long specType) {
		this.specType = specType;
	}

}
