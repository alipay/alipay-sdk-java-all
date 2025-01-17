package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 权益流水信息
 *
 * @author auto create
 * @since 1.0, 2024-08-02 10:17:52
 */
public class BenefitOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 6575644896247116278L;

	/**
	 * 流水结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 流水业务单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 外部业务类型，非固定值，由业务运营自定义
	 */
	@ApiField("out_biz_type")
	private String outBizType;

	/**
	 * 奖品信息
	 */
	@ApiField("reward_info")
	private BenefitRewardInfo rewardInfo;

	/**
	 * 权益单列表
	 */
	@ApiListField("right_order_info_list")
	@ApiField("benefit_right_order_info")
	private List<BenefitRightOrderInfo> rightOrderInfoList;

	/**
	 * 权益业务场景码，非固定值，由业务运营定义
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 流水开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 权益流水业务状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 权益业务子场景码，非固定值，由业务运营定义
	 */
	@ApiField("sub_scene_code")
	private String subSceneCode;

	/**
	 * 权益模板编码，非固定值，由业务运营定义配置
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getOutBizType() {
		return this.outBizType;
	}
	public void setOutBizType(String outBizType) {
		this.outBizType = outBizType;
	}

	public BenefitRewardInfo getRewardInfo() {
		return this.rewardInfo;
	}
	public void setRewardInfo(BenefitRewardInfo rewardInfo) {
		this.rewardInfo = rewardInfo;
	}

	public List<BenefitRightOrderInfo> getRightOrderInfoList() {
		return this.rightOrderInfoList;
	}
	public void setRightOrderInfoList(List<BenefitRightOrderInfo> rightOrderInfoList) {
		this.rightOrderInfoList = rightOrderInfoList;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubSceneCode() {
		return this.subSceneCode;
	}
	public void setSubSceneCode(String subSceneCode) {
		this.subSceneCode = subSceneCode;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
