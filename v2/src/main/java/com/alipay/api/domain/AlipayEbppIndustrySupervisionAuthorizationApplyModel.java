package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 授权签约类申请接口
 *
 * @author auto create
 * @since 1.0, 2025-08-18 15:40:06
 */
public class AlipayEbppIndustrySupervisionAuthorizationApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7191478436816866419L;

	/**
	 * 需要在尾部添加时间戳，格式为yyyyMMdd
	 */
	@ApiField("apply_request_no")
	private String applyRequestNo;

	/**
	 * 用户签署协议列表
	 */
	@ApiListField("authorization_list")
	@ApiField("string")
	private List<String> authorizationList;

	/**
	 * 不同的业务场景下对应不同的业务规则
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 签约协议授权方支付宝openid
	 */
	@ApiField("merchant_alipay_open_id")
	private String merchantAlipayOpenId;

	/**
	 * 签约协议授权方支付宝uid
	 */
	@ApiField("merchant_alipay_uid")
	private String merchantAlipayUid;

	/**
	 * 协会、商户在银行侧自行创建的结算户账户户号
	 */
	@ApiField("parent_ext_account_no")
	private String parentExtAccountNo;

	public String getApplyRequestNo() {
		return this.applyRequestNo;
	}
	public void setApplyRequestNo(String applyRequestNo) {
		this.applyRequestNo = applyRequestNo;
	}

	public List<String> getAuthorizationList() {
		return this.authorizationList;
	}
	public void setAuthorizationList(List<String> authorizationList) {
		this.authorizationList = authorizationList;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getMerchantAlipayOpenId() {
		return this.merchantAlipayOpenId;
	}
	public void setMerchantAlipayOpenId(String merchantAlipayOpenId) {
		this.merchantAlipayOpenId = merchantAlipayOpenId;
	}

	public String getMerchantAlipayUid() {
		return this.merchantAlipayUid;
	}
	public void setMerchantAlipayUid(String merchantAlipayUid) {
		this.merchantAlipayUid = merchantAlipayUid;
	}

	public String getParentExtAccountNo() {
		return this.parentExtAccountNo;
	}
	public void setParentExtAccountNo(String parentExtAccountNo) {
		this.parentExtAccountNo = parentExtAccountNo;
	}

}
