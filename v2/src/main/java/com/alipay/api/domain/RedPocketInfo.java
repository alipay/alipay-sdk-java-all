package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 红包详细信息
 *
 * @author auto create
 * @since 1.0, 2024-11-19 17:25:04
 */
public class RedPocketInfo extends AlipayObject {

	private static final long serialVersionUID = 4731145458241885822L;

	/**
	 * 红包id
	 */
	@ApiField("red_pocket_id")
	private String redPocketId;

	/**
	 * 红包发送后生成的外部订单号 有行业侧定义  根据外部订单号可查询到对应红包信息
	 */
	@ApiField("red_pocket_out_biz_no")
	private String redPocketOutBizNo;

	/**
	 * 红包说明/描述
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 红包发送时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	public String getRedPocketId() {
		return this.redPocketId;
	}
	public void setRedPocketId(String redPocketId) {
		this.redPocketId = redPocketId;
	}

	public String getRedPocketOutBizNo() {
		return this.redPocketOutBizNo;
	}
	public void setRedPocketOutBizNo(String redPocketOutBizNo) {
		this.redPocketOutBizNo = redPocketOutBizNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

}
