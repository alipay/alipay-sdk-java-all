package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据状态批量查询版本信息
 *
 * @author auto create
 * @since 1.0, 2021-09-30 15:41:22
 */
public class AlipayOpenMiniInnerversionConditionBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5347641475546888827L;

	/**
	 * 业务来源
	 */
	@ApiField("app_origin")
	private String appOrigin;

	/**
	 * com.alipay.alipaywallet:支付宝，com.amap.app:高德
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序ID，仅特殊场景使用，普通业务方无需关注该参数。
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private String pageNum;

	/**
	 * 分页数
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * INIT:开发中，RELEASE:上架，OFFLINE:下架，AUDITING:审核中，AUDIT_REJECT:审核驳回，WAIT_RELEASE:待上架，GRAY:灰度中，以,号隔开
	 */
	@ApiField("version_status")
	private String versionStatus;

	public String getAppOrigin() {
		return this.appOrigin;
	}
	public void setAppOrigin(String appOrigin) {
		this.appOrigin = appOrigin;
	}

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
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

	public String getVersionStatus() {
		return this.versionStatus;
	}
	public void setVersionStatus(String versionStatus) {
		this.versionStatus = versionStatus;
	}

}
