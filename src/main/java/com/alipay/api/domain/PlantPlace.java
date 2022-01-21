package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 森林用户种树地信息
 *
 * @author auto create
 * @since 1.0, 2020-07-07 10:07:31
 */
public class PlantPlace extends AlipayObject {

	private static final long serialVersionUID = 4693571157737675447L;

	/**
	 * 林区面积，单位：亩
	 */
	@ApiField("acreage")
	private String acreage;

	/**
	 * 树已经种下时所在的林区id
	 */
	@ApiField("forest_id")
	private String forestId;

	/**
	 * 林区名称
	 */
	@ApiField("forest_name")
	private String forestName;

	/**
	 * 林区经纬度
	 */
	@ApiField("location")
	private String location;

	/**
	 * 公益机构名称
	 */
	@ApiField("ngo_name")
	private String ngoName;

	/**
	 * 种植年份
	 */
	@ApiField("plant_time")
	private String plantTime;

	/**
	 * 种植所在区域
	 */
	@ApiField("region")
	private String region;

	/**
	 * 林区树木数量
	 */
	@ApiField("tree_count")
	private Long treeCount;

	public String getAcreage() {
		return this.acreage;
	}
	public void setAcreage(String acreage) {
		this.acreage = acreage;
	}

	public String getForestId() {
		return this.forestId;
	}
	public void setForestId(String forestId) {
		this.forestId = forestId;
	}

	public String getForestName() {
		return this.forestName;
	}
	public void setForestName(String forestName) {
		this.forestName = forestName;
	}

	public String getLocation() {
		return this.location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getNgoName() {
		return this.ngoName;
	}
	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public String getPlantTime() {
		return this.plantTime;
	}
	public void setPlantTime(String plantTime) {
		this.plantTime = plantTime;
	}

	public String getRegion() {
		return this.region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

	public Long getTreeCount() {
		return this.treeCount;
	}
	public void setTreeCount(Long treeCount) {
		this.treeCount = treeCount;
	}

}
