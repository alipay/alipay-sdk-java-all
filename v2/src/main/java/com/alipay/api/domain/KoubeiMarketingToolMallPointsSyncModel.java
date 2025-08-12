package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑商圈集卡数据保存接口
 *
 * @author auto create
 * @since 1.0, 2022-11-22 15:13:09
 */
public class KoubeiMarketingToolMallPointsSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4513756175812942147L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 业务类型(目前只有点卡)
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 渲染截止时间
	 */
	@ApiField("gmt_end")
	private Date gmtEnd;

	/**
	 * 卡片展示内容，卡片如果没有集的count设置为0，本次交易获取的卡片需设置is_new的值为true
	 */
	@ApiField("json_content")
	private String jsonContent;

	/**
	 * 商圈id
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * trade|lottery|system，表示为交易|领取礼包|系统调整
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 外部幂等id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * collecting|collectSuccess|finish字段中的一种
	 */
	@ApiField("state")
	private String state;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_id")
	private String tradeId;

	/**
	 * 用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Date getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(Date gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getJsonContent() {
		return this.jsonContent;
	}
	public void setJsonContent(String jsonContent) {
		this.jsonContent = jsonContent;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
