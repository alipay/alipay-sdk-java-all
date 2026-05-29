package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家生活号
 *
 * @author auto create
 * @since 1.0, 2026-02-25 16:12:43
 */
public class AlipayDataDataserviceAdpublicCreativetoolQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8768337444977666328L;

	/**
	 * 分页参数，第几页
	 */
	@ApiField("current")
	private Long current;

	/**
	 * 分页参数，每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商家标志,唯一值,在广告投放平台商家详情获取。
	 */
	@ApiField("principal_tag")
	private String principalTag;

	/**
	 * 根据生活号ID或名称模糊查询
	 */
	@ApiField("search_key")
	private String searchKey;

	public Long getCurrent() {
		return this.current;
	}
	public void setCurrent(Long current) {
		this.current = current;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

	public String getSearchKey() {
		return this.searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

}
