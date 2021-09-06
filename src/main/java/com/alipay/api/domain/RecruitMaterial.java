package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商报名的素材
 *
 * @author auto create
 * @since 1.0, 2021-06-30 23:43:49
 */
public class RecruitMaterial extends AlipayObject {

	private static final long serialVersionUID = 6471568419413369838L;

	/**
	 * 提报的素材内容，json字符串，使用时需要把此字符串解析成json对象
	 */
	@ApiField("data")
	private String data;

	/**
	 * 素材描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 素材名名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 关联的报名主体ID，目前都是activity_id
	 */
	@ApiField("subject_id")
	private String subjectId;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

}
