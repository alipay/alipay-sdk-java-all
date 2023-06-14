package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 奖品信息
 *
 * @author auto create
 * @since 1.0, 2018-02-07 12:00:22
 */
public class PrizeModel extends AlipayObject {

	private static final long serialVersionUID = 5281789376595152263L;

	/**
	 * 生效时间
	 */
	@ApiField("active_time")
	private Date activeTime;

	/**
	 * 可用金额，单位元，精度分
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 可用次数，大于1为可找零红包，等于1为不找零红包
	 */
	@ApiField("available_count")
	private Long availableCount;

	/**
	 * 奖品描述
	 */
	@ApiField("description")
	private String description;

	/**
	 * 按天折扣信息
	 */
	@ApiListField("discount_by_day_list")
	@ApiField("discount_by_day_model")
	private List<DiscountByDayModel> discountByDayList;

	/**
	 * 分期和整笔折扣信息
	 */
	@ApiListField("discount_list")
	@ApiField("discount_model")
	private List<DiscountModel> discountList;

	/**
	 * 失效时间
	 */
	@ApiField("expired_time")
	private Date expiredTime;

	/**
	 * 扩展信息，JSON结构
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 奖品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 奖品的复合ID
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 奖品状态
VALID 可使用
EXPIRED 已过期
ALL_USED 全部使用完
	 */
	@ApiField("status")
	private String status;

	/**
	 * 总金额，单位元，精度分
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/**
	 * 奖品类型
DISCOUNT_VOUCHER 利率打折卡券
COUPON_VOUCHER 利息红包卡券
DISCOUNT_CAMP 实时优惠活动
	 */
	@ApiField("type")
	private String type;

	/**
	 * 已使用次数
	 */
	@ApiField("used_count")
	private Long usedCount;

	public Date getActiveTime() {
		return this.activeTime;
	}
	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public Long getAvailableCount() {
		return this.availableCount;
	}
	public void setAvailableCount(Long availableCount) {
		this.availableCount = availableCount;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public List<DiscountByDayModel> getDiscountByDayList() {
		return this.discountByDayList;
	}
	public void setDiscountByDayList(List<DiscountByDayModel> discountByDayList) {
		this.discountByDayList = discountByDayList;
	}

	public List<DiscountModel> getDiscountList() {
		return this.discountList;
	}
	public void setDiscountList(List<DiscountModel> discountList) {
		this.discountList = discountList;
	}

	public Date getExpiredTime() {
		return this.expiredTime;
	}
	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

}
