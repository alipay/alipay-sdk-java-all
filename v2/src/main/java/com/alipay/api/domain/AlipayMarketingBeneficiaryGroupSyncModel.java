package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消费券领奖人群同步
 *
 * @author auto create
 * @since 1.0, 2026-01-15 20:22:42
 */
public class AlipayMarketingBeneficiaryGroupSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7241737224533263167L;

	/**
	 * 为用户申请资格还是退回资格标识。
申领资格:APPLY
退回资格:EXPIRE
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 支持三种类型
1.用户手机号，固定11位
2.用户邮箱
3.支付宝账号
	 */
	@ApiField("bind_contact")
	private String bindContact;

	/**
	 * 服务商信息,可填自己的公司主体
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 传入的账号类型，支持三种:
手机号、邮箱、支付宝账号
	 */
	@ApiField("login_type")
	private String loginType;

	/**
	 * 业务幂等字段,用户标识服务商是否同一笔请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝分配的场景编码，用于识别活动场景信息,支付宝提供给服务商
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 数据源写入标识,服务方提供
	 */
	@ApiField("turing_tag")
	private String turingTag;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getBindContact() {
		return this.bindContact;
	}
	public void setBindContact(String bindContact) {
		this.bindContact = bindContact;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getLoginType() {
		return this.loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getTuringTag() {
		return this.turingTag;
	}
	public void setTuringTag(String turingTag) {
		this.turingTag = turingTag;
	}

}
