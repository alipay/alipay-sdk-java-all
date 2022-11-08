package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校园搜索服务提报
 *
 * @author auto create
 * @since 1.0, 2022-07-18 15:00:35
 */
public class AlipayCommerceEducateSchoolserviceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5856841937567245429L;

	/**
	 * 服务关联的内容id
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 服务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 服务外部ID，要求唯一
	 */
	@ApiField("out_service_id")
	private String outServiceId;

	/**
	 * 学校名称
	 */
	@ApiField("school_name")
	private String schoolName;

	/**
	 * 服务code
	 */
	@ApiField("service_app_id")
	private String serviceAppId;

	/**
	 * 支付宝返回的服务唯一ID，修改时需要传入
	 */
	@ApiField("service_id")
	private String serviceId;

	/**
	 * 来源ID
	 */
	@ApiField("source_type")
	private String sourceType;

	/**
	 * 服务目标url
	 */
	@ApiField("url")
	private String url;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutServiceId() {
		return this.outServiceId;
	}
	public void setOutServiceId(String outServiceId) {
		this.outServiceId = outServiceId;
	}

	public String getSchoolName() {
		return this.schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getServiceAppId() {
		return this.serviceAppId;
	}
	public void setServiceAppId(String serviceAppId) {
		this.serviceAppId = serviceAppId;
	}

	public String getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getSourceType() {
		return this.sourceType;
	}
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
