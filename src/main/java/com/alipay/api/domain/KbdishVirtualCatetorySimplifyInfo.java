package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 虚拟类目同步菜品简化结构类目信息
 *
 * @author auto create
 * @since 1.0, 2020-07-08 10:54:45
 */
public class KbdishVirtualCatetorySimplifyInfo extends AlipayObject {

	private static final long serialVersionUID = 4837119683431954875L;

	/**
	 * 虚拟类目的名称
	 */
	@ApiField("catetory_name")
	private String catetoryName;

	/**
	 * 虚拟类目的排序值，需要保证为数字类型，如果不填默认为1
	 */
	@ApiField("catetory_sort")
	private String catetorySort;

	/**
	 * 虚拟类目关联的菜品信息
	 */
	@ApiListField("dish_list")
	@ApiField("kbdish_virtual_dish_simplify_info")
	private List<KbdishVirtualDishSimplifyInfo> dishList;

	/**
	 * 外部门店id的list
	 */
	@ApiListField("out_shop_ids")
	@ApiField("string")
	private List<String> outShopIds;

	/**
	 * 菜品在菜谱中的售卖时间，同一个out_dish_id都指定的情况下，以第一个为准
	 */
	@ApiListField("time_ranges")
	@ApiField("string")
	private List<String> timeRanges;

	public String getCatetoryName() {
		return this.catetoryName;
	}
	public void setCatetoryName(String catetoryName) {
		this.catetoryName = catetoryName;
	}

	public String getCatetorySort() {
		return this.catetorySort;
	}
	public void setCatetorySort(String catetorySort) {
		this.catetorySort = catetorySort;
	}

	public List<KbdishVirtualDishSimplifyInfo> getDishList() {
		return this.dishList;
	}
	public void setDishList(List<KbdishVirtualDishSimplifyInfo> dishList) {
		this.dishList = dishList;
	}

	public List<String> getOutShopIds() {
		return this.outShopIds;
	}
	public void setOutShopIds(List<String> outShopIds) {
		this.outShopIds = outShopIds;
	}

	public List<String> getTimeRanges() {
		return this.timeRanges;
	}
	public void setTimeRanges(List<String> timeRanges) {
		this.timeRanges = timeRanges;
	}

}
