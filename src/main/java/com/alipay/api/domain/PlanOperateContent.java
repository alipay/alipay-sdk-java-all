package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放配置场景内容
 *
 * @author auto create
 * @since 1.0, 2019-10-31 22:01:53
 */
public class PlanOperateContent extends AlipayObject {

	private static final long serialVersionUID = 1441218429388996328L;

	/**
	 * 内容入参 key, 支持的枚举值: 
APP_SKIP_URL:小程序跳转链接, 完整的 schema 跳转地址, 需要与配置投放的小程序相对应 MEMBER_CARD_OPEN_URL: 会员卡开通链接, 需要归属于当前 pid
 BENEFIT_TEXT: 权益文案, 用于自定义 iot 端结果页透出文案
	 */
	@ApiField("key")
	private String key;

	/**
	 * 内容入参值, 具体内容参照 key 的枚举值
	 */
	@ApiField("value")
	private String value;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
