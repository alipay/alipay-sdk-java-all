package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值金扣减
 *
 * @author auto create
 * @since 1.0, 2024-12-02 21:49:19
 */
public class AlipayCommerceAcommunicationPointClearModel extends AlipayObject {

	private static final long serialVersionUID = 2537887898224992781L;

	/**
	 * 日期类型，可空，为空则为当前时间
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号, 非空且长度不能大于128个字符, 需确保值唯一
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 积分数量，单位为个
	 */
	@ApiField("point")
	private Long point;

	/**
	 * 扣减原因
	 */
	@ApiField("trans_memo")
	private String transMemo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPoint() {
		return this.point;
	}
	public void setPoint(Long point) {
		this.point = point;
	}

	public String getTransMemo() {
		return this.transMemo;
	}
	public void setTransMemo(String transMemo) {
		this.transMemo = transMemo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
