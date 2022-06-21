package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 任务规则配置类
 *
 * @author auto create
 * @since 1.0, 2022-06-14 17:16:23
 */
public class TaskRuleConfig extends AlipayObject {

	private static final long serialVersionUID = 5555687124893188194L;

	/**
	 * 任务场景标签列表。场景枚举值：home_delivery（外卖）
	 */
	@ApiListField("scene_tag_list")
	@ApiField("string")
	private List<String> sceneTagList;

	public List<String> getSceneTagList() {
		return this.sceneTagList;
	}
	public void setSceneTagList(List<String> sceneTagList) {
		this.sceneTagList = sceneTagList;
	}

}
