package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务评价数据同步
 *
 * @author auto create
 * @since 1.0, 2020-04-29 20:42:22
 */
public class AlipayOpenAppRateDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3518567365427934461L;

	/**
	 * 账单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 管控状态
	 */
	@ApiField("control_status")
	private Long controlStatus;

	/**
	 * 支付宝用户信息: in_biz_account和out_biz_account必须要有一个
	 */
	@ApiField("in_biz_account")
	private String inBizAccount;

	/**
	 * 操作类型.INSERT:插入,UPDATE:更新
	 */
	@ApiField("oper_type")
	private String operType;

	/**
	 * 业务私域用户信息：in_biz_account和out_biz_account必须要有一个
	 */
	@ApiField("out_biz_account")
	private String outBizAccount;

	/**
	 * 评价ID：type=Rated时必填
	 */
	@ApiField("rate_id")
	private String rateId;

	/**
	 * 评分：type=NotRated时必填
	 */
	@ApiField("score")
	private Long score;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 评价来源.KOUBEI:口碑,MINIAPP:小程序,OFFLINE:线下门店
	 */
	@ApiField("source")
	private String source;

	/**
	 * 数据类型.Rated:评价完成消息,NotRated:逾期未评价信息
	 */
	@ApiField("type")
	private String type;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Long getControlStatus() {
		return this.controlStatus;
	}
	public void setControlStatus(Long controlStatus) {
		this.controlStatus = controlStatus;
	}

	public String getInBizAccount() {
		return this.inBizAccount;
	}
	public void setInBizAccount(String inBizAccount) {
		this.inBizAccount = inBizAccount;
	}

	public String getOperType() {
		return this.operType;
	}
	public void setOperType(String operType) {
		this.operType = operType;
	}

	public String getOutBizAccount() {
		return this.outBizAccount;
	}
	public void setOutBizAccount(String outBizAccount) {
		this.outBizAccount = outBizAccount;
	}

	public String getRateId() {
		return this.rateId;
	}
	public void setRateId(String rateId) {
		this.rateId = rateId;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
