package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务市场实例同步
 *
 * @author auto create
 * @since 1.0, 2021-08-10 10:38:08
 */
public class AlipayOpenServicemarketInstanceSyncModel extends AlipayObject {

	private static final long serialVersionUID = 1694591838546392694L;

	/**
	 * 2088101118588888
	 */
	@ApiField("consumer_uid")
	private String consumerUid;

	/**
	 * 生效时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("effect_date")
	private String effectDate;

	/**
	 * 事件类型
	 */
	@ApiField("event")
	private String event;

	/**
	 * 过期时间，格式yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("expire_date")
	private String expireDate;

	/**
	 * 金融科技产品码
	 */
	@ApiField("fin_tech_product_code")
	private String finTechProductCode;

	/**
	 * 最后修改时间，用做防请求乱序，针对同一条数据的更新，如果值小于上一个请求的值，该次请求会被丢弃。建议使用数据的修改时间，或者乐观锁的version作为参数值。
	 */
	@ApiField("gmt_modified")
	private Long gmtModified;

	/**
	 * 实例标识
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 金融科技实例状态
	 */
	@ApiField("instance_status")
	private String instanceStatus;

	/**
	 * 比如某种业务标准外部订单号,比如交易外部订单号，代表商户端自己订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getConsumerUid() {
		return this.consumerUid;
	}
	public void setConsumerUid(String consumerUid) {
		this.consumerUid = consumerUid;
	}

	public String getEffectDate() {
		return this.effectDate;
	}
	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}

	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}

	public String getExpireDate() {
		return this.expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public String getFinTechProductCode() {
		return this.finTechProductCode;
	}
	public void setFinTechProductCode(String finTechProductCode) {
		this.finTechProductCode = finTechProductCode;
	}

	public Long getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Long gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceStatus() {
		return this.instanceStatus;
	}
	public void setInstanceStatus(String instanceStatus) {
		this.instanceStatus = instanceStatus;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
