package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设备信息
 *
 * @author auto create
 * @since 1.0, 2023-10-16 19:33:01
 */
public class AmpeDeviceVO extends AlipayObject {

	private static final long serialVersionUID = 1444253992486211141L;

	/**
	 * 数据插入时间
	 */
	@ApiField("add_time")
	private Date addTime;

	/**
	 * 设备id
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备机型id
	 */
	@ApiField("model_id")
	private Long modelId;

	/**
	 * 设备机型名称
	 */
	@ApiField("model_name")
	private String modelName;

	/**
	 * 设备机型编号
	 */
	@ApiField("model_no")
	private String modelNo;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private Long productId;

	/**
	 * 产品名称
	 */
	@ApiField("product_name")
	private String productName;

	public Date getAddTime() {
		return this.addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Long getModelId() {
		return this.modelId;
	}
	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelNo() {
		return this.modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
