package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约信息
 *
 * @author auto create
 * @since 1.0, 2023-06-25 16:42:18
 */
public class ItemDeliveryInfoVO extends AlipayObject {

	private static final long serialVersionUID = 6624888867471318587L;

	/**
	 * 履约配置信息，通过alipay.open.app.delivery.template.query获取属性key列表，is_required=true时属性必填
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

	/**
	 * 履约信息主键ID，建议调用方持久化方便后续查询编辑使用
	 */
	@ApiField("delivery_id")
	private String deliveryId;

	/**
	 * 履约名称
	 */
	@ApiField("delivery_name")
	private String deliveryName;

	/**
	 * 履约类型
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	public List<AppItemAttrVO> getAttrs() {
		return this.attrs;
	}
	public void setAttrs(List<AppItemAttrVO> attrs) {
		this.attrs = attrs;
	}

	public String getDeliveryId() {
		return this.deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getDeliveryName() {
		return this.deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

}
