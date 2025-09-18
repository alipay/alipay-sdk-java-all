package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 客服呼入类坐席事件上模型
 *
 * @author auto create
 * @since 1.0, 2024-07-24 20:04:14
 */
public class IcInboundSeatEventModel extends AlipayObject {

	private static final long serialVersionUID = 3675828157147838284L;

	/**
	 * 事件发生时间，1970年以来的毫秒数
	 */
	@ApiField("event_time")
	private Long eventTime;

	/**
	 * 坐席状态，如下：
SEAT_ONLINE	：坐席上线
SEAT_OFFLINE：坐席下线
SEAT_OCCUPY：坐席资源占用
SEAT_RELEASE：坐席资源释放
SEAT_BREAK：坐席小休
SEAT_CANCEL_BREAK：坐席结束小休
	 */
	@ApiField("seat_biz_action")
	private String seatBizAction;

	/**
	 * 坐席当前负载，单位/个
	 */
	@ApiField("seat_current_load")
	private Long seatCurrentLoad;

	/**
	 * 坐席id
	 */
	@ApiField("seat_id")
	private String seatId;

	/**
	 * 坐席ID类型
	 */
	@ApiField("seat_id_type")
	private String seatIdType;

	/**
	 * 坐席最大负载，单位/个
	 */
	@ApiField("seat_max_load")
	private Long seatMaxLoad;

	/**
	 * 坐席服务状态
	 */
	@ApiField("seat_service_status")
	private String seatServiceStatus;

	/**
	 * 坐席签入渠道
	 */
	@ApiField("seat_sign_channel")
	private String seatSignChannel;

	/**
	 * 服务渠道
	 */
	@ApiField("service_channel")
	private String serviceChannel;

	/**
	 * 技能组ID类型
	 */
	@ApiField("skill_group_id_type")
	private String skillGroupIdType;

	/**
	 * 技能组ID列表
	 */
	@ApiListField("skill_group_ids")
	@ApiField("string")
	private List<String> skillGroupIds;

	/**
	 * 星云租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public Long getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(Long eventTime) {
		this.eventTime = eventTime;
	}

	public String getSeatBizAction() {
		return this.seatBizAction;
	}
	public void setSeatBizAction(String seatBizAction) {
		this.seatBizAction = seatBizAction;
	}

	public Long getSeatCurrentLoad() {
		return this.seatCurrentLoad;
	}
	public void setSeatCurrentLoad(Long seatCurrentLoad) {
		this.seatCurrentLoad = seatCurrentLoad;
	}

	public String getSeatId() {
		return this.seatId;
	}
	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}

	public String getSeatIdType() {
		return this.seatIdType;
	}
	public void setSeatIdType(String seatIdType) {
		this.seatIdType = seatIdType;
	}

	public Long getSeatMaxLoad() {
		return this.seatMaxLoad;
	}
	public void setSeatMaxLoad(Long seatMaxLoad) {
		this.seatMaxLoad = seatMaxLoad;
	}

	public String getSeatServiceStatus() {
		return this.seatServiceStatus;
	}
	public void setSeatServiceStatus(String seatServiceStatus) {
		this.seatServiceStatus = seatServiceStatus;
	}

	public String getSeatSignChannel() {
		return this.seatSignChannel;
	}
	public void setSeatSignChannel(String seatSignChannel) {
		this.seatSignChannel = seatSignChannel;
	}

	public String getServiceChannel() {
		return this.serviceChannel;
	}
	public void setServiceChannel(String serviceChannel) {
		this.serviceChannel = serviceChannel;
	}

	public String getSkillGroupIdType() {
		return this.skillGroupIdType;
	}
	public void setSkillGroupIdType(String skillGroupIdType) {
		this.skillGroupIdType = skillGroupIdType;
	}

	public List<String> getSkillGroupIds() {
		return this.skillGroupIds;
	}
	public void setSkillGroupIds(List<String> skillGroupIds) {
		this.skillGroupIds = skillGroupIds;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
