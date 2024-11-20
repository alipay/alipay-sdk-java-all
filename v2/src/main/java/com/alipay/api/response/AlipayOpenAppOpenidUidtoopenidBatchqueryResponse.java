package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OpenIdValue;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.openid.uidtoopenid.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:36
 */
public class AlipayOpenAppOpenidUidtoopenidBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6529448196335479898L;

	/** 
	 * 用户OpenID列表，每个元素包含用户的userId、openId和unionId，unionId可为空
	 */
	@ApiListField("open_id_list")
	@ApiField("open_id_value")
	private List<OpenIdValue> openIdList;

	public void setOpenIdList(List<OpenIdValue> openIdList) {
		this.openIdList = openIdList;
	}
	public List<OpenIdValue> getOpenIdList( ) {
		return this.openIdList;
	}

}
