package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 阿里云订单状态变化
 *
 * @author auto create
 * @since 1.0, 2025-05-19 18:40:20
 */
public class AlipayCommerceMedicalPromoOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8443395753184271944L;

	/**
	 * LM配置商品价格时填的客户业务值（权益id），医疗用来区分代币种类
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 业务id
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * biz_no
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 订单，“分”为单位。20，代表0.2元
	 */
	@ApiField("cost_num")
	private Long costNum;

	/**
	 * 详细标识
	 */
	@ApiField("detail_flag")
	private Long detailFlag;

	/**
	 * 订单创建的时候才有值，列表长度为1
	 */
	@ApiField("item_list")
	private String itemList;

	/**
	 * 渠道信息
	 */
	@ApiField("kz_info")
	private String kzInfo;

	/**
	 * lm订单id
	 */
	@ApiField("lm_order_id")
	private String lmOrderId;

	/**
	 * 主标识
	 */
	@ApiField("main_flag")
	private Long mainFlag;

	/**
	 * 主lm订单id
	 */
	@ApiField("main_lm_order_id")
	private String mainLmOrderId;

	/**
	 * 医疗商品id
	 */
	@ApiField("med_benefit_id")
	private String medBenefitId;

	/**
	 * 变更时间
	 */
	@ApiField("modified_time")
	private Long modifiedTime;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 变化后的订单状态
	 */
	@ApiField("order_status")
	private Long orderStatus;

	/**
	 * 积分数量
	 */
	@ApiField("point_amount")
	private Long pointAmount;

	/**
	 * 变更前订单状态
	 */
	@ApiField("pre_order_status")
	private Long preOrderStatus;

	/**
	 * 请求id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 淘宝订单id
	 */
	@ApiField("tb_order_id")
	private String tbOrderId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Long getCostNum() {
		return this.costNum;
	}
	public void setCostNum(Long costNum) {
		this.costNum = costNum;
	}

	public Long getDetailFlag() {
		return this.detailFlag;
	}
	public void setDetailFlag(Long detailFlag) {
		this.detailFlag = detailFlag;
	}

	public String getItemList() {
		return this.itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}

	public String getKzInfo() {
		return this.kzInfo;
	}
	public void setKzInfo(String kzInfo) {
		this.kzInfo = kzInfo;
	}

	public String getLmOrderId() {
		return this.lmOrderId;
	}
	public void setLmOrderId(String lmOrderId) {
		this.lmOrderId = lmOrderId;
	}

	public Long getMainFlag() {
		return this.mainFlag;
	}
	public void setMainFlag(Long mainFlag) {
		this.mainFlag = mainFlag;
	}

	public String getMainLmOrderId() {
		return this.mainLmOrderId;
	}
	public void setMainLmOrderId(String mainLmOrderId) {
		this.mainLmOrderId = mainLmOrderId;
	}

	public String getMedBenefitId() {
		return this.medBenefitId;
	}
	public void setMedBenefitId(String medBenefitId) {
		this.medBenefitId = medBenefitId;
	}

	public Long getModifiedTime() {
		return this.modifiedTime;
	}
	public void setModifiedTime(Long modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(Long orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getPointAmount() {
		return this.pointAmount;
	}
	public void setPointAmount(Long pointAmount) {
		this.pointAmount = pointAmount;
	}

	public Long getPreOrderStatus() {
		return this.preOrderStatus;
	}
	public void setPreOrderStatus(Long preOrderStatus) {
		this.preOrderStatus = preOrderStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTbOrderId() {
		return this.tbOrderId;
	}
	public void setTbOrderId(String tbOrderId) {
		this.tbOrderId = tbOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
