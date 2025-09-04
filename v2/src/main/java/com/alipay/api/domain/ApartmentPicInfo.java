package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 租房公寓图片信息
 *
 * @author auto create
 * @since 1.0, 2025-06-06 14:56:02
 */
public class ApartmentPicInfo extends AlipayObject {

	private static final long serialVersionUID = 5456843867356775564L;

	/**
	 * 公寓外观图片
	 */
	@ApiListField("appearance_pic_list")
	@ApiField("string")
	private List<String> appearancePicList;

	/**
	 * 公寓休闲区的图片
	 */
	@ApiListField("function_area_pic_list")
	@ApiField("string")
	private List<String> functionAreaPicList;

	/**
	 * 公寓大厅图片
	 */
	@ApiListField("hall_pic_list")
	@ApiField("string")
	private List<String> hallPicList;

	/**
	 * 公寓休闲区的图片
	 */
	@ApiListField("leisure_area_pic_list")
	@ApiField("string")
	private List<String> leisureAreaPicList;

	public List<String> getAppearancePicList() {
		return this.appearancePicList;
	}
	public void setAppearancePicList(List<String> appearancePicList) {
		this.appearancePicList = appearancePicList;
	}

	public List<String> getFunctionAreaPicList() {
		return this.functionAreaPicList;
	}
	public void setFunctionAreaPicList(List<String> functionAreaPicList) {
		this.functionAreaPicList = functionAreaPicList;
	}

	public List<String> getHallPicList() {
		return this.hallPicList;
	}
	public void setHallPicList(List<String> hallPicList) {
		this.hallPicList = hallPicList;
	}

	public List<String> getLeisureAreaPicList() {
		return this.leisureAreaPicList;
	}
	public void setLeisureAreaPicList(List<String> leisureAreaPicList) {
		this.leisureAreaPicList = leisureAreaPicList;
	}

}
