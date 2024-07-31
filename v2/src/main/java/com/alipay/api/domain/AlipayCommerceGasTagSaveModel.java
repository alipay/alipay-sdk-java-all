package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加油业务标签修改
 *
 * @author auto create
 * @since 1.0, 2024-03-19 10:44:42
 */
public class AlipayCommerceGasTagSaveModel extends AlipayObject {

	private static final long serialVersionUID = 7413269387675856865L;

	/**
	 * 加油业务标签的key
	 */
	@ApiField("tag_key")
	private String tagKey;

	/**
	 * 不同的tagKey传对应的value
	 */
	@ApiField("tag_value")
	private String tagValue;

	/**
	 * 根据target_type传对应的id
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * PID：修改商户，SHOP_ID：修改门店
	 */
	@ApiField("target_type")
	private String targetType;

	public String getTagKey() {
		return this.tagKey;
	}
	public void setTagKey(String tagKey) {
		this.tagKey = tagKey;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
