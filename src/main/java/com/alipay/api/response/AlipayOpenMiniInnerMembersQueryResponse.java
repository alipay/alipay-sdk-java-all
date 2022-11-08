package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenAppOperatorVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.members.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-05 11:02:35
 */
public class AlipayOpenMiniInnerMembersQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8719654721622328166L;

	/** 
	 * 查询结果
	 */
	@ApiListField("open_app_operator_vo")
	@ApiField("open_app_operator_vo")
	private List<OpenAppOperatorVo> openAppOperatorVo;

	public void setOpenAppOperatorVo(List<OpenAppOperatorVo> openAppOperatorVo) {
		this.openAppOperatorVo = openAppOperatorVo;
	}
	public List<OpenAppOperatorVo> getOpenAppOperatorVo( ) {
		return this.openAppOperatorVo;
	}

}
