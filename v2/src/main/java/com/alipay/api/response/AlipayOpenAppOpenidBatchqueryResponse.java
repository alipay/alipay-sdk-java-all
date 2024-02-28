package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenIdValue;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openid.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-28 11:41:54
 */
public class AlipayOpenAppOpenidBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7898636594157278888L;

	/** 
	 * 非法的用户userid参数，涉及两种情况：
1. 不是有效的用户userid
2. 入参用户userid不在本工单审核的数据范围内，不支持查询
	 */
	@ApiListField("illegal_user_id_list")
	@ApiField("string")
	private List<String> illegalUserIdList;

	/** 
	 * 用户openid列表，每个元素包含用户的userId、openId和unionId，unionId可为空
	 */
	@ApiListField("open_id_list")
	@ApiField("open_id_value")
	private List<OpenIdValue> openIdList;

	public void setIllegalUserIdList(List<String> illegalUserIdList) {
		this.illegalUserIdList = illegalUserIdList;
	}
	public List<String> getIllegalUserIdList( ) {
		return this.illegalUserIdList;
	}

	public void setOpenIdList(List<OpenIdValue> openIdList) {
		this.openIdList = openIdList;
	}
	public List<OpenIdValue> getOpenIdList( ) {
		return this.openIdList;
	}

}
