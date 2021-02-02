package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑客商品渠道推广汇总数据
 *
 * @author auto create
 * @since 1.0, 2017-02-16 20:40:20
 */
public class PromoteDetailChannelModel extends AlipayObject {

	private static final long serialVersionUID = 5482461739124851773L;

	/**
	 * 渠道id
	 */
	@ApiField("channel_id")
	private String channelId;

	/**
	 * 渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

	/**
	 * 查询时间段内的推广数据
	 */
	@ApiField("part_promote_data")
	private PromoteDataModel partPromoteData;

	/**
	 * 总推广数据
	 */
	@ApiField("total_promote_data")
	private PromoteDataModel totalPromoteData;

	public String getChannelId() {
		return this.channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public PromoteDataModel getPartPromoteData() {
		return this.partPromoteData;
	}
	public void setPartPromoteData(PromoteDataModel partPromoteData) {
		this.partPromoteData = partPromoteData;
	}

	public PromoteDataModel getTotalPromoteData() {
		return this.totalPromoteData;
	}
	public void setTotalPromoteData(PromoteDataModel totalPromoteData) {
		this.totalPromoteData = totalPromoteData;
	}

}
