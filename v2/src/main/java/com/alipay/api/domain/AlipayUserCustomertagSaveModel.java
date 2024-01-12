package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保存客户标签
 *
 * @author auto create
 * @since 1.0, 2022-10-28 16:44:47
 */
public class AlipayUserCustomertagSaveModel extends AlipayObject {

	private static final long serialVersionUID = 4186197459324349858L;

	/**
	 * 业务场景码。由支付宝产品经理分配，相当于存储标签的使用凭证。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 含义：支付宝会员的openId，是用户（userId）在应用（AppId）下的唯一用户标识（新接入的ISV必传open_id，不传user_id）。网关会将传入的open_id字段的值转换为user_id（2088格式），并放入与之映射的原user_id字段，并移除open_id参数，业务系统获取到的参数仅有user_id。
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
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
