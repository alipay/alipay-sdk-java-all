package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 标品详情
 *
 * @author auto create
 * @since 1.0, 2018-09-17 10:34:17
 */
public class ExtitemDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 8272228273179949799L;

	/**
	 * 标品id
	 */
	@ApiField("extitem_id")
	private String extitemId;

	/**
	 * 标品名称
	 */
	@ApiField("extitem_name")
	private String extitemName;

	/**
	 * 标品的货品组成
	 */
	@ApiListField("goods_component_list")
	@ApiField("goods_component")
	private List<GoodsComponent> goodsComponentList;

	public String getExtitemId() {
		return this.extitemId;
	}
	public void setExtitemId(String extitemId) {
		this.extitemId = extitemId;
	}

	public String getExtitemName() {
		return this.extitemName;
	}
	public void setExtitemName(String extitemName) {
		this.extitemName = extitemName;
	}

	public List<GoodsComponent> getGoodsComponentList() {
		return this.goodsComponentList;
	}
	public void setGoodsComponentList(List<GoodsComponent> goodsComponentList) {
		this.goodsComponentList = goodsComponentList;
	}

}
