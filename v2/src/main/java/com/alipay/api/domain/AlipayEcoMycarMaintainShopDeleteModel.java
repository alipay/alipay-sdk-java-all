package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 洗车保养门店删除
 *
 * @author auto create
 * @since 1.0, 2022-09-29 10:03:24
 */
public class AlipayEcoMycarMaintainShopDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4827169494792826816L;

	/**
	 * 外部门店编号（与shop_id二选一，不能都为空）
	 */
	@ApiField("out_shop_id")
	private String outShopId;

	/**
	 * 车主平台门店编号（与out_shop_id二选一，不能都为空）
	 */
	@ApiField("shop_id")
	private Long shopId;

	public String getOutShopId() {
		return this.outShopId;
	}
	public void setOutShopId(String outShopId) {
		this.outShopId = outShopId;
	}

	public Long getShopId() {
		return this.shopId;
	}
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

}
