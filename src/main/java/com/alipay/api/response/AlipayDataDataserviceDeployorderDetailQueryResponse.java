package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DxDeployOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.deployorder.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceDeployorderDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7424623548157696272L;

	/** 
	 * 部署单列表
	 */
	@ApiListField("deploy_order_list")
	@ApiField("dx_deploy_order_info")
	private List<DxDeployOrderInfo> deployOrderList;

	public void setDeployOrderList(List<DxDeployOrderInfo> deployOrderList) {
		this.deployOrderList = deployOrderList;
	}
	public List<DxDeployOrderInfo> getDeployOrderList( ) {
		return this.deployOrderList;
	}

}
