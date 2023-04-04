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
 * @since 1.0, 2023-04-03 01:20:17
 */
public class AlipayOpenMiniInnerMembersQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5672752545448719665L;

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
