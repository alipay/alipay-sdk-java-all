package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品类目预测信息收集接口
 *
 * @author auto create
 * @since 1.0, 2023-10-20 15:12:29
 */
public class AlipayOpenAppItemCategoryConsultModel extends AlipayObject {

	private static final long serialVersionUID = 6425131315975783767L;

	/**
	 * [{"value": "1","name": "售卖类（实物）"},{"value": "2","name": "租赁类（实物）"},{"value": "3","name": "付费充值/兑换类（虚拟）"}]
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 商品详情页URL
	 */
	@ApiField("path")
	private String path;

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
