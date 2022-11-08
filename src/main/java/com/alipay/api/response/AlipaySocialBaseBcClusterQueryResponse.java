package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BcGroupClusterDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.bc.cluster.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-20 19:29:06
 */
public class AlipaySocialBaseBcClusterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2146611157872162796L;

	/** 
	 * 分组数据详情
	 */
	@ApiListField("cluster_details")
	@ApiField("bc_group_cluster_detail")
	private List<BcGroupClusterDetail> clusterDetails;

	public void setClusterDetails(List<BcGroupClusterDetail> clusterDetails) {
		this.clusterDetails = clusterDetails;
	}
	public List<BcGroupClusterDetail> getClusterDetails( ) {
		return this.clusterDetails;
	}

}
