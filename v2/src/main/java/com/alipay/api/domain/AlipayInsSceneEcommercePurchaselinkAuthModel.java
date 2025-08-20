package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取已授权的订购地址
 *
 * @author auto create
 * @since 1.0, 2025-03-19 18:14:26
 */
public class AlipayInsSceneEcommercePurchaselinkAuthModel extends AlipayObject {

	private static final long serialVersionUID = 5536458913788871494L;

	/**
	 * 如果明确要求需要指定扣费账户，传入用于蚂蚁保进行校验
	 */
	@ApiField("assign_withdraw_account_no")
	private String assignWithdrawAccountNo;

	/**
	 * 至少订购天数
	 */
	@ApiField("at_least_days")
	private Long atLeastDays;

	/**
	 * 买家
	 */
	@ApiField("buyer")
	private EcomBuyerDTO buyer;

	/**
	 * 订购主体为商品维度时必传
	 */
	@ApiField("ecom_item")
	private EcomItemDTO ecomItem;

	/**
	 * 客户端用户ID
	 */
	@ApiField("login_user_id")
	private String loginUserId;

	/**
	 * session过期时间，具体的过期结束时间
	 */
	@ApiField("out_session_expiration")
	private Date outSessionExpiration;

	/**
	 * session_id
	 */
	@ApiField("out_session_id")
	private String outSessionId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 指定订购产品码:YFX(运费险),SHX(售后险)
	 */
	@ApiListField("product_code")
	@ApiField("string")
	private List<String> productCode;

	/**
	 * 指定订购产品方案ID列表
	 */
	@ApiListField("product_plan_ids")
	@ApiField("string")
	private List<String> productPlanIds;

	/**
	 * 订购人类型
SELLER 卖家
BUYER  买家
	 */
	@ApiField("purchase_user_type")
	private String purchaseUserType;

	/**
	 * 订购主体维度:PURCHASE_USER 订购人（卖家维度）,ECOM_ITEM  商品维度
	 */
	@ApiField("related_subject_type")
	private String relatedSubjectType;

	/**
	 * 卖家信息
	 */
	@ApiField("seller")
	private EcomSellerDTO seller;

	/**
	 * 客户端渠道：ios / android / pc / wx_applet / alipay_applet
	 */
	@ApiField("user_client")
	private String userClient;

	public String getAssignWithdrawAccountNo() {
		return this.assignWithdrawAccountNo;
	}
	public void setAssignWithdrawAccountNo(String assignWithdrawAccountNo) {
		this.assignWithdrawAccountNo = assignWithdrawAccountNo;
	}

	public Long getAtLeastDays() {
		return this.atLeastDays;
	}
	public void setAtLeastDays(Long atLeastDays) {
		this.atLeastDays = atLeastDays;
	}

	public EcomBuyerDTO getBuyer() {
		return this.buyer;
	}
	public void setBuyer(EcomBuyerDTO buyer) {
		this.buyer = buyer;
	}

	public EcomItemDTO getEcomItem() {
		return this.ecomItem;
	}
	public void setEcomItem(EcomItemDTO ecomItem) {
		this.ecomItem = ecomItem;
	}

	public String getLoginUserId() {
		return this.loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public Date getOutSessionExpiration() {
		return this.outSessionExpiration;
	}
	public void setOutSessionExpiration(Date outSessionExpiration) {
		this.outSessionExpiration = outSessionExpiration;
	}

	public String getOutSessionId() {
		return this.outSessionId;
	}
	public void setOutSessionId(String outSessionId) {
		this.outSessionId = outSessionId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public List<String> getProductCode() {
		return this.productCode;
	}
	public void setProductCode(List<String> productCode) {
		this.productCode = productCode;
	}

	public List<String> getProductPlanIds() {
		return this.productPlanIds;
	}
	public void setProductPlanIds(List<String> productPlanIds) {
		this.productPlanIds = productPlanIds;
	}

	public String getPurchaseUserType() {
		return this.purchaseUserType;
	}
	public void setPurchaseUserType(String purchaseUserType) {
		this.purchaseUserType = purchaseUserType;
	}

	public String getRelatedSubjectType() {
		return this.relatedSubjectType;
	}
	public void setRelatedSubjectType(String relatedSubjectType) {
		this.relatedSubjectType = relatedSubjectType;
	}

	public EcomSellerDTO getSeller() {
		return this.seller;
	}
	public void setSeller(EcomSellerDTO seller) {
		this.seller = seller;
	}

	public String getUserClient() {
		return this.userClient;
	}
	public void setUserClient(String userClient) {
		this.userClient = userClient;
	}

}
