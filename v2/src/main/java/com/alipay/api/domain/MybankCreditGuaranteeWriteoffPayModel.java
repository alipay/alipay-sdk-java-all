package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 平账通知处理
 *
 * @author auto create
 * @since 1.0, 2022-02-15 15:24:06
 */
public class MybankCreditGuaranteeWriteoffPayModel extends AlipayObject {

	private static final long serialVersionUID = 3415495433398463927L;

	/**
	 * 实际平账金额，单位分
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 实际平账金额的币种
	 */
	@ApiField("actual_amount_currency")
	private String actualAmountCurrency;

	/**
	 * 申请平账金额，单位分
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 申请平账金额的币种
	 */
	@ApiField("apply_amount_currency")
	private String applyAmountCurrency;

	/**
	 * 还款渠道。INITIATIVE_REPAY/TRADEDRIVE_REPAY
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * AE卖家sellerLoginID
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	/**
	 * 会员站点：AE:速卖通，ALIPAY:支付宝，MYBANK:网商银行，TAOBAO：淘宝，B2B_CN：中文站，B2B_EN：国际站
	 */
	@ApiField("site")
	private String site;

	/**
	 * 销账申请单号
	 */
	@ApiField("writeoff_apply_no")
	private String writeoffApplyNo;

	/**
	 * 销账订单列表
	 */
	@ApiListField("writeoff_order_param_list")
	@ApiField("writeoff_order_param")
	private List<WriteoffOrderParam> writeoffOrderParamList;

	public String getActualAmount() {
		return this.actualAmount;
	}
	public void setActualAmount(String actualAmount) {
		this.actualAmount = actualAmount;
	}

	public String getActualAmountCurrency() {
		return this.actualAmountCurrency;
	}
	public void setActualAmountCurrency(String actualAmountCurrency) {
		this.actualAmountCurrency = actualAmountCurrency;
	}

	public String getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(String applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getApplyAmountCurrency() {
		return this.applyAmountCurrency;
	}
	public void setApplyAmountCurrency(String applyAmountCurrency) {
		this.applyAmountCurrency = applyAmountCurrency;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getSite() {
		return this.site;
	}
	public void setSite(String site) {
		this.site = site;
	}

	public String getWriteoffApplyNo() {
		return this.writeoffApplyNo;
	}
	public void setWriteoffApplyNo(String writeoffApplyNo) {
		this.writeoffApplyNo = writeoffApplyNo;
	}

	public List<WriteoffOrderParam> getWriteoffOrderParamList() {
		return this.writeoffOrderParamList;
	}
	public void setWriteoffOrderParamList(List<WriteoffOrderParam> writeoffOrderParamList) {
		this.writeoffOrderParamList = writeoffOrderParamList;
	}

}
