package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物理门店信息
 *
 * @author auto create
 * @since 1.0, 2025-06-27 19:37:47
 */
public class PhysicalShopInfo extends AlipayObject {

	private static final long serialVersionUID = 4221621562578953847L;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 外部门店编号
	 */
	@ApiField("out_shop_num")
	private String outShopNum;

	/**
	 * 物理门店id
	 */
	@ApiField("physical_shop_id")
	private String physicalShopId;

	/**
	 * 物理门店名称
	 */
	@ApiField("physical_shop_name")
	private String physicalShopName;

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getOutShopNum() {
		return this.outShopNum;
	}
	public void setOutShopNum(String outShopNum) {
		this.outShopNum = outShopNum;
	}

	public String getPhysicalShopId() {
		return this.physicalShopId;
	}
	public void setPhysicalShopId(String physicalShopId) {
		this.physicalShopId = physicalShopId;
	}

	public String getPhysicalShopName() {
		return this.physicalShopName;
	}
	public void setPhysicalShopName(String physicalShopName) {
		this.physicalShopName = physicalShopName;
	}

}
