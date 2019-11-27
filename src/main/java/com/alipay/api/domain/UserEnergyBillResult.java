package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户能量账单结果集
 *
 * @author auto create
 * @since 1.0, 2017-08-09 21:18:33
 */
public class UserEnergyBillResult extends AlipayObject {

	private static final long serialVersionUID = 3345632437261759812L;

	/**
	 * 收取日期，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 能量来源类型。
jiaofei,生活缴费
ditie,地铁购票
etc,ETC充值
weizhang,交通罚款
huochepiao,网购火车票
guahao,预约挂号
xianxiazhifu,线下支付
wangluogoupiao,网络购票
xingzou,行走
fapiao,电子发票
dingtalk,绿色办公
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 本条记录的能量值
	 */
	@ApiField("energy")
	private Long energy;

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Long getEnergy() {
		return this.energy;
	}
	public void setEnergy(Long energy) {
		this.energy = energy;
	}

}
