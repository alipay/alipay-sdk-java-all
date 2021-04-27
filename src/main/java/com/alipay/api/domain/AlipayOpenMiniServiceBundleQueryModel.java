package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨端服务查询
 *
 * @author auto create
 * @since 1.0, 2021-01-20 10:43:38
 */
public class AlipayOpenMiniServiceBundleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6751585766457375368L;

	/**
	 * 多端投放客户端标识
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 小程序id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 页容量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

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

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
