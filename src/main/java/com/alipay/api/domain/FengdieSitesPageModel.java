package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云凤蝶站点页面数据模型
 *
 * @author auto create
 * @since 1.0, 2018-02-02 11:00:14
 */
public class FengdieSitesPageModel extends AlipayObject {

	private static final long serialVersionUID = 1135839791143116537L;

	/**
	 * 站点页面别名
	 */
	@ApiField("alias")
	private String alias;

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
