package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景类型信息列表
 *
 * @author auto create
 * @since 1.0, 2022-03-30 14:39:18
 */
public class SceneTypeListResult extends AlipayObject {

	private static final long serialVersionUID = 4274897461911981147L;

	/**
	 * 场景类型信息
	 */
	@ApiListField("scene_type_list")
	@ApiField("scene_type_v_o")
	private List<SceneTypeVO> sceneTypeList;

	public List<SceneTypeVO> getSceneTypeList() {
		return this.sceneTypeList;
	}
	public void setSceneTypeList(List<SceneTypeVO> sceneTypeList) {
		this.sceneTypeList = sceneTypeList;
	}

}
