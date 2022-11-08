package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群基本信息
 *
 * @author auto create
 * @since 1.0, 2022-04-27 11:55:10
 */
public class CrowdBaseInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 2398622597713328521L;

	/**
	 * 人群名称
	 */
	@ApiField("crowd_name")
	private String crowdName;

	/**
	 * 文件基本信息
	 */
	@ApiField("file_info_dto")
	private FileInfoDTO fileInfoDto;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 来源方式
	 */
	@ApiField("source_type")
	private String sourceType;

	public String getCrowdName() {
		return this.crowdName;
	}
	public void setCrowdName(String crowdName) {
		this.crowdName = crowdName;
	}

	public FileInfoDTO getFileInfoDto() {
		return this.fileInfoDto;
	}
	public void setFileInfoDto(FileInfoDTO fileInfoDto) {
		this.fileInfoDto = fileInfoDto;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}
