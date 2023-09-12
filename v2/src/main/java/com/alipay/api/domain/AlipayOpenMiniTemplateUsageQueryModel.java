package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询使用ISV模板的托管小程序列表
 *
 * @author auto create
 * @since 1.0, 2022-12-04 22:27:14
 */
public class AlipayOpenMiniTemplateUsageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5864224523429365162L;

	/**
	 * 小程序投放的端参数，例如投放到支付宝钱包是支付宝端。默认支付宝端。支持：
com.alipay.alipaywallet:支付宝端；
com.alipay.iot.xpaas：支付宝IoT端。
	 */
	@ApiField("bundle_id")
	private String bundleId;

	/**
	 * 查询的页数，起始为 1（第一页） 。默认第一页。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页的数量，最多查询50个，默认查询10个
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 小程序模板APPID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板小程序的版本号
	 */
	@ApiField("template_version")
	private String templateVersion;

	public String getBundleId() {
		return this.bundleId;
	}
	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
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

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}
	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
	}

}
