package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 被邀请者淘宝端转化同步
 *
 * @author auto create
 * @since 1.0, 2022-06-10 13:30:39
 */
public class AlipayUserAccountInvitedConvertSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8366394668152532547L;

	/**
	 * 转化标签
	 */
	@ApiField("convert_tag")
	private String convertTag;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户转换同步场景
	 */
	@ApiField("scene_type")
	private String sceneType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 支付宝userid加密后token
	 */
	@ApiField("user_token")
	private String userToken;

	public String getConvertTag() {
		return this.convertTag;
	}
	public void setConvertTag(String convertTag) {
		this.convertTag = convertTag;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSceneType() {
		return this.sceneType;
	}
	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserToken() {
		return this.userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}

}
