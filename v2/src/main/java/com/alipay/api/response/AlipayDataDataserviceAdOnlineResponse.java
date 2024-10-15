package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.online response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:49
 */
public class AlipayDataDataserviceAdOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 2793839758921168814L;

	/** 
	 * 操作成功外部ID列表
	 */
	@ApiListField("success_id_list")
	@ApiField("string")
	private List<String> successIdList;

	public void setSuccessIdList(List<String> successIdList) {
		this.successIdList = successIdList;
	}
	public List<String> getSuccessIdList( ) {
		return this.successIdList;
	}

}
