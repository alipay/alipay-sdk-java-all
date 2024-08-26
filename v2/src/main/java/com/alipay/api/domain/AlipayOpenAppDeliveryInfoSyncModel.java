package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约信息同步
 *
 * @author auto create
 * @since 1.0, 2024-06-27 18:02:51
 */
public class AlipayOpenAppDeliveryInfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7641163327623984846L;

	/**
	 * 履约属性，从模板中查询(alipay.open.app.delivery.template.query)得到，is_required=1时表示属性必填。
	 */
	@ApiListField("attrs")
	@ApiField("app_item_attr_v_o")
	private List<AppItemAttrVO> attrs;

	/**
	 * 履约信息主键可唯一确定一条履约，该字段用来区分创建or更新履约信息。
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
