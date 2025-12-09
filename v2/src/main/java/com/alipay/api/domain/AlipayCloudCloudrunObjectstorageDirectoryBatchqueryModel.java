package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询文件夹列表
 *
 * @author auto create
 * @since 1.0, 2024-03-14 14:59:16
 */
public class AlipayCloudCloudrunObjectstorageDirectoryBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7749987149989672787L;

	/**
	 * 内部使用 uiam角色扮演token
	 */
	@ApiField("assume_token")
	private String assumeToken;

	/**
	 * 环境ID，唯一，开通小程序云系统会生成环境ID，请从开通页面获取
	 */
	@ApiField("env")
	private String env;

	/**
	 * 文件ID列表
	 */
	@ApiListField("file_id_list")
	@ApiField("string")
	private List<String> fileIdList;

	/**
	 * 文件列表游标索引，next_token为文件分页参数，在本接口的响应中获取，传入next_token以获取下一页数据
	 */
	@ApiField("next_token")
	private String nextToken;

	/**
	 * 分页大小，默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 当前文件或文件夹所在的上一层文件夹的绝对路径
	 */
	@ApiField("parent_directory")
	private String parentDirectory;

	/**
	 * 按文件路径前缀进行模糊搜索
	 */
	@ApiField("prefix")
	private String prefix;

	public String getAssumeToken() {
		return this.assumeToken;
	}
	public void setAssumeToken(String assumeToken) {
		this.assumeToken = assumeToken;
	}

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

	public String getParentDirectory() {
		return this.parentDirectory;
	}
	public void setParentDirectory(String parentDirectory) {
		this.parentDirectory = parentDirectory;
	}

	public String getPrefix() {
		return this.prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

}
