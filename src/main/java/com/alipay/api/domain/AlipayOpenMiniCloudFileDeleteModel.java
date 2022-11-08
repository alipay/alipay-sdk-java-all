package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云存储文件目录批量删除
 *
 * @author auto create
 * @since 1.0, 2022-09-14 15:35:54
 */
public class AlipayOpenMiniCloudFileDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2576646916741729391L;

	/**
	 * 云环境ID,在云托管平台获取
	 */
	@ApiField("cloud_id")
	private String cloudId;

	/**
	 * 文件名称列表
	 */
	@ApiListField("file_name_list")
	@ApiField("string")
	private List<String> fileNameList;

	/**
	 * 文件路径,必须以/开头，根目录/
	 */
	@ApiField("path")
	private String path;

	public String getCloudId() {
		return this.cloudId;
	}
	public void setCloudId(String cloudId) {
		this.cloudId = cloudId;
	}

	public List<String> getFileNameList() {
		return this.fileNameList;
	}
	public void setFileNameList(List<String> fileNameList) {
		this.fileNameList = fileNameList;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
