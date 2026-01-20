package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商疫苗修改库存失败结果
 *
 * @author auto create
 * @since 1.0, 2025-09-19 16:39:58
 */
public class IsvItemIdItemStockFailDTO extends AlipayObject {

	private static final long serialVersionUID = 4429543179652968422L;

	/**
	 * 记录本条疫苗操作失败原因
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 外部服务商疫苗商品ID
	 */
	@ApiField("isv_item_id")
	private String isvItemId;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIsvItemId() {
		return this.isvItemId;
	}
	public void setIsvItemId(String isvItemId) {
		this.isvItemId = isvItemId;
	}

}
