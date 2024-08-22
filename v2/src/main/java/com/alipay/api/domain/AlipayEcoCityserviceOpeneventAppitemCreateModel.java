package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 光华平台商品入驻创建商品接口
 *
 * @author auto create
 * @since 1.0, 2023-09-05 19:14:16
 */
public class AlipayEcoCityserviceOpeneventAppitemCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4525293912329745625L;

	/**
	 * 行业编码，表示商品提报时，需要提报的行业。一般有支付宝侧分配
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 该商品在商户侧的唯一标识id，比如数据库主键id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 商品服务关联的套餐信息,json字符串，各行业需要传入的参数请参考公共文档
	 */
	@ApiField("product_package_list_json")
	private String productPackageListJson;

	/**
	 * 详细地址
	 */
	@ApiField("service_desc")
	private String serviceDesc;

	/**
	 * 服务包含功能的描述，不超过20个字
	 */
	@ApiField("service_func")
	private String serviceFunc;

	/**
	 * 服务引导文案，建议6个中文汉字，最长不超过8个汉字，必填
	 */
	@ApiField("service_guide")
	private String serviceGuide;

	/**
	 * 商品的名称，最长不超过30个字
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 商品主界面截图地址url，支持 jpg,png,jpeg格式，大小不超过2M，用户验收审核使用，必填
	 */
	@ApiField("service_snapshot")
	private String serviceSnapshot;

	/**
	 * 服务按行业的模板化配置,json字符串，各行业需要传入的参数请参考公共文档
	 */
	@ApiField("service_template_config")
	private String serviceTemplateConfig;

	/**
	 * 商品所属开发类型，从 H5、生活号、小程序、插件 中4选1
	 */
	@ApiField("service_type")
	private String serviceType;

	/**
	 * 商品的访问地址，通过该地址用户可以跳转到商品的页面，必须是https或者alipays开头，最长1024字符
	 */
	@ApiField("service_url")
	private String serviceUrl;

	/**
	 * 服务验收视频url，多个视频以逗号分隔；单个最大不超过50M，最大支持5个;用于审核使用
	 */
	@ApiField("service_videos")
	private String serviceVideos;

	/**
	 * 门店列表,json字符串，各行业需要传入的参数请参考公共文档
	 */
	@ApiField("shop_list_json")
	private String shopListJson;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductPackageListJson() {
		return this.productPackageListJson;
	}
	public void setProductPackageListJson(String productPackageListJson) {
		this.productPackageListJson = productPackageListJson;
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

	public String getShopListJson() {
		return this.shopListJson;
	}
	public void setShopListJson(String shopListJson) {
		this.shopListJson = shopListJson;
	}

}
