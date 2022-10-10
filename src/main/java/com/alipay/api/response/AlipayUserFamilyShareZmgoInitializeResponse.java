package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.family.share.zmgo.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2021-01-20 11:01:21
 */
public class AlipayUserFamilyShareZmgoInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 4847216744295117535L;

	/** 
	 * 共享组件链接
	 */
	@ApiField("family_sharing_link")
	private String familySharingLink;

	/** 
	 * 是否已经存在共享关系
	 */
	@ApiField("has_sharing")
	private Boolean hasSharing;

	/** 
	 * 是否可共享
	 */
	@ApiField("shareable")
	private Boolean shareable;

	public void setFamilySharingLink(String familySharingLink) {
		this.familySharingLink = familySharingLink;
	}
	public String getFamilySharingLink( ) {
		return this.familySharingLink;
	}

	public void setHasSharing(Boolean hasSharing) {
		this.hasSharing = hasSharing;
	}
	public Boolean getHasSharing( ) {
		return this.hasSharing;
	}

	public void setShareable(Boolean shareable) {
		this.shareable = shareable;
	}
	public Boolean getShareable( ) {
		return this.shareable;
	}

}
