package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 被拆分的子文件
 *
 * @author auto create
 * @since 1.0, 2022-08-10 16:18:13
 */
public class SubContentRisks extends AlipayObject {

	private static final long serialVersionUID = 5468345929136252275L;

	/**
	 * 能否打标true/false
	 */
	@ApiField("can_mark")
	private Boolean canMark;

	/**
	 * 额外扩展字段 某些属性并非所有子素材都包含
frame_time：被拆分素材若是截帧形成的图片则代表该图片在原视频中的位置 单位：毫秒
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 文件素材id，解语花生成的审核素材文件id,查询物料过审规则会用到这个file_id,物料维度打标也会用到这个file_id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * 经过素材处理后生成的文件url信息
	 */
	@ApiField("generated_url")
	private String generatedUrl;

	/**
	 * 对应外部传入的原始文件url信息
	 */
	@ApiField("origin_file")
	private String originFile;

	/**
	 * 素材外部唯一标识用于风险匹配
	 */
	@ApiField("origin_file_id")
	private String originFileId;

	/**
	 * 原始文件名
	 */
	@ApiField("origin_name")
	private String originName;

	/**
	 * 经过内部处理生成的父子层级素材
	 */
	@ApiField("parent_file_id")
	private String parentFileId;

	/**
	 * 风险规则详情
	 */
	@ApiListField("risks")
	@ApiField("content_risk_detail")
	private List<ContentRiskDetail> risks;

	public Boolean getCanMark() {
		return this.canMark;
	}
	public void setCanMark(Boolean canMark) {
		this.canMark = canMark;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getGeneratedUrl() {
		return this.generatedUrl;
	}
	public void setGeneratedUrl(String generatedUrl) {
		this.generatedUrl = generatedUrl;
	}

	public String getOriginFile() {
		return this.originFile;
	}
	public void setOriginFile(String originFile) {
		this.originFile = originFile;
	}

	public String getOriginFileId() {
		return this.originFileId;
	}
	public void setOriginFileId(String originFileId) {
		this.originFileId = originFileId;
	}

	public String getOriginName() {
		return this.originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getParentFileId() {
		return this.parentFileId;
	}
	public void setParentFileId(String parentFileId) {
		this.parentFileId = parentFileId;
	}

	public List<ContentRiskDetail> getRisks() {
		return this.risks;
	}
	public void setRisks(List<ContentRiskDetail> risks) {
		this.risks = risks;
	}

}
