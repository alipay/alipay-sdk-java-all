package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订购单信息
 *
 * @author auto create
 * @since 1.0, 2024-04-18 17:59:29
 */
public class CardOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 3711923488441724776L;

	/**
	 * 订购单ID
	 */
	@ApiField("card_id")
	private String cardId;

	/**
	 * 订购单状态
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * 商品ID
	 */
	@ApiField("card_template_id")
	private String cardTemplateId;

	/**
	 * 商品类型
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/**
	 * 扣款计划列表
	 */
	@ApiListField("deduction_plan_list")
	@ApiField("deduction_plan_info")
	private List<DeductionPlanInfo> deductionPlanList;

	/**
	 * 商品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 剩余期数(次数)
	 */
	@ApiField("remain_count")
	private Long remainCount;

	/**
	 * 总期数(次数)
	 */
	@ApiField("total_count")
	private Long totalCount;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardId() {
		return this.cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public Date getCreateDate() {
		return this.createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public List<DeductionPlanInfo> getDeductionPlanList() {
		return this.deductionPlanList;
	}
	public void setDeductionPlanList(List<DeductionPlanInfo> deductionPlanList) {
		this.deductionPlanList = deductionPlanList;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public Long getRemainCount() {
		return this.remainCount;
	}
	public void setRemainCount(Long remainCount) {
		this.remainCount = remainCount;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
