package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 环境属性值
 *
 * @author auto create
 * @since 1.0, 2023-05-24 16:35:35
 */
public class WorkspaceVO extends AlipayObject {

	private static final long serialVersionUID = 3513619997797875667L;

	/**
	 * 基于云的api网关
	 */
	@ApiField("cloudbase_api_gateway")
	private String cloudbaseApiGateway;

	/**
	 * 环境说明
	 */
	@ApiField("description")
	private String description;

	/**
	 * 展示名称
	 */
	@ApiField("display_name")
	private String displayName;

	/**
	 * 服务是否可调用
	 */
	@ApiField("enable_cloud_invoke")
	private Boolean enableCloudInvoke;

	/**
	 * 路径是否可用
	 */
	@ApiField("enable_http")
	private Boolean enableHttp;

	/**
	 * 环境配置id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 环境名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 外部ID
	 */
	@ApiField("outside_id")
	private String outsideId;

	/**
	 * 云产品id
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 云函数产品状态
	 */
	@ApiField("product_status")
	private String productStatus;

	/**
	 * 域名
	 */
	@ApiField("region_name")
	private String regionName;

	/**
	 * 环境状态
	 */
	@ApiField("status")
	private String status;

	public String getCloudbaseApiGateway() {
		return this.cloudbaseApiGateway;
	}
	public void setCloudbaseApiGateway(String cloudbaseApiGateway) {
		this.cloudbaseApiGateway = cloudbaseApiGateway;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Boolean getEnableCloudInvoke() {
		return this.enableCloudInvoke;
	}
	public void setEnableCloudInvoke(Boolean enableCloudInvoke) {
		this.enableCloudInvoke = enableCloudInvoke;
	}

	public Boolean getEnableHttp() {
		return this.enableHttp;
	}
	public void setEnableHttp(Boolean enableHttp) {
		this.enableHttp = enableHttp;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutsideId() {
		return this.outsideId;
	}
	public void setOutsideId(String outsideId) {
		this.outsideId = outsideId;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductStatus() {
		return this.productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getRegionName() {
		return this.regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
