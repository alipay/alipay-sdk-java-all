package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 池融资中台统一请求发送接口
 *
 * @author auto create
 * @since 1.0, 2020-09-14 19:55:27
 */
public class AnttechBlockchainFinancePfApplySendModel extends AlipayObject {

	private static final long serialVersionUID = 4839873342612932287L;

	/**
	 * 融资支用申请业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 资金渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 支用申请标识
	 */
	@ApiField("financing_id")
	private String financingId;

	/**
	 * 个性化参数
	 */
	@ApiField("parm")
	private String parm;

	/**
	 * 平台标识
	 */
	@ApiField("platform_id")
	private String platformId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getFinancingId() {
		return this.financingId;
	}
	public void setFinancingId(String financingId) {
		this.financingId = financingId;
	}

	public String getParm() {
		return this.parm;
	}
	public void setParm(String parm) {
		this.parm = parm;
	}

	public String getPlatformId() {
		return this.platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}

}
