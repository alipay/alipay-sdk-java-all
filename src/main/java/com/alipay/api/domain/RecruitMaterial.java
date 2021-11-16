package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商报名的素材
 *
 * @author auto create
 * @since 1.0, 2021-09-26 15:27:38
 */
public class RecruitMaterial extends AlipayObject {

	private static final long serialVersionUID = 1573553641976967588L;

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
	 * 素材审核信息，展示给商家的素材审核不通过的意见。素材审核通过时该字段为空。
报名详情查询接口不用填写该字段。
	 */
	@ApiField("material_audit_info")
	private String materialAuditInfo;

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

	public String getMaterialAuditInfo() {
		return this.materialAuditInfo;
	}
	public void setMaterialAuditInfo(String materialAuditInfo) {
		this.materialAuditInfo = materialAuditInfo;
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
