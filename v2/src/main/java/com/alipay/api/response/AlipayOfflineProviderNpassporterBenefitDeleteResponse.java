package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npassporter.benefit.delete response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-20 10:17:41
 */
public class AlipayOfflineProviderNpassporterBenefitDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 3196584715789428988L;

	/** 
	 * null
	 */
	@ApiListField("open_id_list")
	@ApiField("string")
	private List<String> openIdList;

	/** 
	 * null
	 */
	@ApiListField("uid_list")
	@ApiField("string")
	private List<String> uidList;

	public void setOpenIdList(List<String> openIdList) {
		this.openIdList = openIdList;
	}
	public List<String> getOpenIdList( ) {
		return this.openIdList;
	}

	public void setUidList(List<String> uidList) {
		this.uidList = uidList;
	}
	public List<String> getUidList( ) {
		return this.uidList;
	}

}
