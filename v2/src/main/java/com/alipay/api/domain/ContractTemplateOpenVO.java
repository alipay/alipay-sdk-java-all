package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签呗电子签约合同模板查询视图对象。
 *
 * @author auto create
 * @since 1.0, 2023-07-24 11:47:15
 */
public class ContractTemplateOpenVO extends AlipayObject {

	private static final long serialVersionUID = 8254357436733186366L;

	/**
	 * 企业印章类型矩形框组件可选。
	 */
	@ApiListField("corporate_seal_rects")
	@ApiField("corporate_seal_rect_open_v_o")
	private List<CorporateSealRectOpenVO> corporateSealRects;

	/**
	 * 多行文本组件框列表，可选。
	 */
	@ApiListField("multiline_text_rects")
	@ApiField("multiline_text_rect_open_v_o")
	private List<MultilineTextRectOpenVO> multilineTextRects;

	/**
	 * 是否必须阅读，非必填，增加解决方案时使用。
	 */
	@ApiField("must_read")
	private Boolean mustRead;

	/**
	 * 个人印章组件框，可选。
	 */
	@ApiListField("personal_seal_rects")
	@ApiField("personal_seal_rect_open_v_o")
	private List<PersonalSealRectOpenVO> personalSealRects;

	/**
	 * 文件预览URL，唯一值，由系统生成。
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 单行文本组件框列表
	 */
	@ApiListField("singleline_text_rects")
	@ApiField("multiline_text_rect_open_v_o")
	private List<MultilineTextRectOpenVO> singlelineTextRects;

	/**
	 * 合同模板ID，如果存在则为唯一值，由系统生成，在保存成功后会返回该值。
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 合同模板描述，非唯一值，由用户自己输入。
	 */
	@ApiField("template_memo")
	private String templateMemo;

	/**
	 * 合同模板名称，非唯一值，由用户自行输入。
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 模板来源，可选，根据模板来源信息获取方式不同，openapi 默认AFTS_FILE。
	 */
	@ApiField("template_source")
	private String templateSource;

	/**
	 * 合同模板文件类型，用于区分文件类型。
	 */
	@ApiField("template_type")
	private String templateType;

	/**
	 * 时间组件框，可选。
	 */
	@ApiListField("time_stamp_rects")
	@ApiField("time_stamp_rect_open_v_o")
	private List<TimeStampRectOpenVO> timeStampRects;

	public List<CorporateSealRectOpenVO> getCorporateSealRects() {
		return this.corporateSealRects;
	}
	public void setCorporateSealRects(List<CorporateSealRectOpenVO> corporateSealRects) {
		this.corporateSealRects = corporateSealRects;
	}

	public List<MultilineTextRectOpenVO> getMultilineTextRects() {
		return this.multilineTextRects;
	}
	public void setMultilineTextRects(List<MultilineTextRectOpenVO> multilineTextRects) {
		this.multilineTextRects = multilineTextRects;
	}

	public Boolean getMustRead() {
		return this.mustRead;
	}
	public void setMustRead(Boolean mustRead) {
		this.mustRead = mustRead;
	}

	public List<PersonalSealRectOpenVO> getPersonalSealRects() {
		return this.personalSealRects;
	}
	public void setPersonalSealRects(List<PersonalSealRectOpenVO> personalSealRects) {
		this.personalSealRects = personalSealRects;
	}

	public String getPreviewUrl() {
		return this.previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	public List<MultilineTextRectOpenVO> getSinglelineTextRects() {
		return this.singlelineTextRects;
	}
	public void setSinglelineTextRects(List<MultilineTextRectOpenVO> singlelineTextRects) {
		this.singlelineTextRects = singlelineTextRects;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateMemo() {
		return this.templateMemo;
	}
	public void setTemplateMemo(String templateMemo) {
		this.templateMemo = templateMemo;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateSource() {
		return this.templateSource;
	}
	public void setTemplateSource(String templateSource) {
		this.templateSource = templateSource;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	public List<TimeStampRectOpenVO> getTimeStampRects() {
		return this.timeStampRects;
	}
	public void setTimeStampRects(List<TimeStampRectOpenVO> timeStampRects) {
		this.timeStampRects = timeStampRects;
	}

}
