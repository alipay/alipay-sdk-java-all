package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建个性化推荐场景项目
 *
 * @author auto create
 * @since 1.0, 2024-01-05 11:44:40
 */
public class TechriskInnovateMpcpromoSceneCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4423138712416235891L;

	/**
	 * 商品数据的列表；创建场景时所选中的商品数据需为
	 */
	@ApiListField("data_list")
	@ApiField("string")
	private List<String> dataList;

	/**
	 * 场景码，String类型
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * 推荐对象类型，目前仅支持商品，默认为GOODS_INFO。
	 */
	@ApiField("recommend_type")
	private String recommendType;

	/**
	 * 场景描述
	 */
	@ApiField("scene_description")
	private String sceneDescription;

	/**
	 * 场景项目名称
	 */
	@ApiField("scene_project_name")
	private String sceneProjectName;

	public List<String> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getRecommendType() {
		return this.recommendType;
	}
	public void setRecommendType(String recommendType) {
		this.recommendType = recommendType;
	}

	public String getSceneDescription() {
		return this.sceneDescription;
	}
	public void setSceneDescription(String sceneDescription) {
		this.sceneDescription = sceneDescription;
	}

	public String getSceneProjectName() {
		return this.sceneProjectName;
	}
	public void setSceneProjectName(String sceneProjectName) {
		this.sceneProjectName = sceneProjectName;
	}

}
