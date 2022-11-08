package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 更新第三方权益
 *
 * @author auto create
 * @since 1.0, 2022-03-21 16:27:33
 */
public class AntfortuneMarketingEquitystatusThirdpartModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3432594171915433223L;

	/**
	 * 第三方权益码
	 */
	@ApiField("equity_code")
	private String equityCode;

	/**
	 * 第三方权益信息
	 */
	@ApiField("equity_info")
	private FinEquityInfo equityInfo;

	/**
	 * 外部业务号，每个用户每次领取动作会生成的唯一发放号，商户可用该字段做幂等标识
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 来源，每个接入的第三方都会有一个来源号
	 */
	@ApiField("source")
	private String source;

	/**
	 * 状态：USED-已使用；EXPIRED-过期；REFUND-退单；INVALID-不可用；
	 */
	@ApiField("status")
	private String status;

	/**
	 * 权益更新的时间
	 */
	@ApiField("update_time")
	private Date updateTime;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_info")
	private FinUserInfo userInfo;

	public String getEquityCode() {
		return this.equityCode;
	}
	public void setEquityCode(String equityCode) {
		this.equityCode = equityCode;
	}

	public FinEquityInfo getEquityInfo() {
		return this.equityInfo;
	}
	public void setEquityInfo(FinEquityInfo equityInfo) {
		this.equityInfo = equityInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public FinUserInfo getUserInfo() {
		return this.userInfo;
	}
	public void setUserInfo(FinUserInfo userInfo) {
		this.userInfo = userInfo;
	}

}
