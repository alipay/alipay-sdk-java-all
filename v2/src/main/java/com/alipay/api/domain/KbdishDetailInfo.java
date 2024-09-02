package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 菜品明细
 *
 * @author auto create
 * @since 1.0, 2020-12-10 14:08:02
 */
public class KbdishDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 6126186215174546651L;

	/**
	 * 外部菜品id
	 */
	@ApiField("out_dish_id")
	private String outDishId;

	/**
	 * 外部sku_id列表
	 */
	@ApiListField("out_sku_id_list")
	@ApiField("string")
	private List<String> outSkuIdList;

	public String getOutDishId() {
		return this.outDishId;
	}
	public void setOutDishId(String outDishId) {
		this.outDishId = outDishId;
	}

	public List<String> getOutSkuIdList() {
		return this.outSkuIdList;
	}
	public void setOutSkuIdList(List<String> outSkuIdList) {
		this.outSkuIdList = outSkuIdList;
	}

}
