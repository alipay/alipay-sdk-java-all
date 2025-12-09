package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 金融通用搜索
 *
 * @author auto create
 * @since 1.0, 2025-09-16 19:49:55
 */
public class DatadigitalFincloudFinsaasOpensearchQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1874573335573977514L;

	/**
	 * 搜索的领域，不传默认全部all
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 搜索每页的文档数，不填默认20
	 */
	@ApiField("pagesize")
	private Long pagesize;

	/**
	 * 搜索用的关键词
	 */
	@ApiField("query")
	private String query;

	/**
	 * 业务分配的scene值
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * debug表示开启调度模式,default或为空表示不开启
	 */
	@ApiField("searchmode")
	private String searchmode;

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public Long getPagesize() {
		return this.pagesize;
	}
	public void setPagesize(Long pagesize) {
		this.pagesize = pagesize;
	}

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSearchmode() {
		return this.searchmode;
	}
	public void setSearchmode(String searchmode) {
		this.searchmode = searchmode;
	}

}
