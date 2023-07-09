package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景中商品添加
 *
 * @author auto create
 * @since 1.0, 2023-06-27 21:19:28
 */
public class TechriskInnovateMpcpromoSceneAddModel extends AlipayObject {

	private static final long serialVersionUID = 4748161955954996793L;

	/**
	 * 商品id列表
	 */
	@ApiListField("data_list")
	@ApiField("string")
	private List<String> dataList;

	/**
	 * 入参格式为数字或者英文字母
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
