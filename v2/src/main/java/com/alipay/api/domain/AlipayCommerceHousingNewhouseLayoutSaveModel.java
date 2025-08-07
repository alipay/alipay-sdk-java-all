package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新房户型新增或更新接口
 *
 * @author auto create
 * @since 1.0, 2025-05-19 10:47:29
 */
public class AlipayCommerceHousingNewhouseLayoutSaveModel extends AlipayObject {

	private static final long serialVersionUID = 4822792766365228641L;

	/**
	 * 楼栋信息
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
	 * null
	 */
	@ApiListField("layout_img")
	@ApiField("string")
	private List<String> layoutImg;

	/**
	 * null
	 */
	@ApiListField("layout_video")
	@ApiField("string")
	private List<String> layoutVideo;

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
	 * 价格(元/套)
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

	public List<String> getLayoutImg() {
		return this.layoutImg;
	}
	public void setLayoutImg(List<String> layoutImg) {
		this.layoutImg = layoutImg;
	}

	public List<String> getLayoutVideo() {
		return this.layoutVideo;
	}
	public void setLayoutVideo(List<String> layoutVideo) {
		this.layoutVideo = layoutVideo;
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
