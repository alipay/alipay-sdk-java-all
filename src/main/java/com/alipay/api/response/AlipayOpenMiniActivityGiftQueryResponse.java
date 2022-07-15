package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.activity.gift.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-29 11:07:59
 */
public class AlipayOpenMiniActivityGiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7272472942384224349L;

	/** 
	 * 金额(分), 仅限代金券
	 */
	@ApiField("amount_cent")
	private Long amountCent;

	/** 
	 * 最大抵扣金额(分)
	 */
	@ApiField("ceiling_amount_cent")
	private Long ceilingAmountCent;

	/** 
	 * 活动结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * 门槛金额(分)
	 */
	@ApiField("floor_amount_cent")
	private Long floorAmountCent;

	/** 
	 * 领券后完整跳转链接
	 */
	@ApiField("full_redirect_url")
	private String fullRedirectUrl;

	/** 
	 * 小程序 id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/** 
	 * 创建活动的商户 id
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 券余量
	 */
	@ApiField("remain_amount")
	private Long remainAmount;

	/** 
	 * 单用户领取上限
	 */
	@ApiField("single_user_limit")
	private Long singleUserLimit;

	/** 
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * draft,创建中;init,待发布;active,已发布;pause,暂停;finished,终止
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 活动模板 id, 即小程序识别的活动 id
	 */
	@ApiField("template_id")
	private String templateId;

	/** 
	 * 活动名称
	 */
	@ApiField("template_name")
	private String templateName;

	/** 
	 * 库存总量
	 */
	@ApiField("total_amount")
	private Long totalAmount;

	/** 
	 * 折扣比例, 仅限折扣券
	 */
	@ApiField("voucher_discount_percent")
	private String voucherDiscountPercent;

	/** 
	 * 领取券跳转地址
	 */
	@ApiField("voucher_jump_url")
	private String voucherJumpUrl;

	/** 
	 * 券名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	/** 
	 * 小程序活动关联的券模板 id
	 */
	@ApiField("voucher_template_id")
	private String voucherTemplateId;

	/** 
	 * 券类型:
代金券
   FIX_VOUCHER
   CASHLESS_FIX_VOUCHER
   ITEM_CASHLESS_FIX_VOUCHER
折扣券
   DISCOUNT_VOUCHER
   CASHLESS_DISCOUNT_VOUCHER
   ITEM_CASHLESS_DISCOUNT_VOUCHER
券码券
   CODE_VOUCHER
特价券
   ITEM_CASHLESS_SPE_VOUCHER
	 */
	@ApiField("voucher_type")
	private String voucherType;

	public void setAmountCent(Long amountCent) {
		this.amountCent = amountCent;
	}
	public Long getAmountCent( ) {
		return this.amountCent;
	}

	public void setCeilingAmountCent(Long ceilingAmountCent) {
		this.ceilingAmountCent = ceilingAmountCent;
	}
	public Long getCeilingAmountCent( ) {
		return this.ceilingAmountCent;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setFloorAmountCent(Long floorAmountCent) {
		this.floorAmountCent = floorAmountCent;
	}
	public Long getFloorAmountCent( ) {
		return this.floorAmountCent;
	}

	public void setFullRedirectUrl(String fullRedirectUrl) {
		this.fullRedirectUrl = fullRedirectUrl;
	}
	public String getFullRedirectUrl( ) {
		return this.fullRedirectUrl;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setRemainAmount(Long remainAmount) {
		this.remainAmount = remainAmount;
	}
	public Long getRemainAmount( ) {
		return this.remainAmount;
	}

	public void setSingleUserLimit(Long singleUserLimit) {
		this.singleUserLimit = singleUserLimit;
	}
	public Long getSingleUserLimit( ) {
		return this.singleUserLimit;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateName( ) {
		return this.templateName;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Long getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setVoucherDiscountPercent(String voucherDiscountPercent) {
		this.voucherDiscountPercent = voucherDiscountPercent;
	}
	public String getVoucherDiscountPercent( ) {
		return this.voucherDiscountPercent;
	}

	public void setVoucherJumpUrl(String voucherJumpUrl) {
		this.voucherJumpUrl = voucherJumpUrl;
	}
	public String getVoucherJumpUrl( ) {
		return this.voucherJumpUrl;
	}

	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}
	public String getVoucherName( ) {
		return this.voucherName;
	}

	public void setVoucherTemplateId(String voucherTemplateId) {
		this.voucherTemplateId = voucherTemplateId;
	}
	public String getVoucherTemplateId( ) {
		return this.voucherTemplateId;
	}

	public void setVoucherType(String voucherType) {
		this.voucherType = voucherType;
	}
	public String getVoucherType( ) {
		return this.voucherType;
	}

}
