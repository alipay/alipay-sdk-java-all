package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户查询行情标签信息
 *
 * @author auto create
 * @since 1.0, 2025-10-10 17:22:47
 */
public class ObjTagRequest extends AlipayObject {

	private static final long serialVersionUID = 7413337482828521246L;

	/**
	 * 股票代码列表，限制条数100个以内
	 */
	@ApiListField("obj_ids")
	@ApiField("string")
	private List<String> objIds;

	/**
	 * 标的类型列表，可以为空
	 */
	@ApiListField("obj_types")
	@ApiField("string")
	private List<String> objTypes;

	/**
	 * 标签代码列表，不能为空
	 */
	@ApiListField("tag_codes")
	@ApiField("string")
	private List<String> tagCodes;

	/**
	 * 标签分组，可以为空
	 */
	@ApiListField("tag_groups")
	@ApiField("string")
	private List<String> tagGroups;

	public List<String> getObjIds() {
		return this.objIds;
	}
	public void setObjIds(List<String> objIds) {
		this.objIds = objIds;
	}

	public List<String> getObjTypes() {
		return this.objTypes;
	}
	public void setObjTypes(List<String> objTypes) {
		this.objTypes = objTypes;
	}

	public List<String> getTagCodes() {
		return this.tagCodes;
	}
	public void setTagCodes(List<String> tagCodes) {
		this.tagCodes = tagCodes;
	}

	public List<String> getTagGroups() {
		return this.tagGroups;
	}
	public void setTagGroups(List<String> tagGroups) {
		this.tagGroups = tagGroups;
	}

}
