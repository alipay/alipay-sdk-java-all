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
 * @since 1.0, 2025-08-13 14:52:44
 */
public class AlipayDataIotdataUserBusinessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7224648543598292248L;

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
