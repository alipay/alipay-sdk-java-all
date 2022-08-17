package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据APPID分页查询小程序发布信息
 *
 * @author auto create
 * @since 1.0, 2021-06-21 10:40:40
 */
public class AlipayOpenMiniAppdeployByappidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6156546754882279991L;

	/**
	 * 端标识
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 租户标识
	 */
	@ApiField("inst_code")
	private String instCode;

	/**
	 * 小程序应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 当前页，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页个数
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
	}

	public String getInstCode() {
		return this.instCode;
	}
	public void setInstCode(String instCode) {
		this.instCode = instCode;
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

}
