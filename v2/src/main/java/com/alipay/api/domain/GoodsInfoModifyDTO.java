package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品修改信息
 *
 * @author auto create
 * @since 1.0, 2023-12-11 00:07:02
 */
public class GoodsInfoModifyDTO extends AlipayObject {

	private static final long serialVersionUID = 7575885456448596879L;

	/**
	 * 提报商品库的商品
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 提报商品库的商品
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 商品租赁信息
	 */
	@ApiField("rent_info")
	private RentInfoDTO rentInfo;

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public RentInfoDTO getRentInfo() {
		return this.rentInfo;
	}
	public void setRentInfo(RentInfoDTO rentInfo) {
		this.rentInfo = rentInfo;
	}

}
