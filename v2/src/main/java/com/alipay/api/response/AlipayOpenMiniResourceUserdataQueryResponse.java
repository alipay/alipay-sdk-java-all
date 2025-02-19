package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourceUserDataVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.resource.userdata.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:02
 */
public class AlipayOpenMiniResourceUserdataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3861915148283847625L;

	/** 
	 * 流量位用户数据列表
	 */
	@ApiListField("user_data_list")
	@ApiField("resource_user_data_v_o")
	private List<ResourceUserDataVO> userDataList;

	public void setUserDataList(List<ResourceUserDataVO> userDataList) {
		this.userDataList = userDataList;
	}
	public List<ResourceUserDataVO> getUserDataList( ) {
		return this.userDataList;
	}

}
