package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道扩展信息
 *
 * @author auto create
 * @since 1.0, 2023-08-15 10:23:23
 */
public class ChannelDetailParams extends AlipayObject {

	private static final long serialVersionUID = 2251894913852729494L;

	/**
	 * 预付卡分组名称
	 */
	@ApiField("card_group_name")
	private String cardGroupName;

	public String getCardGroupName() {
		return this.cardGroupName;
	}
	public void setCardGroupName(String cardGroupName) {
		this.cardGroupName = cardGroupName;
	}

}
