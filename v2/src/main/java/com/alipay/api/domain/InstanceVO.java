package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实例
 *
 * @author auto create
 * @since 1.0, 2023-05-18 19:50:21
 */
public class InstanceVO extends AlipayObject {

	private static final long serialVersionUID = 4582742993783334285L;

	/**
	 * 实例创建时间，时间戳
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 实例id
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	/**
	 * 实例状态
	 */
	@ApiField("state")
	private String state;

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
