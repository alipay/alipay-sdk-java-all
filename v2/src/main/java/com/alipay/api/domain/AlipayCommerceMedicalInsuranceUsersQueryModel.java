package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户医疗消息查询
 *
 * @author auto create
 * @since 1.0, 2025-08-25 09:19:51
 */
public class AlipayCommerceMedicalInsuranceUsersQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7176998143427466869L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 查询token
	 */
	@ApiField("query_token")
	private String queryToken;

	/**
	 * 关系类型
	 */
	@ApiField("relation_type")
	private String relationType;

	/**
	 * 用户ID
	 */
	@ApiField("uid")
	private String uid;

	/**
	 * 用户token
	 */
	@ApiField("user_token")
	private String userToken;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQueryToken() {
		return this.queryToken;
	}
	public void setQueryToken(String queryToken) {
		this.queryToken = queryToken;
	}

	public String getRelationType() {
		return this.relationType;
	}
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
