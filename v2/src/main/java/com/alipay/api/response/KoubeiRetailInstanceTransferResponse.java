package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.retail.instance.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 19:48:58
 */
public class KoubeiRetailInstanceTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 3378668268671478973L;

	/** 
	 * 请求的id信息
	 */
	@ApiListField("instance_id_list")
	@ApiField("string")
	private List<String> instanceIdList;

	public void setInstanceIdList(List<String> instanceIdList) {
		this.instanceIdList = instanceIdList;
	}
	public List<String> getInstanceIdList( ) {
		return this.instanceIdList;
	}

}
