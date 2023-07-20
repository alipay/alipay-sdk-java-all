package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 对象存储删除文件
 *
 * @author auto create
 * @since 1.0, 2023-06-15 14:48:50
 */
public class AlipayCloudCloudrunObjectstorageFilelistDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 1446356861145164916L;

	/**
	 * 环境ID
	 */
	@ApiField("env")
	private String env;

	/**
	 * 要删除的文件id列表
	 */
	@ApiListField("file_id_list")
	@ApiField("string")
	private List<String> fileIdList;

	public String getEnv() {
		return this.env;
	}
	public void setEnv(String env) {
		this.env = env;
	}

	public List<String> getFileIdList() {
		return this.fileIdList;
	}
	public void setFileIdList(List<String> fileIdList) {
		this.fileIdList = fileIdList;
	}

}
