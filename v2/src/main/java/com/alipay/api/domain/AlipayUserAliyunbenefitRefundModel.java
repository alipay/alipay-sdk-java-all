package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝会员阿里云权益退款接口
 *
 * @author auto create
 * @since 1.0, 2022-10-28 20:17:49
 */
public class AlipayUserAliyunbenefitRefundModel extends AlipayObject {

	private static final long serialVersionUID = 3825739734163331266L;

	/**
	 * 业务回传信息，值是json格式字符串，阿里云会对回传的key强管控，但不理解value内容，目前支持的回传key只有一个：requestSourceInfo，后续若有新增需同步更新api文档
	 */
	@ApiField("ext_json")
	private String extJson;

	/**
	 * 订单所属支付宝用户对应的统一开放ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 业务流水号，用来映射需要回退积分的订单号，与权益兑换时传入的值一致。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 订单所属支付宝用户的uid，与兑换接口中传入的值保持一致
	 */
	@ApiField("user_id")
	private String userId;

	public String getExtJson() {
		return this.extJson;
	}
	public void setExtJson(String extJson) {
		this.extJson = extJson;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
