package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约信息查询接口
 *
 * @author auto create
 * @since 1.0, 2024-06-27 18:02:50
 */
public class AlipayOpenAppDeliveryInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6272722692549941511L;

	/**
	 * 查询的履约ID列表，与履约类型不能同时为空。建议接入方在履约同步时持久化存储履约ID信息，最大支持上限500
	 */
	@ApiListField("delivery_ids")
	@ApiField("string")
	private List<String> deliveryIds;

	/**
	 * 该入参需要和履约信息ID列表不能同时为空，会查询对应appId下的该种履约类型的履约信息，最大查询数量500条
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	public List<String> getDeliveryIds() {
		return this.deliveryIds;
	}
	public void setDeliveryIds(List<String> deliveryIds) {
		this.deliveryIds = deliveryIds;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

}
