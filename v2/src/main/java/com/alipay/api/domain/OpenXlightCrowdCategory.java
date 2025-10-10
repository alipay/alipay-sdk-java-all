package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 灯火广告人群类目查询接口返回数据名称
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:29:01
 */
public class OpenXlightCrowdCategory extends AlipayObject {

	private static final long serialVersionUID = 7633598213318775742L;

	/**
	 * 该参数表明行为兴趣人群类目层级一子类目
	 */
	@ApiListField("children")
	@ApiField("open_xlight_crowd_child_level_one")
	private List<OpenXlightCrowdChildLevelOne> children;

	/**
	 * 该参数表明人群包名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 该参数表示行为人群id，可在后续单元的创编上作为行为人群参数传回。
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 该参数表明当前人群包覆盖量级
	 */
	@ApiField("user_num")
	private String userNum;

	public List<OpenXlightCrowdChildLevelOne> getChildren() {
		return this.children;
	}
	public void setChildren(List<OpenXlightCrowdChildLevelOne> children) {
		this.children = children;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTagId() {
		return this.tagId;
	}
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getUserNum() {
		return this.userNum;
	}
	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

}
