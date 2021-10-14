package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合作渠道可通过该接口补登扣款取消请求，以帮助支付宝将用户的资金退给用户
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:20
 */
public class AlipayCommerceCityfacilitatorDepositCancelModel extends AlipayObject {

	private static final long serialVersionUID = 1374877488474135445L;

	/**
	 * 扩展字段，传递撤销的终端信息，原因等
	 */
	@ApiField("biz_info_ext")
	private String bizInfoExt;

	/**
	 * 充值卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 交通卡卡类型，一个城市只有一个固定的值
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 撤销时间
	 */
	@ApiField("operate_time")
	private String operateTime;

	/**
	 * 商户的交易号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBizInfoExt() {
		return this.bizInfoExt;
	}
	public void setBizInfoExt(String bizInfoExt) {
		this.bizInfoExt = bizInfoExt;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getOperateTime() {
		return this.operateTime;
	}
	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
