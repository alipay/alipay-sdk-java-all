package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 云凤蝶站点页面数据模型
 *
 * @author auto create
 * @since 1.0, 2018-11-08 16:15:57
 */
public class FengdieSitesPageModel extends AlipayObject {

	private static final long serialVersionUID = 4465852689341772142L;

	/**
	 * 站点页面别名
	 */
	@ApiField("alias")
	private String alias;

	/**
	 * 是否为首页
	 */
	@ApiField("is_home_page")
	private Boolean isHomePage;

	/**
	 * 首页原始 url，仅在 isHomePage = true 时候才存在
	 */
	@ApiField("origin_url")
	private String originUrl;

	/**
	 * 活动页面 schema 数据
	 */
	@ApiListField("schema")
	@ApiField("fengdie_activity_schema_model")
	private List<FengdieActivitySchemaModel> schema;

	/**
	 * H5页面预览图
	 */
	@ApiField("snapshot")
	private String snapshot;

	/**
	 * 页面访问地址
	 */
	@ApiField("url")
	private String url;

	public String getAlias() {
		return this.alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Boolean getIsHomePage() {
		return this.isHomePage;
	}
	public void setIsHomePage(Boolean isHomePage) {
		this.isHomePage = isHomePage;
	}

	public String getOriginUrl() {
		return this.originUrl;
	}
	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
	}

	public List<FengdieActivitySchemaModel> getSchema() {
		return this.schema;
	}
	public void setSchema(List<FengdieActivitySchemaModel> schema) {
		this.schema = schema;
	}

	public String getSnapshot() {
		return this.snapshot;
	}
	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
