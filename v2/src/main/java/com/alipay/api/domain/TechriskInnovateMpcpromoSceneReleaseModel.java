package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景中商品删除
 *
 * @author auto create
 * @since 1.0, 2023-09-21 18:45:32
 */
public class TechriskInnovateMpcpromoSceneReleaseModel extends AlipayObject {

	private static final long serialVersionUID = 1836141492134275773L;

	/**
	 * 商品列表
	 */
	@ApiListField("data_list")
	@ApiField("string")
	private List<String> dataList;

	/**
	 * 坑位码，入参必须为数字或者英文字母
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

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

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
