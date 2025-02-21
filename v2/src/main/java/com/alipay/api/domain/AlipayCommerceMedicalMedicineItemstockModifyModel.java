package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗药品商品库存修改接口
 *
 * @author auto create
 * @since 1.0, 2024-05-08 13:59:50
 */
public class AlipayCommerceMedicalMedicineItemstockModifyModel extends AlipayObject {

	private static final long serialVersionUID = 1528569622431874171L;

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
	 * 商品库存
	 */
	@ApiField("stock_num")
	private Long stockNum;

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

	public Long getStockNum() {
		return this.stockNum;
	}
	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

}
