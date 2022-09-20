package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大额无限付产品个人解约接口
 *
 * @author auto create
 * @since 1.0, 2021-03-23 11:23:42
 */
public class AlipayTradeServiceUnsignModel extends AlipayObject {

	private static final long serialVersionUID = 8646639634577497464L;

	/**
	 * 用户的支付宝id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 服务对应的业务场景,由支付宝分配. 枚举值列表: LARGE_INFINITE_V2:无限付2.0; YUEBAO_TRANSFER:余额宝大额申购; AD_CHARGE:灯火平台广告费充值; PERSONAL_ACCOUNT_RECHARGE:灯火平台广告费充值; ETC_B2B:区块链ETC_B2B
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 子业务场景，由支付宝分配.枚举值列表: 1.ACS模式: 2.FUND_ACCOUNT:场景余额 3.SHBANK:上海银行
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
