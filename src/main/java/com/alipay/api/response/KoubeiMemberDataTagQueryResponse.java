package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.member.data.tag.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMemberDataTagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3452394499826113943L;

	/** 
	 * 是否是会员
	 */
	@ApiField("card_member")
	private Boolean cardMember;

	/** 
	 * 类目标签
	 */
	@ApiField("cate_prefer_label")
	private String catePreferLabel;

	/** 
	 * 潮标签
	 */
	@ApiField("fashion_label")
	private String fashionLabel;

	/** 
	 * 口味标签
	 */
	@ApiField("taste_prefer_label")
	private String tastePreferLabel;

	/** 
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setCardMember(Boolean cardMember) {
		this.cardMember = cardMember;
	}
	public Boolean getCardMember( ) {
		return this.cardMember;
	}

	public void setCatePreferLabel(String catePreferLabel) {
		this.catePreferLabel = catePreferLabel;
	}
	public String getCatePreferLabel( ) {
		return this.catePreferLabel;
	}

	public void setFashionLabel(String fashionLabel) {
		this.fashionLabel = fashionLabel;
	}
	public String getFashionLabel( ) {
		return this.fashionLabel;
	}

	public void setTastePreferLabel(String tastePreferLabel) {
		this.tastePreferLabel = tastePreferLabel;
	}
	public String getTastePreferLabel( ) {
		return this.tastePreferLabel;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
