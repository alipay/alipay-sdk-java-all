package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资源模型
 *
 * @author auto create
 * @since 1.0, 2025-11-04 10:42:50
 */
public class AvailableResourceModel extends AlipayObject {

	private static final long serialVersionUID = 8387815549767613975L;

	/**
	 * 错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 可用资源信息
	 */
	@ApiListField("resources")
	@ApiField("available_seat_model")
	private List<AvailableSeatModel> resources;

	/**
	 * 技能组code
	 */
	@ApiField("skill_group_code")
	private String skillGroupCode;

	/**
	 * 技能组名称
	 */
	@ApiField("skill_group_name")
	private String skillGroupName;

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public List<AvailableSeatModel> getResources() {
		return this.resources;
	}
	public void setResources(List<AvailableSeatModel> resources) {
		this.resources = resources;
	}

	public String getSkillGroupCode() {
		return this.skillGroupCode;
	}
	public void setSkillGroupCode(String skillGroupCode) {
		this.skillGroupCode = skillGroupCode;
	}

	public String getSkillGroupName() {
		return this.skillGroupName;
	}
	public void setSkillGroupName(String skillGroupName) {
		this.skillGroupName = skillGroupName;
	}

}
