package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品套餐内容数据结构
 *
 * @author auto create
 * @since 1.0, 2017-09-21 12:59:25
 */
public class ItemPackageInfo extends AlipayObject {

	private static final long serialVersionUID = 8796728157257223577L;

	/**
	 * 商品详情-套餐内菜品信息列表
	 */
	@ApiListField("item_units")
	@ApiField("item_unit_info")
	private List<ItemUnitInfo> itemUnits;

	/**
	 * 商品详情-套餐标题。最多不超过15个汉字，30个字符
	 */
	@ApiField("title")
	private String title;

	public List<ItemUnitInfo> getItemUnits() {
		return this.itemUnits;
	}
	public void setItemUnits(List<ItemUnitInfo> itemUnits) {
		this.itemUnits = itemUnits;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
