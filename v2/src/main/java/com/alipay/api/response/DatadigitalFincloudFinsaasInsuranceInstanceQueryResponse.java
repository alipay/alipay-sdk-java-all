package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InstanceVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.insurance.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-29 15:13:02
 */
public class DatadigitalFincloudFinsaasInsuranceInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4597749235265939474L;

	/** 
	 * 实例列表
	 */
	@ApiListField("instance_list")
	@ApiField("instance_v_o")
	private List<InstanceVO> instanceList;

	/** 
	 * 记录总数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setInstanceList(List<InstanceVO> instanceList) {
		this.instanceList = instanceList;
	}
	public List<InstanceVO> getInstanceList( ) {
		return this.instanceList;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
