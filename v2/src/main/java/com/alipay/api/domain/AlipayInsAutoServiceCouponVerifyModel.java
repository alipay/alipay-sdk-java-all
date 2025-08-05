package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁车险服务核销
 *
 * @author auto create
 * @since 1.0, 2022-12-16 15:31:41
 */
public class AlipayInsAutoServiceCouponVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 4529258637385348139L;

	/**
	 * 业务扩展数据,根据核销服务类型不同，业务相关扩展数据以json格式返回,蚂蚁根据json格式解析。
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 蚂蚁内部券码ID,蚂蚁内部发送券时同步给服务商的唯一券码,服务商需要将蚂蚁内部券码和服务商自己的券码进行映射,引导核销阶段蚂蚁会将蚂蚁的这个券码传给服务商，服务商根据映射关系找到自己的券码进行核销,核销时需要将蚂蚁的券码也返回给蚂蚁。
	 */
	@ApiField("coupon_id")
	private String couponId;

	/**
	 * 核销事件类型,枚举包含如下三种值(00: 预约 01: 取消预约  10: 核销 )
用于用户线下预约，取消预约，核销服务时服务商将对应的动作同步给蚂蚁，方便在卡券中展示。
	 */
	@ApiField("event")
	private String event;

	/**
	 * 核销业务时间,服务核销的真正时间, 格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("event_date")
	private String eventDate;

	/**
	 * 外部业务单号,唯一,券核销时的服务商的外部业务单号,幂等字段用于控制幂等。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 服务商券码ID, 服务商在核销用户的券码时候的唯一标识，该券码会和蚂蚁内部的券码有一一映射关系。
	 */
	@ApiField("sp_coupon_id")
	private String spCouponId;

	/**
	 * 蚂蚁会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getCouponId() {
		return this.couponId;
	}
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventDate() {
		return this.eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSpCouponId() {
		return this.spCouponId;
	}
	public void setSpCouponId(String spCouponId) {
		this.spCouponId = spCouponId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
