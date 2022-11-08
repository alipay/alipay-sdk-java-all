package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 任务规则配置类
 *
 * @author auto create
 * @since 1.0, 2022-07-19 15:38:49
 */
public class TaskRuleConfig extends AlipayObject {

	private static final long serialVersionUID = 7418684695282149351L;

	/**
	 * 商品配置列表
	 */
	@ApiListField("good_list")
	@ApiField("task_good_config")
	private List<TaskGoodConfig> goodList;

	/**
	 * 任务场景标签列表。场景枚举值：home_delivery（外卖）
	 */
	@ApiListField("scene_tag_list")
	@ApiField("string")
	private List<String> sceneTagList;

	public List<TaskGoodConfig> getGoodList() {
		return this.goodList;
	}
	public void setGoodList(List<TaskGoodConfig> goodList) {
		this.goodList = goodList;
	}

	public List<String> getSceneTagList() {
		return this.sceneTagList;
	}
	public void setSceneTagList(List<String> sceneTagList) {
		this.sceneTagList = sceneTagList;
	}

}
