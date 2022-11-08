package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 二级健身项目
 *
 * @author auto create
 * @since 1.0, 2019-01-03 10:33:00
 */
public class ExerciseItemOpenModelSecond extends AlipayObject {

	private static final long serialVersionUID = 3137353342399254495L;

	/**
	 * 健身项目简介
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 健身项目在外部(ISV)系统中的ID
	 */
	@ApiField("external_item_id")
	private String externalItemId;

	/**
	 * 必填项目类型码。由ISV保证唯一。
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 三级健身项目列表
	 */
	@ApiListField("item_list")
	@ApiField("exercise_item_open_model_third")
	private List<ExerciseItemOpenModelThird> itemList;

	/**
	 * 计量信息列表
	 */
	@ApiField("meter_list")
	private MeterOpenModel meterList;

	/**
	 * 二级健身项目名称。
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父项目类型码
	 */
	@ApiField("parent_item_code")
	private String parentItemCode;

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

	public List<ExerciseItemOpenModelThird> getItemList() {
		return this.itemList;
	}
	public void setItemList(List<ExerciseItemOpenModelThird> itemList) {
		this.itemList = itemList;
	}

	public MeterOpenModel getMeterList() {
		return this.meterList;
	}
	public void setMeterList(MeterOpenModel meterList) {
		this.meterList = meterList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentItemCode() {
		return this.parentItemCode;
	}
	public void setParentItemCode(String parentItemCode) {
		this.parentItemCode = parentItemCode;
	}

}
