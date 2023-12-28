package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstanceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-24 22:53:05
 */
public class KoubeiRetailInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8353142883986282372L;

	/** 
	 * 商户维度券或者DM信息列表
	 */
	@ApiListField("instance_list")
	@ApiField("instance_info")
	private List<InstanceInfo> instanceList;

	/** 
	 * 返回的总记录数
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setInstanceList(List<InstanceInfo> instanceList) {
		this.instanceList = instanceList;
	}
	public List<InstanceInfo> getInstanceList( ) {
		return this.instanceList;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
