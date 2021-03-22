package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资源状态(剩余库存和销售状态)变更消息
 *
 * @author auto create
 * @since 1.0, 2019-04-25 15:20:15
 */
public class KoubeiServindustryReservationResourcestatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3648588947224495163L;

	/**
	 * 消息变更类型
	 */
	@ApiListField("biz_type")
	@ApiField("string")
	private List<String> bizType;

	/**
	 * 周期库存时间，当周期库存变更时必填
	 */
	@ApiField("cycle_property_time")
	private IsvCyclePropertyTimeModel cyclePropertyTime;

	/**
	 * 资源状态变化的日期
	 */
	@ApiField("date")
	private Date date;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private ReservationTimeUnit endTime;

	/**
	 * 预订所属的行业
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 外部业务id，如ISV KTV包厢id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 口碑预订资源id
	 */
	@ApiField("resource_id")
	private String resourceId;

	/**
	 * 口碑店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private ReservationTimeUnit startTime;

	public List<String> getBizType() {
		return this.bizType;
	}
	public void setBizType(List<String> bizType) {
		this.bizType = bizType;
	}

	public IsvCyclePropertyTimeModel getCyclePropertyTime() {
		return this.cyclePropertyTime;
	}
	public void setCyclePropertyTime(IsvCyclePropertyTimeModel cyclePropertyTime) {
		this.cyclePropertyTime = cyclePropertyTime;
	}

	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public ReservationTimeUnit getEndTime() {
		return this.endTime;
	}
	public void setEndTime(ReservationTimeUnit endTime) {
		this.endTime = endTime;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getResourceId() {
		return this.resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public ReservationTimeUnit getStartTime() {
		return this.startTime;
	}
	public void setStartTime(ReservationTimeUnit startTime) {
		this.startTime = startTime;
	}

}
