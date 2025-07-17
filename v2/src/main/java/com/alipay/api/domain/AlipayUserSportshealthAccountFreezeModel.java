package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 冻结运动币账户运动币数量
 *
 * @author auto create
 * @since 1.0, 2022-10-24 15:10:28
 */
public class AlipayUserSportshealthAccountFreezeModel extends AlipayObject {

	private static final long serialVersionUID = 2231835627553377799L;

	/**
	 * 账户流水明细描述，会展示在用户运动币明细列表中
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 蚂蚁统一会员ID,必填
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部渠道,合作业务可联系运动运营配置
	 */
	@ApiField("out_biz_channel")
	private String outBizChannel;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 冻结支付运动币数量
	 */
	@ApiField("pay_amount")
	private Long payAmount;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizChannel() {
		return this.outBizChannel;
	}
	public void setOutBizChannel(String outBizChannel) {
		this.outBizChannel = outBizChannel;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(Long payAmount) {
		this.payAmount = payAmount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
