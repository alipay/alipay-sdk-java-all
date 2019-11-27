package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.crowd.data.profile response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayDataDataserviceCrowdDataProfileResponse extends AlipayResponse {

	private static final long serialVersionUID = 2389686756448492571L;

	/** 
	 * 人群画像统计结果
	 */
	@ApiListField("profiles")
	@ApiField("string")
	private List<String> profiles;

	public void setProfiles(List<String> profiles) {
		this.profiles = profiles;
	}
	public List<String> getProfiles( ) {
		return this.profiles;
	}

}
