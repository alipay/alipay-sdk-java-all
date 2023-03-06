package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建antest云测任务
 *
 * @author auto create
 * @since 1.0, 2020-04-21 15:47:19
 */
public class AlipayCommerceAntestTaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2414669844698532731L;

	/**
	 * 支付宝版本
	 */
	@ApiField("alipay_version")
	private String alipayVersion;

	/**
	 * appId
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * 小程序版本
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 用例列表
	 */
	@ApiField("case_list")
	private String caseList;

	/**
	 * 设备策略
	 */
	@ApiField("device_strategy")
	private String deviceStrategy;

	/**
	 * 2000002
	 */
	@ApiField("mock_group_id")
	private Long mockGroupId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 测试策略
	 */
	@ApiField("test_strategy")
	private String testStrategy;

	public String getAlipayVersion() {
		return this.alipayVersion;
	}
	public void setAlipayVersion(String alipayVersion) {
		this.alipayVersion = alipayVersion;
	}

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getCaseList() {
		return this.caseList;
	}
	public void setCaseList(String caseList) {
		this.caseList = caseList;
	}

	public String getDeviceStrategy() {
		return this.deviceStrategy;
	}
	public void setDeviceStrategy(String deviceStrategy) {
		this.deviceStrategy = deviceStrategy;
	}

	public Long getMockGroupId() {
		return this.mockGroupId;
	}
	public void setMockGroupId(Long mockGroupId) {
		this.mockGroupId = mockGroupId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTestStrategy() {
		return this.testStrategy;
	}
	public void setTestStrategy(String testStrategy) {
		this.testStrategy = testStrategy;
	}

}
