package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 健身项目开放模型
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:33:00
 */
public class ExerciseItemOpenModel extends AlipayObject {

	private static final long serialVersionUID = 2686384592428122388L;

	/**
	 * 健身项目描述
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 健身项目在外部系统中的ID
	 */
	@ApiField("external_item_id")
	private String externalItemId;

	/**
	 * 项目类型码:一级只有两种 有氧运动(CARDIO)、重力锻炼(MUSCLE)
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 子健身项目列表。一般重力训练锻炼的肌肉群，有氧运动对应是运动类型
	 */
	@ApiField("item_list")
	private ExerciseItemOpenModelSecond itemList;

	/**
	 * 健身项目名称
	 */
	@ApiField("name")
	private String name;

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExternalItemId() {
		return this.externalItemId;
	}
	public void setExternalItemId(String externalItemId) {
		this.externalItemId = externalItemId;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public ExerciseItemOpenModelSecond getItemList() {
		return this.itemList;
	}
	public void setItemList(ExerciseItemOpenModelSecond itemList) {
		this.itemList = itemList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
