package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序服务市场搜索
 *
 * @author auto create
 * @since 1.0, 2020-07-22 19:52:56
 */
public class AlipayOpenMiniInnerappServiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2765358336582915378L;

	/**
	 * 业务来源，新接入方需要向支付宝申请专用来源，否则不予接入。https://yuque.antfin-inc.com/tinyapp-all/qddncu/bidushixiang
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * 小程序应用子类型
	 */
	@ApiField("app_sub_type")
	private String appSubType;

	/**
	 * 是否需要展示offline状态插件，不传默认为false（不展示）
	 */
	@ApiField("include_offline")
	private Boolean includeOffline;

	/**
	 * 关键词
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 插件id或模板id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 页码，默认第一页
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页数，默认每页10个
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 是否在服务市场透出，SHOW展示、HIDE隐藏
	 */
	@ApiField("show_type")
	private String showType;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getAppSubType() {
		return this.appSubType;
	}
	public void setAppSubType(String appSubType) {
		this.appSubType = appSubType;
	}

	public Boolean getIncludeOffline() {
		return this.includeOffline;
	}
	public void setIncludeOffline(Boolean includeOffline) {
		this.includeOffline = includeOffline;
	}

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getShowType() {
		return this.showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}

}
