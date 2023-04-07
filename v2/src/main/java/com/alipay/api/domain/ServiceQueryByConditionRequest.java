package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询品牌下绑定的可用类目下的服务入参
 *
 * @author auto create
 * @since 1.0, 2021-07-14 16:37:13
 */
public class ServiceQueryByConditionRequest extends AlipayObject {

	private static final long serialVersionUID = 2162581449216957943L;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 类目id
	 */
	@ApiField("node_id")
	private String nodeId;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

}
