package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeliveryChannelInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.deliverychannel.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-04-20 15:01:51
 */
public class AlipayMarketingActivityDeliverychannelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7399274824285948725L;

	/** 
	 * 可投放的渠道信息列表。
用于表达当前可以投放的渠道列表信息
	 */
	@ApiListField("delivery_channel_info_list")
	@ApiField("delivery_channel_info")
	private List<DeliveryChannelInfo> deliveryChannelInfoList;

	/** 
	 * 查询的页码。 特别说明： 页码从1开始。
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 每页查询个数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 可返回的渠道总数
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setDeliveryChannelInfoList(List<DeliveryChannelInfo> deliveryChannelInfoList) {
		this.deliveryChannelInfoList = deliveryChannelInfoList;
	}
	public List<DeliveryChannelInfo> getDeliveryChannelInfoList( ) {
		return this.deliveryChannelInfoList;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
