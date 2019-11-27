package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑客渠道删除接口
 *
 * @author auto create
 * @since 1.0, 2017-04-17 10:28:53
 */
public class KoubeiAdvertCommissionChannelDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2748577424281562831L;

	/**
	 * 需要删除的渠道ID列表
渠道ID为koubei.advert.commission.channel.create中返回的ID；
无错误码就是删除成功；
如果渠道不存在或者已经删除，也不会返回报错；同时列表中可以删除的进行删除处理
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
