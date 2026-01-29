package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫APP低纹词搜索接口
 *
 * @author auto create
 * @since 1.0, 2025-12-01 15:47:09
 */
public class AlipayCommerceMedicalPatternWordsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5796794111924864637L;

	/**
	 * 账号
	 */
	@ApiField("account")
	private String account;

	/**
	 * 用户类型：0/1:支付宝/好大夫
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 渠道编码
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 参数信息
	 */
	@ApiField("parameter_info")
	private String parameterInfo;

	/**
	 * 场景编码
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getParameterInfo() {
		return this.parameterInfo;
	}
	public void setParameterInfo(String parameterInfo) {
		this.parameterInfo = parameterInfo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
