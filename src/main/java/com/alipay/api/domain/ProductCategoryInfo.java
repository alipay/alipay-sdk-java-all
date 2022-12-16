package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 文体业务批量查询场馆产品信息SPI中的产品分类模型。
 *
 * @author auto create
 * @since 1.0, 2022-02-28 15:52:10
 */
public class ProductCategoryInfo extends AlipayObject {

	private static final long serialVersionUID = 7483735114147495999L;

	/**
	 * 使用日期，暂不可跨天
	 */
	@ApiField("date")
	private String date;

	/**
	 * 描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 类别名称。日历型商品使用场地名称例如“五人场A区”，日历型票券商品使用日期例如“1月1日”。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 类别唯一ID
	 */
	@ApiField("out_category_id")
	private String outCategoryId;

	/**
	 * 类别下的区间列表
	 */
	@ApiListField("zone_list")
	@ApiField("product_zone_info")
	private List<ProductZoneInfo> zoneList;

	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutCategoryId() {
		return this.outCategoryId;
	}
	public void setOutCategoryId(String outCategoryId) {
		this.outCategoryId = outCategoryId;
	}

	public List<ProductZoneInfo> getZoneList() {
		return this.zoneList;
	}
	public void setZoneList(List<ProductZoneInfo> zoneList) {
		this.zoneList = zoneList;
	}

}
