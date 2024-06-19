package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客渠道信息
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:40:48
 */
public class KbAdvertAddChannelRequest extends AlipayObject {

	private static final long serialVersionUID = 6298386887395757435L;

	/**
	 * 描述信息(页面上不展现)
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 渠道名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 类型可以通过koubei.advert.data.conf.query查询
OFFLINE：线下推广
	 */
	@ApiField("type")
	private String type;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
