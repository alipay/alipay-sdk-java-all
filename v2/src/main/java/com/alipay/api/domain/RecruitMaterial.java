package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招商报名的素材
 *
 * @author auto create
 * @since 1.0, 2022-09-16 11:49:45
 */
public class RecruitMaterial extends AlipayObject {

	private static final long serialVersionUID = 5895512255624973486L;

	/**
	 * 提报的素材内容，json字符串，使用时需要把此字符串解析成json对象。
字段来源于“招商方案查询接口（https://opendocs.alipay.com/pre-open/02bhl7）”中返回的素材字段field。如：activityImage、contentId等。
字段类型mediaType包含：
 IMAGE，图片类型
 TEXT，文本类型
 DATASOURCE，数据源类型， 如：内容ID（contentId）字段类型为DATASOURCE
字段取值：
 图片（IMAGE）：
 aftsFileId：“营销图片资源上传接口（https://opendocs.alipay.com/pre-open/02bhlj）”返回的图片唯一资源ID
 文本（TEXT）：
 text：文本内容
 数据源（DATASOURCE）：
 text：当前仅支持内容ID值，可通过“内容批量查询接口（https://opendocs.alipay.com/pre-apis/02lu12，仅供受邀用户使用）”查询内容ID。
	 */
	@ApiField("data")
	private String data;

	/**
	 * 对这个素材的描述，用于后续管理该素材
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
	 * 关联的报名主体ID。
enroll_scene_type是VOUCHER时，报名主体ID是activity_id；
enroll_scene_type是MINI_APP时，报名主体ID是mini_app_id；
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
