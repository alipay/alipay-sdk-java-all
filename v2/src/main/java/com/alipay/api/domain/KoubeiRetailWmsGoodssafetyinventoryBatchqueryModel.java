package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安全库存批量查询接口
 *
 * @author auto create
 * @since 1.0, 2018-09-17 09:54:10
 */
public class KoubeiRetailWmsGoodssafetyinventoryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4234858877695737176L;

	/**
	 * 货品编码，限制最大查询数量1000
	 */
	@ApiListField("goods_codes")
	@ApiField("string")
	private List<String> goodsCodes;

	/**
	 * 仓库编码
	 */
	@ApiField("warehouse_code")
	private String warehouseCode;

	public List<String> getGoodsCodes() {
		return this.goodsCodes;
	}
	public void setGoodsCodes(List<String> goodsCodes) {
		this.goodsCodes = goodsCodes;
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}
	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

}
