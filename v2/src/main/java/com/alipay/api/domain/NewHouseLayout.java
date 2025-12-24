package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回结果
 *
 * @author auto create
 * @since 1.0, 2025-05-19 10:42:31
 */
public class NewHouseLayout extends AlipayObject {

	private static final long serialVersionUID = 8126913655553217671L;

	/**
	 * 如：1#楼，2#楼
	 */
	@ApiField("buildings")
	private String buildings;

	/**
	 * 建筑面积(平方米)
	 */
	@ApiField("constructed_area")
	private String constructedArea;

	/**
	 * 楼盘id
	 */
	@ApiField("estate_project_id")
	private String estateProjectId;

	/**
	 * 外部户型id
	 */
	@ApiField("external_id")
	private String externalId;

	/**
	 * 户型介绍
	 */
	@ApiField("introduction")
	private String introduction;

	/**
	 * 户型id
	 */
	@ApiField("layout_id")
	private String layoutId;

	/**
	 * 户型名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 朝向
	 */
	@ApiField("orientation")
	private String orientation;

	/**
	 * 如：***万元/套
	 */
	@ApiField("price")
	private String price;

	public String getBuildings() {
		return this.buildings;
	}
	public void setBuildings(String buildings) {
		this.buildings = buildings;
	}

	public String getConstructedArea() {
		return this.constructedArea;
	}
	public void setConstructedArea(String constructedArea) {
		this.constructedArea = constructedArea;
	}

	public String getEstateProjectId() {
		return this.estateProjectId;
	}
	public void setEstateProjectId(String estateProjectId) {
		this.estateProjectId = estateProjectId;
	}

	public String getExternalId() {
		return this.externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getIntroduction() {
		return this.introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getLayoutId() {
		return this.layoutId;
	}
	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrientation() {
		return this.orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
