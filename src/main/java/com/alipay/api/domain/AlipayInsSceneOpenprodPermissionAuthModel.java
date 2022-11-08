package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户授权接口
 *
 * @author auto create
 * @since 1.0, 2022-08-29 16:24:24
 */
public class AlipayInsSceneOpenprodPermissionAuthModel extends AlipayObject {

	private static final long serialVersionUID = 3347914432286281159L;

	/**
	 * 授权类型:PURCHASE_MODULE(订购组件token),INSURE_MODULE(投保组件token),(POLICY_DETAIL)保单详情页token
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 买家
	 */
	@ApiField("buyer")
	private EcomBuyerDTO buyer;

	/**
	 * 商品:订购组件token / 投保组件token必传
	 */
	@ApiField("item")
	private EcomItemDTO item;

	/**
	 * 登录用户id
	 */
	@ApiField("login_user_id")
	private String loginUserId;

	/**
	 * session过期时间
	 */
	@ApiField("out_session_expiration")
	private String outSessionExpiration;

	/**
	 * sessionId
	 */
	@ApiField("out_session_id")
	private Date outSessionId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 卖家
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public EcomBuyerDTO getBuyer() {
		return this.buyer;
	}
	public void setBuyer(EcomBuyerDTO buyer) {
		this.buyer = buyer;
	}

	public EcomItemDTO getItem() {
		return this.item;
	}
	public void setItem(EcomItemDTO item) {
		this.item = item;
	}

	public String getLoginUserId() {
		return this.loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getOutSessionExpiration() {
		return this.outSessionExpiration;
	}
	public void setOutSessionExpiration(String outSessionExpiration) {
		this.outSessionExpiration = outSessionExpiration;
	}

	public Date getOutSessionId() {
		return this.outSessionId;
	}
	public void setOutSessionId(Date outSessionId) {
		this.outSessionId = outSessionId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

}
