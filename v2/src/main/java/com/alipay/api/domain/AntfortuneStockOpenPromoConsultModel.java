package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 证券活动咨询
 *
 * @author auto create
 * @since 1.0, 2023-09-15 16:56:47
 */
public class AntfortuneStockOpenPromoConsultModel extends AlipayObject {

	private static final long serialVersionUID = 1364382233525347469L;

	/**
	 * 指定金额发奖时必填，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 是否跨活动查询已领奖品（跨活动指非当前活动CP，使用券模板进行查询）
	 */
	@ApiField("check_available_camp")
	private Boolean checkAvailableCamp;

	/**
	 * 是否指定金额发奖
	 */
	@ApiField("fix_price_send")
	private Boolean fixPriceSend;

	/**
	 * 前端控制的推荐参数
	 */
	@ApiField("front_ctl_rec_context")
	private String frontCtlRecContext;

	/**
	 * 证券营销活动id
	 */
	@ApiField("interest_id")
	private String interestId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 指定奖品发奖时传入
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Boolean getCheckAvailableCamp() {
		return this.checkAvailableCamp;
	}
	public void setCheckAvailableCamp(Boolean checkAvailableCamp) {
		this.checkAvailableCamp = checkAvailableCamp;
	}

	public Boolean getFixPriceSend() {
		return this.fixPriceSend;
	}
	public void setFixPriceSend(Boolean fixPriceSend) {
		this.fixPriceSend = fixPriceSend;
	}

	public String getFrontCtlRecContext() {
		return this.frontCtlRecContext;
	}
	public void setFrontCtlRecContext(String frontCtlRecContext) {
		this.frontCtlRecContext = frontCtlRecContext;
	}

	public String getInterestId() {
		return this.interestId;
	}
	public void setInterestId(String interestId) {
		this.interestId = interestId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
