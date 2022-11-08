package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 光华平台服务入驻创建服务接口
 *
 * @author auto create
 * @since 1.0, 2022-10-24 14:34:16
 */
public class AlipayEcoCityserviceOpeneventAppCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4479698981835476545L;

	/**
	 * 服务入驻所选择的行业编码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 服务介绍，不超过100个字，必填
	 */
	@ApiField("service_desc")
	private String serviceDesc;

	/**
	 * 服务包含功能的描述，不超过20个字，必填
	 */
	@ApiField("service_func")
	private String serviceFunc;

	/**
	 * 服务引导文案，建议6个中文汉字，最长不超过8个汉字
	 */
	@ApiField("service_guide")
	private String serviceGuide;

	/**
	 * 服务的标签列表，用来标明服务的一些特征属性
	 */
	@ApiField("service_labels")
	private String serviceLabels;

	/**
	 * 服务名称
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 服务登录后主界面截图地址url，支持 jpg,png,jpeg格式，大小不超过2M，必填
	 */
	@ApiField("service_snapshot")
	private String serviceSnapshot;

	/**
	 * 按行业不同的模板
	 */
	@ApiField("service_template_config")
	private String serviceTemplateConfig;

	/**
	 * 服务类型，从 H5、生活号、小程序、插件 中4选1，必填
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 服务的访问地址，必须是https或者alipays开头，最长1024字符，必填
	 */
	@ApiField("service_url")
	private String serviceUrl;

	/**
	 * 服务验收视频url，多个视频以逗号分隔；单个最大不超过50M，最大支持5个
	 */
	@ApiField("service_videos")
	private String serviceVideos;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getServiceDesc() {
		return this.serviceDesc;
	}
	public void setServiceDesc(String serviceDesc) {
		this.serviceDesc = serviceDesc;
	}

	public String getServiceFunc() {
		return this.serviceFunc;
	}
	public void setServiceFunc(String serviceFunc) {
		this.serviceFunc = serviceFunc;
	}

	public String getServiceGuide() {
		return this.serviceGuide;
	}
	public void setServiceGuide(String serviceGuide) {
		this.serviceGuide = serviceGuide;
	}

	public String getServiceLabels() {
		return this.serviceLabels;
	}
	public void setServiceLabels(String serviceLabels) {
		this.serviceLabels = serviceLabels;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceSnapshot() {
		return this.serviceSnapshot;
	}
	public void setServiceSnapshot(String serviceSnapshot) {
		this.serviceSnapshot = serviceSnapshot;
	}

	public String getServiceTemplateConfig() {
		return this.serviceTemplateConfig;
	}
	public void setServiceTemplateConfig(String serviceTemplateConfig) {
		this.serviceTemplateConfig = serviceTemplateConfig;
	}

	public String getServiceType() {
		return this.serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceUrl() {
		return this.serviceUrl;
	}
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getServiceVideos() {
		return this.serviceVideos;
	}
	public void setServiceVideos(String serviceVideos) {
		this.serviceVideos = serviceVideos;
	}

}
