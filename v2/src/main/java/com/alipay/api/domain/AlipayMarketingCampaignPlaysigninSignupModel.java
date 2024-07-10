package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 签到报名
 *
 * @author auto create
 * @since 1.0, 2023-10-14 16:37:53
 */
public class AlipayMarketingCampaignPlaysigninSignupModel extends AlipayObject {

	private static final long serialVersionUID = 5668711139137589261L;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 参数名：外部业务单号 应用场景：与支付宝的一个业务单号进行绑定，后续可以通过该业务单号进行查询 如何获取：接口使用方自行生成，为了数据查询的准确性，应该确保该单号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 签到玩法ID
	 */
	@ApiField("signin_play_id")
	private String signinPlayId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSigninPlayId() {
		return this.signinPlayId;
	}
	public void setSigninPlayId(String signinPlayId) {
		this.signinPlayId = signinPlayId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
