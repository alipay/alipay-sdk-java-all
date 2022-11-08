package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云存储文件列表查询
 *
 * @author auto create
 * @since 1.0, 2022-09-14 14:31:35
 */
public class AlipayOpenMiniCloudFilelistQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7411588499942778672L;

	/**
	 * 云环境ID,在云托管平台获取
	 */
	@ApiField("cloud_id")
	private String cloudId;

	/**
	 * 上次列表查询返回的文件游标索引
	 */
	@ApiField("next_token")
	private String nextToken;

	/**
	 * 查询数量，默认为100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 文件路径,必须以/开头，根目录/
	 */
	@ApiField("path")
	private String path;

	/**
	 * 模糊搜索的前缀
	 */
	@ApiField("prefix")
	private String prefix;

	public String getCloudId() {
		return this.cloudId;
	}
	public void setCloudId(String cloudId) {
		this.cloudId = cloudId;
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

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

	public String getPrefix() {
		return this.prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

}
