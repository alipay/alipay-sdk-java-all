package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益使用
 *
 * @author auto create
 * @since 1.0, 2022-07-22 19:55:11
 */
public class AlipayMarketingCampaignUnicardCardUseModel extends AlipayObject {

	private static final long serialVersionUID = 8244834321345335933L;

	/**
	 * 权益使用接口，商户备注扩展信息
	 */
	@ApiField("biz_memo")
	private String bizMemo;

	/**
	 * 参数名：外部业务单号
应用场景：与支付宝的一个业务单号进行绑定，后续可以通过该业务单号进行查询
如何获取：接口使用方自行生成，为了数据查询的准确性，应该确保该单号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 权益使用交易时间，商户请求中填入交易时间。
	 */
	@ApiField("trade_date")
	private Date tradeDate;

	/**
	 * 联营卡卡号。 用户在C端开通的联营卡后分配的卡号，目前一个周期的卡号是唯一的，且卡号会对应确定的卡模板id。
	 */
	@ApiField("uni_card_no")
	private String uniCardNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizMemo() {
		return this.bizMemo;
	}
	public void setBizMemo(String bizMemo) {
		this.bizMemo = bizMemo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Date getTradeDate() {
		return this.tradeDate;
	}
	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getUniCardNo() {
		return this.uniCardNo;
	}
	public void setUniCardNo(String uniCardNo) {
		this.uniCardNo = uniCardNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
