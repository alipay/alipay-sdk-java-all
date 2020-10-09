package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集点数据回流接口
 *
 * @author auto create
 * @since 1.0, 2020-04-23 13:05:56
 */
public class AlipayCommerceDataCampaignSendModel extends AlipayObject {

	private static final long serialVersionUID = 5199677696338686176L;

	/**
	 * 本次交易获得集点方式。目前支持扫码点餐：scanOrder、蜻蜓刷脸支付：facePay、当面付：faceToFace、储值卡支付：valueCard、在线支付：online。如有其它渠道需要和支付宝约定
	 */
	@ApiField("camp_category")
	private String campCategory;

	/**
	 * 集点渠道，标识本次集点的交易数据是否产生于支付宝端。其中支付宝，取值：alipay；其它渠道，取值：other
	 */
	@ApiField("camp_channel")
	private String campChannel;

	/**
	 * 集点活动id，即商户调用集点活动配置接口后接口返回的camp_id
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 集点时间。取值精确至秒，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("camp_time")
	private String campTime;

	/**
	 * 单次交易跨周期标识，即一笔交易跨两个集点周期时，需要传入cross_cycle=true，支付宝会告知用户当前阶段集点任务已完成。如集点任务目标为9点，当前用户集7点，本次交易集4点，完成本阶段集点任务的同时，进入下阶段集点任务
	 */
	@ApiField("cross_cycle")
	private String crossCycle;

	/**
	 * 本次交易集点数量
	 */
	@ApiField("cur_num")
	private String curNum;

	/**
	 * 集点数据回流业务扩展字段，json数组格式。具体值需要和支付宝约定
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 集点数据回流流水号，用于做幂等控制
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 本阶段集点任务中已累计集点数量，即包含本次交易集点数的当前阶段已累计点数
	 */
	@ApiField("total_num")
	private String totalNum;

	/**
	 * 本次集点交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 集点用户的支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCampCategory() {
		return this.campCategory;
	}
	public void setCampCategory(String campCategory) {
		this.campCategory = campCategory;
	}

	public String getCampChannel() {
		return this.campChannel;
	}
	public void setCampChannel(String campChannel) {
		this.campChannel = campChannel;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getCampTime() {
		return this.campTime;
	}
	public void setCampTime(String campTime) {
		this.campTime = campTime;
	}

	public String getCrossCycle() {
		return this.crossCycle;
	}
	public void setCrossCycle(String crossCycle) {
		this.crossCycle = crossCycle;
	}

	public String getCurNum() {
		return this.curNum;
	}
	public void setCurNum(String curNum) {
		this.curNum = curNum;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getTotalNum() {
		return this.totalNum;
	}
	public void setTotalNum(String totalNum) {
		this.totalNum = totalNum;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
