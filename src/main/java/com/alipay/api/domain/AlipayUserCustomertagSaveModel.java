package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保存客户标签
 *
 * @author auto create
 * @since 1.0, 2018-08-29 16:56:13
 */
public class AlipayUserCustomertagSaveModel extends AlipayObject {

	private static final long serialVersionUID = 4745815835623931229L;

	/**
	 * 业务场景码。由支付宝产品经理分配，相当于存储标签的使用凭证。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 标签名字
	 */
	@ApiField("tag_name")
	private String tagName;

	/**
	 * 标签值，常见为T,F
	 */
	@ApiField("tag_value")
	private String tagValue;

	/**
	 * 支付宝会员uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getTagName() {
		return this.tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
