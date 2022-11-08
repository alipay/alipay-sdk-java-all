package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益发放结果
 *
 * @author auto create
 * @since 1.0, 2022-05-16 17:43:24
 */
public class AggregationInstance extends AlipayObject {

	private static final long serialVersionUID = 8256726656443693635L;

	/**
	 * 模版ID
	 */
	@ApiField("aggr_id")
	private String aggrId;

	/**
	 * 请求的幂等参数
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 实例的生效起始时间
	 */
	@ApiField("gmt_active")
	private Date gmtActive;

	/**
	 * 实例过期时间
	 */
	@ApiField("gmt_expire")
	private Date gmtExpire;

	/**
	 * 权益实例ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 实例所对应的外部权益，如券
	 */
	@ApiField("out_id")
	private String outId;

	/**
	 * 请求的用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAggrId() {
		return this.aggrId;
	}
	public void setAggrId(String aggrId) {
		this.aggrId = aggrId;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public Date getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(Date gmtActive) {
		this.gmtActive = gmtActive;
	}

	public Date getGmtExpire() {
		return this.gmtExpire;
	}
	public void setGmtExpire(Date gmtExpire) {
		this.gmtExpire = gmtExpire;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOutId() {
		return this.outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
