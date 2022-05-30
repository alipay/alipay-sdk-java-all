package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * ape推荐接口
 *
 * @author auto create
 * @since 1.0, 2022-03-17 19:22:17
 */
public class AlipayDigitalopUcdpApeitemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3135463342967177752L;

	/**
	 * 推荐上下文
	 */
	@ApiField("context")
	private ApeRecContext context;

	/**
	 * 待推荐候选集itemId列表，用于调用方指定推荐item的范围，推荐接口将对传入的item进行打分，可为空。
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	/**
	 * 商家在蚂蚁推荐引擎创建的项目id，调用前需要找蚂蚁技术获取。
	 */
	@ApiField("project_id")
	private String projectId;

	/**
	 * 用户唯一标识id，支付宝的用户填写支付宝的用户id。
	 */
	@ApiField("user_id")
	private String userId;

	public ApeRecContext getContext() {
		return this.context;
	}
	public void setContext(ApeRecContext context) {
		this.context = context;
	}

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public String getProjectId() {
		return this.projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
