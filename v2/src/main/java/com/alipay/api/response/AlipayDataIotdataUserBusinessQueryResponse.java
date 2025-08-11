package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UserBusiness;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.user.business.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-29 15:07:29
 */
public class AlipayDataIotdataUserBusinessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5718794671832432933L;

	/** 
	 * 用户管理的业务列表
	 */
	@ApiListField("data")
	@ApiField("user_business")
	private List<UserBusiness> data;

	public void setData(List<UserBusiness> data) {
		this.data = data;
	}
	public List<UserBusiness> getData( ) {
		return this.data;
	}

}
