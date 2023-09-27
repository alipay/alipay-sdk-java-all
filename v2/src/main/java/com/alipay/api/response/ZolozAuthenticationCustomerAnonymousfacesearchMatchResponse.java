package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FaceSearchUserInfo;
import com.alipay.api.domain.FaceSearchAnonymousUserInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zoloz.authentication.customer.anonymousfacesearch.match response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 00:36:17
 */
public class ZolozAuthenticationCustomerAnonymousfacesearchMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 6498918437775734871L;

	/** 
	 * 搜索到的人脸候选集
	 */
	@ApiListField("candidatelist")
	@ApiField("face_search_user_info")
	private List<FaceSearchUserInfo> candidatelist;

	/** 
	 * 人脸搜索找到的用户
	 */
	@ApiField("foundface")
	private FaceSearchUserInfo foundface;

	/** 
	 * 返回详细码
	 */
	@ApiField("retcodesub")
	private String retcodesub;

	/** 
	 * 操作成功
	 */
	@ApiField("retmessagesub")
	private String retmessagesub;

	/** 
	 * 返回账户信息:merchantid/merchantuid
	 */
	@ApiListField("userinfolist")
	@ApiField("face_search_anonymous_user_info")
	private List<FaceSearchAnonymousUserInfo> userinfolist;

	public void setCandidatelist(List<FaceSearchUserInfo> candidatelist) {
		this.candidatelist = candidatelist;
	}
	public List<FaceSearchUserInfo> getCandidatelist( ) {
		return this.candidatelist;
	}

	public void setFoundface(FaceSearchUserInfo foundface) {
		this.foundface = foundface;
	}
	public FaceSearchUserInfo getFoundface( ) {
		return this.foundface;
	}

	public void setRetcodesub(String retcodesub) {
		this.retcodesub = retcodesub;
	}
	public String getRetcodesub( ) {
		return this.retcodesub;
	}

	public void setRetmessagesub(String retmessagesub) {
		this.retmessagesub = retmessagesub;
	}
	public String getRetmessagesub( ) {
		return this.retmessagesub;
	}

	public void setUserinfolist(List<FaceSearchAnonymousUserInfo> userinfolist) {
		this.userinfolist = userinfolist;
	}
	public List<FaceSearchAnonymousUserInfo> getUserinfolist( ) {
		return this.userinfolist;
	}

}
