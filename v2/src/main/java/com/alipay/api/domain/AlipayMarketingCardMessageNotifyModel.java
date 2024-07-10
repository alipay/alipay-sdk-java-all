package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员积分过期提醒
 *
 * @author auto create
 * @since 1.0, 2024-04-10 16:32:30
 */
public class AlipayMarketingCardMessageNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 3459848969511794898L;

	/**
	 * 消息通知详情，包含消息通知需要的信息，map 格式存储。
积分过期提醒：
<br>expired_point 过期积分值
<br>expired_time 过期时间
	 */
	@ApiField("notify_info")
	private String notifyInfo;

	/**
	 * 消息通知幂等标识，业务流水号
	 */
	@ApiField("notify_no")
	private String notifyNo;

	/**
	 * 消息通知类型,
<br>POINT_REMIND 积分过期提醒
	 */
	@ApiField("notify_type")
	private String notifyType;

	/**
	 * 标识业务发生时间，时间格式为"yyyy-MM-dd HH:mm:ss"。
	 */
	@ApiField("occur_time")
	private Date occurTime;

	/**
	 * 支付宝业务卡号，即通过 alipay.marketing.card.open 接口开卡后获取的 card_info.biz_card_no 值。
	 */
	@ApiField("target_card_no")
	private String targetCardNo;

	/**
	 * 卡号ID类型
	 */
	@ApiField("target_card_no_type")
	private String targetCardNoType;

	public String getNotifyInfo() {
		return this.notifyInfo;
	}
	public void setNotifyInfo(String notifyInfo) {
		this.notifyInfo = notifyInfo;
	}

	public String getNotifyNo() {
		return this.notifyNo;
	}
	public void setNotifyNo(String notifyNo) {
		this.notifyNo = notifyNo;
	}

	public String getNotifyType() {
		return this.notifyType;
	}
	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public Date getOccurTime() {
		return this.occurTime;
	}
	public void setOccurTime(Date occurTime) {
		this.occurTime = occurTime;
	}

	public String getTargetCardNo() {
		return this.targetCardNo;
	}
	public void setTargetCardNo(String targetCardNo) {
		this.targetCardNo = targetCardNo;
	}

	public String getTargetCardNoType() {
		return this.targetCardNoType;
	}
	public void setTargetCardNoType(String targetCardNoType) {
		this.targetCardNoType = targetCardNoType;
	}

}
