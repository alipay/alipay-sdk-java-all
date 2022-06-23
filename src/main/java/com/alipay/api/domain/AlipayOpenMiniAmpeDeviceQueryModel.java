package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询机型设备列表
 *
 * @author auto create
 * @since 1.0, 2020-07-14 10:50:16
 */
public class AlipayOpenMiniAmpeDeviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7496684324455463749L;

	/**
	 * 设备id，选填
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 机型ID，必填
	 */
	@ApiField("model_id")
	private Long modelId;

	/**
	 * 当前页，选填，默认值为1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页记录数，选填，默认值10, 最大值为100
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 产品ID，必填
	 */
	@ApiField("product_id")
	private Long productId;

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

	public Long getProductId() {
		return this.productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}

}
