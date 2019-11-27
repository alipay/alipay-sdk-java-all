package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家权益中心 权益发放的记录详细信息
 *
 * @author auto create
 * @since 1.0, 2019-02-22 11:10:14
 */
public class BenefitDetailVO extends AlipayObject {

	private static final long serialVersionUID = 1639539915629711848L;

	/**
	 * 权益数量
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 权益发放时间
	 */
	@ApiField("benefit_grant_time")
	private Date benefitGrantTime;

	/**
	 * 权益实例ID
	 */
	@ApiField("benefit_instance_id")
	private String benefitInstanceId;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 发放记录ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 权益类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Date getBenefitGrantTime() {
		return this.benefitGrantTime;
	}
	public void setBenefitGrantTime(Date benefitGrantTime) {
		this.benefitGrantTime = benefitGrantTime;
	}

	public String getBenefitInstanceId() {
		return this.benefitInstanceId;
	}
	public void setBenefitInstanceId(String benefitInstanceId) {
		this.benefitInstanceId = benefitInstanceId;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
