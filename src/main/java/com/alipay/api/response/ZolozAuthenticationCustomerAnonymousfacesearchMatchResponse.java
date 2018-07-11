package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FaceSearchAnonymousUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.anonymousfacesearch.match response.
 * 
 * @author auto create
 * @since 1.0, 2018-03-07 11:50:17
 */
public class ZolozAuthenticationCustomerAnonymousfacesearchMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 7782678518678184343L;

	/** 
	 * 返回账户信息:merchantid/merchantuid
	 */
	@ApiListField("userinfolist")
	@ApiField("face_search_anonymous_user_info")
	private List<FaceSearchAnonymousUserInfo> userinfolist;

	public void setUserinfolist(List<FaceSearchAnonymousUserInfo> userinfolist) {
		this.userinfolist = userinfolist;
	}
	public List<FaceSearchAnonymousUserInfo> getUserinfolist( ) {
		return this.userinfolist;
	}

}
