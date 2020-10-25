package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝可信电子签名任务撤销
 *
 * @author auto create
 * @since 1.0, 2017-12-20 15:25:04
 */
public class AlipaySecurityProdSignatureTaskCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5178212985318423136L;

	/**
	 * 业务流水号，与初始化接口保持一致
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务唯一标识，由支付宝统一分配，无法自助获取
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 接口版本信息，目前默认3，由服务提供方指定。
	 */
	@ApiField("service_version")
	private String serviceVersion;

	/**
	 * 签约任务编号，与初始化返回参数一致。
	 */
	@ApiField("task_id")
	private String taskId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}
	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
