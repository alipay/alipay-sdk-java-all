package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.userid.bymobile.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:54
 */
public class AlipayUserUseridBymobileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8878477335618681392L;

	/** 
	 * 绑定手机号对应的支付宝userId列表【注意：最多返回10个】
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	public List<String> getUserIdList( ) {
		return this.userIdList;
	}

}
