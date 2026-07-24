package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 通过动态模版渲染后上传文件到oss
 *
 * @author auto create
 * @since 1.0, 2026-06-18 10:34:06
 */
public class AnttechOceanbaseTemplateInstanceUploadModel extends AlipayObject {

	private static final long serialVersionUID = 1276657587156366768L;

	/**
	 * 业务主键，唯一约束，多次重复提交时做幂等
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 用于上游业务方区分不同业务
	 */
	@ApiField("biz_key")
	private String bizKey;

	/**
	 * 根据身份接入申请而来的动态code
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 默认不传，如果需要区分同一个场景下的不同渠道模版，需要这个
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 可选，但一旦选择则一定按照配置id获取获取，获取不到则返回空
	 */
	@ApiField("config_id")
	private Long configId;

	/**
	 * 指定文件名称
	 */
	@ApiField("file_name")
	private String fileName;

	/**
	 * 文件类型
	 */
	@ApiField("file_type")
	private String fileType;

	/**
	 * null
	 */
	@ApiListField("fill_data")
	@ApiField("ob_template_param_request")
	private List<ObTemplateParamRequest> fillData;

	/**
	 * 指定路径前缀
	 */
	@ApiField("upload_prefix")
	private String uploadPrefix;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizKey() {
		return this.bizKey;
	}
	public void setBizKey(String bizKey) {
		this.bizKey = bizKey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Long getConfigId() {
		return this.configId;
	}
	public void setConfigId(Long configId) {
		this.configId = configId;
	}

	public String getFileName() {
		return this.fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return this.fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public List<ObTemplateParamRequest> getFillData() {
		return this.fillData;
	}
	public void setFillData(List<ObTemplateParamRequest> fillData) {
		this.fillData = fillData;
	}

	public String getUploadPrefix() {
		return this.uploadPrefix;
	}
	public void setUploadPrefix(String uploadPrefix) {
		this.uploadPrefix = uploadPrefix;
	}

}
