package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商疫苗商品价格修改失败结果
 *
 * @author auto create
 * @since 1.0, 2025-09-19 16:39:55
 */
public class IsvItemIdItemPriceFailDTO extends AlipayObject {

	private static final long serialVersionUID = 6377341228733512497L;

	/**
	 * 记录本条商品操作失败详情
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 外部疫苗商品ID
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
