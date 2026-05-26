package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-13 19:47:45
 */
public class SkuStockInfo extends AlipayObject {

	private static final long serialVersionUID = 3194358938395986225L;

	/**
	 * null
	 */
	@ApiListField("shift_stock_list")
	@ApiField("shift_stock_v_o")
	private List<ShiftStockVO> shiftStockList;

	/**
	 * 商品编码
	 */
	@ApiField("sku_code")
	private String skuCode;

	public List<ShiftStockVO> getShiftStockList() {
		return this.shiftStockList;
	}
	public void setShiftStockList(List<ShiftStockVO> shiftStockList) {
		this.shiftStockList = shiftStockList;
	}

	public String getSkuCode() {
		return this.skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

}
