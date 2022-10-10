package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.userbalance.offline response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-01 10:53:40
 */
public class AlipayDataDataserviceAdUserbalanceOfflineResponse extends AlipayResponse {

	private static final long serialVersionUID = 2653971168385378245L;

	/** 
	 * 操作成功投放账户id列表
	 */
	@ApiListField("success_user_id_list")
	@ApiField("string")
	private List<String> successUserIdList;

	public void setSuccessUserIdList(List<String> successUserIdList) {
		this.successUserIdList = successUserIdList;
	}
	public List<String> getSuccessUserIdList( ) {
		return this.successUserIdList;
	}

}
