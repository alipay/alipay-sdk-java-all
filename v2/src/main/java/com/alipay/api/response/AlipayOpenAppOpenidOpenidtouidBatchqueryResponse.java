package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenIdValue;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openid.openidtouid.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-28 11:26:56
 */
public class AlipayOpenAppOpenidOpenidtouidBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6684211111827949994L;

	/** 
	 * 不合法的openid列表
	 */
	@ApiListField("illegal_open_id_list")
	@ApiField("string")
	private List<String> illegalOpenIdList;

	/** 
	 * 查询转换后的uid、openid列表
	 */
	@ApiListField("uid_list")
	@ApiField("open_id_value")
	private List<OpenIdValue> uidList;

	public void setIllegalOpenIdList(List<String> illegalOpenIdList) {
		this.illegalOpenIdList = illegalOpenIdList;
	}
	public List<String> getIllegalOpenIdList( ) {
		return this.illegalOpenIdList;
	}

	public void setUidList(List<OpenIdValue> uidList) {
		this.uidList = uidList;
	}
	public List<OpenIdValue> getUidList( ) {
		return this.uidList;
	}

}
