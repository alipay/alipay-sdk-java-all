package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ChannelList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.channel.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-10 11:10:37
 */
public class AnttechOceanbaseChannelListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7666342928358467165L;

	/** 
	 * 渠道列表
	 */
	@ApiListField("channels")
	@ApiField("channel_list")
	private List<ChannelList> channels;

	/** 
	 * 当前页
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setChannels(List<ChannelList> channels) {
		this.channels = channels;
	}
	public List<ChannelList> getChannels( ) {
		return this.channels;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
