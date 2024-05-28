package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗药品商品上下架状态修改接口
 *
 * @author auto create
 * @since 1.0, 2024-05-08 13:59:14
 */
public class AlipayCommerceMedicalMedicineItemstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2618675799148513197L;

	/**
	 * 支付宝平台侧商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 外部唯一标识商品的id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 商品上下架状态
	 */
	@ApiField("sale_status")
	private String saleStatus;

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getSaleStatus() {
		return this.saleStatus;
	}
	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

}
