package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险营销权益触发操作接口
 *
 * @author auto create
 * @since 1.0, 2026-09-23 10:12:51
 */
public class AlipayInsMarketingInscouponTriggerModel extends AlipayObject {

	private static final long serialVersionUID = 5278272444819738964L;

	/**
	 * null
	 */
	@ApiListField("ext_params")
	@ApiField("key_value_d_t_o")
	private List<KeyValueDTO> extParams;

	/**
	 * 权益实例
	 */
	@ApiField("ins_coupon")
	private InsCouponInfo insCoupon;

	/**
	 * 开发平台用户的唯一标识符
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务单号，业务逻辑中的幂等单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 触发时间
	 */
	@ApiField("trigger_time")
	private Date triggerTime;

	/**
	 * 触发类型
	 */
	@ApiField("trigger_type")
	private String triggerType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<KeyValueDTO> getExtParams() {
		return this.extParams;
	}
	public void setExtParams(List<KeyValueDTO> extParams) {
		this.extParams = extParams;
	}

	public InsCouponInfo getInsCoupon() {
		return this.insCoupon;
	}
	public void setInsCoupon(InsCouponInfo insCoupon) {
		this.insCoupon = insCoupon;
	}

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

	public Date getTriggerTime() {
		return this.triggerTime;
	}
	public void setTriggerTime(Date triggerTime) {
		this.triggerTime = triggerTime;
	}

	public String getTriggerType() {
		return this.triggerType;
	}
	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
