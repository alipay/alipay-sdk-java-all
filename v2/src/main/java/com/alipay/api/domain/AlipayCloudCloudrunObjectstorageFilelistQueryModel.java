package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询对象存储文件列表
 *
 * @author auto create
 * @since 1.0, 2023-06-15 14:48:08
 */
public class AlipayCloudCloudrunObjectstorageFilelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8465412767794721188L;

	/**
	 * 云托管环境ID
	 */
	@ApiField("env")
	private String env;

	/**
	 * 文件id列表
	 */
	@ApiListField("file_id_list")
	@ApiField("string")
	private List<String> fileIdList;

	/**
	 * 文件列表游标索引
	 */
	@ApiField("next_token")
	private String nextToken;

	/**
	 * 分页大小，默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 按前缀进行模糊搜索
	 */
	@ApiField("prefix")
	private String prefix;

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

	public String getNextToken() {
		return this.nextToken;
	}
	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPrefix() {
		return this.prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

}
