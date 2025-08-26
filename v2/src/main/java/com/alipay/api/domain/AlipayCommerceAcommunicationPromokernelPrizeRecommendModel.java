package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动平台一阶段抽奖能力接口
 *
 * @author auto create
 * @since 1.0, 2025-05-14 16:02:27
 */
public class AlipayCommerceAcommunicationPromokernelPrizeRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 7372719858184896513L;

	/**
	 * 用户唯一标识，可以通过端内的jsApi进行获取。其实就是2088开头的支付宝ID。
	 */
	@ApiField("alipay_user_unique_identifier")
	private String alipayUserUniqueIdentifier;

	/**
	 * 活动平台活动ID，活动唯一标记。
	 */
	@ApiField("camp_id")
	private String campId;

	/**
	 * 如果不填则使用随机生成uuid
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 奖品ID, 当需要指定奖品抽奖的时候传入。
	 */
	@ApiField("prize_id")
	private String prizeId;

	public String getAlipayUserUniqueIdentifier() {
		return this.alipayUserUniqueIdentifier;
	}
	public void setAlipayUserUniqueIdentifier(String alipayUserUniqueIdentifier) {
		this.alipayUserUniqueIdentifier = alipayUserUniqueIdentifier;
	}

	public String getCampId() {
		return this.campId;
	}
	public void setCampId(String campId) {
		this.campId = campId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

}
