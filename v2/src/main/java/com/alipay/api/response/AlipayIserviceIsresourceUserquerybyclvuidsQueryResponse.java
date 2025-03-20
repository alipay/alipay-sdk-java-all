package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenApiUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.isresource.userquerybyclvuids.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:30
 */
public class AlipayIserviceIsresourceUserquerybyclvuidsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7718739673734546966L;

	/** 
	 * 相关用户信息
	 */
	@ApiListField("biz_data")
	@ApiField("open_api_user_info")
	private List<OpenApiUserInfo> bizData;

	public void setBizData(List<OpenApiUserInfo> bizData) {
		this.bizData = bizData;
	}
	public List<OpenApiUserInfo> getBizData( ) {
		return this.bizData;
	}

}
