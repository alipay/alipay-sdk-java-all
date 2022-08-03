package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部商户券码券核查
 *
 * @author auto create
 * @since 1.0, 2018-02-02 14:44:46
 */
public class AlipayMarketingVoucherStockMatchModel extends AlipayObject {

	private static final long serialVersionUID = 1429149937826247812L;

	/**
	 * 待核查券码列表，商户体系内可兑换使用的券码
	 */
	@ApiListField("entity_list")
	@ApiField("string")
	private List<String> entityList;

	/**
	 * 库存ID,创建库存时返回
	 */
	@ApiField("stock_id")
	private String stockId;

	public List<String> getEntityList() {
		return this.entityList;
	}
	public void setEntityList(List<String> entityList) {
		this.entityList = entityList;
	}

	public String getStockId() {
		return this.stockId;
	}
	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

}
