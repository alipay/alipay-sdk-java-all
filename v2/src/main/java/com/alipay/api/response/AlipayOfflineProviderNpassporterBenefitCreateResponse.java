package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npassporter.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-20 21:22:42
 */
public class AlipayOfflineProviderNpassporterBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4667198696852731626L;

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
