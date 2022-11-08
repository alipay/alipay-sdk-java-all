package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 玩一玩游戏中心平台存量数据同步接口
 *
 * @author auto create
 * @since 1.0, 2022-09-22 19:13:14
 */
public class AlipayUserGamecenterHistorygameactionSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 1378355957841535343L;

	/**
	 * 在第三方游戏中，用户在游戏中的行动编码。
	 */
	@ApiField("action_code")
	private String actionCode;

	/**
	 * 在第三方游戏中，用户完成行动的渠道。如果是从玩一玩游戏中心跳转到游戏完成，填写gamecenter。如果是其他渠道跳转到游戏内完成，填写other
	 */
	@ApiField("action_finish_channel")
	private String actionFinishChannel;

	/**
	 * 在第三方游戏中，用户在游戏中完成该行动的时间。
	 */
	@ApiField("action_finish_date")
	private Date actionFinishDate;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 数据的全局唯一标识。用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getActionCode() {
		return this.actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}

	public String getActionFinishChannel() {
		return this.actionFinishChannel;
	}
	public void setActionFinishChannel(String actionFinishChannel) {
		this.actionFinishChannel = actionFinishChannel;
	}

	public Date getActionFinishDate() {
		return this.actionFinishDate;
	}
	public void setActionFinishDate(Date actionFinishDate) {
		this.actionFinishDate = actionFinishDate;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
