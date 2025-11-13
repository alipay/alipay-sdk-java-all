package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 行为兴趣人群子类目层级一
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:29:01
 */
public class OpenXlightCrowdChildLevelOne extends AlipayObject {

	private static final long serialVersionUID = 2693826679678882549L;

	/**
	 * 灯火人群类目第二层级子类
	 */
	@ApiListField("children")
	@ApiField("open_xlight_crowd_child_level_two")
	private List<OpenXlightCrowdChildLevelTwo> children;

	/**
	 * 该字段表明人群的名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 该字段表明人群包的tagId，用户在创建和修改单元时可使用该值选中人群包
	 */
	@ApiField("tag_id")
	private String tagId;

	/**
	 * 该参数表明人群覆盖量级
	 */
	@ApiField("user_num")
	private String userNum;

	public List<OpenXlightCrowdChildLevelTwo> getChildren() {
		return this.children;
	}
	public void setChildren(List<OpenXlightCrowdChildLevelTwo> children) {
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
