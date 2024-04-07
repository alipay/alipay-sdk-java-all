package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 单品信息列表（数据）
 *
 * @author auto create
 * @since 1.0, 2016-05-26 13:26:04
 */
public class AlipayDataItemGoodsList extends AlipayObject {

	private static final long serialVersionUID = 8625159922465614947L;

	/**
	 * 单品的描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 单品id列表
	 */
	@ApiListField("goods_list")
	@ApiField("string")
	private List<String> goodsList;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<String> getGoodsList() {
		return this.goodsList;
	}
	public void setGoodsList(List<String> goodsList) {
		this.goodsList = goodsList;
	}

}
