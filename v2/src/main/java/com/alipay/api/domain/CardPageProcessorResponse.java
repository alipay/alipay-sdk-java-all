package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡实例分页返回
 *
 * @author auto create
 * @since 1.0, 2023-10-11 16:02:05
 */
public class CardPageProcessorResponse extends AlipayObject {

	private static final long serialVersionUID = 5849225153478921632L;

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
	 * 卡id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 支付宝登录号
	 */
	@ApiField("login_id")
	private String loginId;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 卡名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 用户id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 购卡次卡的单号
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

	public String getCancelType() {
		return this.cancelType;
	}
	public void setCancelType(String cancelType) {
		this.cancelType = cancelType;
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

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getLoginId() {
		return this.loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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

	public String getSpcTemplateId() {
		return this.spcTemplateId;
	}
	public void setSpcTemplateId(String spcTemplateId) {
		this.spcTemplateId = spcTemplateId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
