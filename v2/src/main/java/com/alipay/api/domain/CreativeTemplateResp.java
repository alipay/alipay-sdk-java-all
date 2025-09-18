package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创意模版返回详情对象
 *
 * @author auto create
 * @since 1.0, 2025-05-12 16:14:59
 */
public class CreativeTemplateResp extends AlipayObject {

	private static final long serialVersionUID = 3723142375746423847L;

	/**
	 * DESC模板详情列表
	 */
	@ApiListField("desc_template_detail")
	@ApiField("creative_template_detail_res")
	private List<CreativeTemplateDetailRes> descTemplateDetail;

	/**
	 * 图片或者视频模板详情列表
	 */
	@ApiListField("material_template_detail")
	@ApiField("creative_template_detail_res")
	private List<CreativeTemplateDetailRes> materialTemplateDetail;

	/**
	 * 创意模版描述说明
	 */
	@ApiField("template_desc")
	private String templateDesc;

	/**
	 * 创意模版id
	 */
	@ApiField("template_id")
	private Long templateId;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * TITLE模板详情列表
	 */
	@ApiListField("title_template_detail")
	@ApiField("creative_template_detail_res")
	private List<CreativeTemplateDetailRes> titleTemplateDetail;

	public List<CreativeTemplateDetailRes> getDescTemplateDetail() {
		return this.descTemplateDetail;
	}
	public void setDescTemplateDetail(List<CreativeTemplateDetailRes> descTemplateDetail) {
		this.descTemplateDetail = descTemplateDetail;
	}

	public List<CreativeTemplateDetailRes> getMaterialTemplateDetail() {
		return this.materialTemplateDetail;
	}
	public void setMaterialTemplateDetail(List<CreativeTemplateDetailRes> materialTemplateDetail) {
		this.materialTemplateDetail = materialTemplateDetail;
	}

	public String getTemplateDesc() {
		return this.templateDesc;
	}
	public void setTemplateDesc(String templateDesc) {
		this.templateDesc = templateDesc;
	}

	public Long getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public List<CreativeTemplateDetailRes> getTitleTemplateDetail() {
		return this.titleTemplateDetail;
	}
	public void setTitleTemplateDetail(List<CreativeTemplateDetailRes> titleTemplateDetail) {
		this.titleTemplateDetail = titleTemplateDetail;
	}

}
