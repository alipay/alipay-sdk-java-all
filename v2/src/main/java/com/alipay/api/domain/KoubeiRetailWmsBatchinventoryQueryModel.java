package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 有批次信息的库存查询接口
 *
 * @author auto create
 * @since 1.0, 2018-04-26 16:34:06
 */
public class KoubeiRetailWmsBatchinventoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8883355732531478984L;

	/**
	 * 货品编码列表
	 */
	@ApiListField("goods_code_list")
	@ApiField("string")
	private List<String> goodsCodeList;

	/**
	 * 货品类型，ZP("正品"),CC("残次"),JS("机损"), XS("箱损"),ZT("在途库存")
	 */
	@ApiField("inventory_type")
	private String inventoryType;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public List<String> getGoodsCodeList() {
		return this.goodsCodeList;
	}
	public void setGoodsCodeList(List<String> goodsCodeList) {
		this.goodsCodeList = goodsCodeList;
	}

	public String getInventoryType() {
		return this.inventoryType;
	}
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
