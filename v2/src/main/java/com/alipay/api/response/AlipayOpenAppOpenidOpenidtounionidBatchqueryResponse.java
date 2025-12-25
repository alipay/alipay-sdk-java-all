package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenValue;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openid.openidtounionid.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-09-08 10:23:21
 */
public class AlipayOpenAppOpenidOpenidtounionidBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6237583711523815877L;

	/** 
	 * 不合法的openid列表
	 */
	@ApiListField("illegal_open_id_list")
	@ApiField("string")
	private List<String> illegalOpenIdList;

	/** 
	 * 查询转换后的unionid、openid列表
	 */
	@ApiListField("unionid_list")
	@ApiField("open_value")
	private List<OpenValue> unionidList;

	public void setIllegalOpenIdList(List<String> illegalOpenIdList) {
		this.illegalOpenIdList = illegalOpenIdList;
	}
	public List<String> getIllegalOpenIdList( ) {
		return this.illegalOpenIdList;
	}

	public void setUnionidList(List<OpenValue> unionidList) {
		this.unionidList = unionidList;
	}
	public List<OpenValue> getUnionidList( ) {
		return this.unionidList;
	}

}
