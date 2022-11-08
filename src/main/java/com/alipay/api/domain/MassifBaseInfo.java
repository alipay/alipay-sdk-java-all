package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地块基础信息
 *
 * @author auto create
 * @since 1.0, 2021-12-22 10:12:40
 */
public class MassifBaseInfo extends AlipayObject {

	private static final long serialVersionUID = 6299428245349369915L;

	/**
	 * 市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 县
	 */
	@ApiField("county")
	private String county;

	/**
	 * 土地面积(亩）
土地确权、流转等合同总面积,单位亩
精度 double
	 */
	@ApiField("land_area")
	private String landArea;

	/**
	 * 地块名称
	 */
	@ApiField("land_name")
	private String landName;

	/**
	 * 大地块的标注数据，Json形式
	 */
	@ApiField("lbs")
	private String lbs;

	/**
	 * 地块编号
	 */
	@ApiField("massif_id")
	private String massifId;

	/**
	 * 种植大类
	 */
	@ApiField("plant_category")
	private String plantCategory;

	/**
	 * 种植小类
	 */
	@ApiField("plant_crop")
	private String plantCrop;

	/**
	 * 省
	 */
	@ApiField("province")
	private String province;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return this.county;
	}
	public void setCounty(String county) {
		this.county = county;
	}

	public String getLandArea() {
		return this.landArea;
	}
	public void setLandArea(String landArea) {
		this.landArea = landArea;
	}

	public String getLandName() {
		return this.landName;
	}
	public void setLandName(String landName) {
		this.landName = landName;
	}

	public String getLbs() {
		return this.lbs;
	}
	public void setLbs(String lbs) {
		this.lbs = lbs;
	}

	public String getMassifId() {
		return this.massifId;
	}
	public void setMassifId(String massifId) {
		this.massifId = massifId;
	}

	public String getPlantCategory() {
		return this.plantCategory;
	}
	public void setPlantCategory(String plantCategory) {
		this.plantCategory = plantCategory;
	}

	public String getPlantCrop() {
		return this.plantCrop;
	}
	public void setPlantCrop(String plantCrop) {
		this.plantCrop = plantCrop;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

}
