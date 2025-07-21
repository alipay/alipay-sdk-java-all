package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.userinfo.expo.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-07-18 14:57:34
 */
public class AlipayOfflineProviderUserinfoExpoCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8588622355455738845L;

	/** 
	 * 入库成功的核验用户ID
	 */
	@ApiListField("vid_list")
	@ApiField("string")
	private List<String> vidList;

	public void setVidList(List<String> vidList) {
		this.vidList = vidList;
	}
	public List<String> getVidList( ) {
		return this.vidList;
	}

}
