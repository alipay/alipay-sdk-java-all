package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 设计Saas页面模版的dto
 *
 * @author auto create
 * @since 1.0, 2022-07-19 20:34:55
 */
public class PageTemplateInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5751571392525662679L;

	/**
	 * 模版code
	 */
	@ApiField("code")
	private String code;

	/**
	 * creator_id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 创建人
	 */
	@ApiField("creator_name")
	private String creatorName;

	/**
	 * 版本号
	 */
	@ApiField("current_version")
	private Long currentVersion;

	/**
	 * 最新的编辑态版本
	 */
	@ApiField("edit_version")
	private Long editVersion;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * code第一次创建时间
	 */
	@ApiField("gmt_create_code")
	private Date gmtCreateCode;

	/**
	 * 最后的修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 数据库id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * modifier_id
	 */
	@ApiField("modifier_id")
	private String modifierId;

	/**
	 * modifier_name
	 */
	@ApiField("modifier_name")
	private String modifierName;

	/**
	 * 模版名字
	 */
	@ApiField("name")
	private String name;

	/**
	 * 参数模版列表
	 */
	@ApiListField("param_template_list")
	@ApiField("page_template_param_info_d_t_o")
	private List<PageTemplateParamInfoDTO> paramTemplateList;

	/**
	 * 图片的cdn地址
	 */
	@ApiField("picture_url")
	private String pictureUrl;

	/**
	 * 模版预览url
	 */
	@ApiField("preview_url")
	private String previewUrl;

	/**
	 * 后端解析器
	 */
	@ApiField("resolve_code")
	private String resolveCode;

	/**
	 * 运行的版本
	 */
	@ApiField("run_version")
	private Long runVersion;

	/**
	 * 模版类型， 具体值定义参考 PageTemplateTypeEnum
	 */
	@ApiField("type")
	private String type;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return this.creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public Long getCurrentVersion() {
		return this.currentVersion;
	}
	public void setCurrentVersion(Long currentVersion) {
		this.currentVersion = currentVersion;
	}

	public Long getEditVersion() {
		return this.editVersion;
	}
	public void setEditVersion(Long editVersion) {
		this.editVersion = editVersion;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtCreateCode() {
		return this.gmtCreateCode;
	}
	public void setGmtCreateCode(Date gmtCreateCode) {
		this.gmtCreateCode = gmtCreateCode;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getModifierId() {
		return this.modifierId;
	}
	public void setModifierId(String modifierId) {
		this.modifierId = modifierId;
	}

	public String getModifierName() {
		return this.modifierName;
	}
	public void setModifierName(String modifierName) {
		this.modifierName = modifierName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<PageTemplateParamInfoDTO> getParamTemplateList() {
		return this.paramTemplateList;
	}
	public void setParamTemplateList(List<PageTemplateParamInfoDTO> paramTemplateList) {
		this.paramTemplateList = paramTemplateList;
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getPreviewUrl() {
		return this.previewUrl;
	}
	public void setPreviewUrl(String previewUrl) {
		this.previewUrl = previewUrl;
	}

	public String getResolveCode() {
		return this.resolveCode;
	}
	public void setResolveCode(String resolveCode) {
		this.resolveCode = resolveCode;
	}

	public Long getRunVersion() {
		return this.runVersion;
	}
	public void setRunVersion(Long runVersion) {
		this.runVersion = runVersion;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
