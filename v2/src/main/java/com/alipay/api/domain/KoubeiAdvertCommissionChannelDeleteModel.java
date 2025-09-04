package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑客渠道删除接口
 *
 * @author auto create
 * @since 1.0, 2017-03-03 10:41:04
 */
public class KoubeiAdvertCommissionChannelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7426553865894896551L;

	/**
	 * 需要删除的渠道ID列表
	 */
	@ApiListField("channel_ids")
	@ApiField("string")
	private List<String> channelIds;

	public List<String> getChannelIds() {
		return this.channelIds;
	}
	public void setChannelIds(List<String> channelIds) {
		this.channelIds = channelIds;
	}

}
