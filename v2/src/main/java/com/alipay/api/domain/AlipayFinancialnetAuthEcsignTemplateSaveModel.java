package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签呗电子签约合同模板配置保存服务
 *
 * @author auto create
 * @since 1.0, 2023-07-27 11:30:17
 */
public class AlipayFinancialnetAuthEcsignTemplateSaveModel extends AlipayObject {

	private static final long serialVersionUID = 3598534581234791182L;

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
	 * 个人印章组件框，可选。
	 */
	@ApiListField("personal_seal_rects")
	@ApiField("personal_seal_rect_open_v_o")
	private List<PersonalSealRectOpenVO> personalSealRects;

	/**
	 * 单行文本组件框列表
	 */
	@ApiListField("singleline_text_rects")
	@ApiField("multiline_text_rect_open_v_o")
	private List<MultilineTextRectOpenVO> singlelineTextRects;

	/**
	 * 模板文件ID，唯一值，由文件上传接口返回。
	 */
	@ApiField("template_file_id")
	private String templateFileId;

	/**
	 * 合同模板文件类型，目前只支持枚举值里面的三种，非PDF文件，服务端会处理成PDF文件。
	 */
	@ApiField("template_file_type")
	private String templateFileType;

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

	public List<PersonalSealRectOpenVO> getPersonalSealRects() {
		return this.personalSealRects;
	}
	public void setPersonalSealRects(List<PersonalSealRectOpenVO> personalSealRects) {
		this.personalSealRects = personalSealRects;
	}

	public List<MultilineTextRectOpenVO> getSinglelineTextRects() {
		return this.singlelineTextRects;
	}
	public void setSinglelineTextRects(List<MultilineTextRectOpenVO> singlelineTextRects) {
		this.singlelineTextRects = singlelineTextRects;
	}

	public String getTemplateFileId() {
		return this.templateFileId;
	}
	public void setTemplateFileId(String templateFileId) {
		this.templateFileId = templateFileId;
	}

	public String getTemplateFileType() {
		return this.templateFileType;
	}
	public void setTemplateFileType(String templateFileType) {
		this.templateFileType = templateFileType;
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

	public List<TimeStampRectOpenVO> getTimeStampRects() {
		return this.timeStampRects;
	}
	public void setTimeStampRects(List<TimeStampRectOpenVO> timeStampRects) {
		this.timeStampRects = timeStampRects;
	}

}
