package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeductionPlanResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.card.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-02 14:01:48
 */
public class AlipayCommerceCardDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6833636374236431253L;

	/** 
	 * 取消类型
	 */
	@ApiField("cancel_type")
	private String cancelType;

	/** 
	 * 卡类型
	 */
	@ApiField("card_type")
	private String cardType;

	/** 
	 * 创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/** 
	 * 扣款计划
	 */
	@ApiListField("deduction_plan_response_list")
	@ApiField("deduction_plan_response")
	private List<DeductionPlanResponse> deductionPlanResponseList;

	/** 
	 * 卡id
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 用户账号
	 */
	@ApiField("login_id")
	private String loginId;

	/** 
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 自提卡名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 卡的orderId
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 卡剩余可用次数
	 */
	@ApiField("remain_count")
	private Long remainCount;

	/** 
	 * 商品id
	 */
	@ApiField("spc_template_id")
	private String spcTemplateId;

	/** 
	 * 卡状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 总计可使用次数
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
	}
	public String getCancelType( ) {
		return this.cancelType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardType( ) {
		return this.cardType;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCreateDate( ) {
		return this.createDate;
	}

	public void setDeductionPlanResponseList(List<DeductionPlanResponse> deductionPlanResponseList) {
		this.deductionPlanResponseList = deductionPlanResponseList;
	}
	public List<DeductionPlanResponse> getDeductionPlanResponseList( ) {
		return this.deductionPlanResponseList;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginId( ) {
		return this.loginId;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setRemainCount(Long remainCount) {
		this.remainCount = remainCount;
	}
	public Long getRemainCount( ) {
		return this.remainCount;
	}

	public void setSpcTemplateId(String spcTemplateId) {
		this.spcTemplateId = spcTemplateId;
	}
	public String getSpcTemplateId( ) {
		return this.spcTemplateId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
