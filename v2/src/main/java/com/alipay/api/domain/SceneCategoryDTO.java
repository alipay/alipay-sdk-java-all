package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景类目信息列表
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:10:42
 */
public class SceneCategoryDTO extends AlipayObject {

	private static final long serialVersionUID = 2684987477724216773L;

	/**
	 * 类目信息列表
	 */
	@ApiListField("category_list")
	@ApiField("category_info_d_t_o")
	private List<CategoryInfoDTO> categoryList;

	/**
	 * 服务商已签约场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景名称
	 */
	@ApiField("scene_name")
	private String sceneName;

	public List<CategoryInfoDTO> getCategoryList() {
		return this.categoryList;
	}
	public void setCategoryList(List<CategoryInfoDTO> categoryList) {
		this.categoryList = categoryList;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneName() {
		return this.sceneName;
	}
	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

}
