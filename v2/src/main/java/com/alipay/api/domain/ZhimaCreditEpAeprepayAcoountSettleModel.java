package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 企信AE提前收款服务追缴平账
 *
 * @author auto create
 * @since 1.0, 2023-08-16 19:14:53
 */
public class ZhimaCreditEpAeprepayAcoountSettleModel extends AlipayObject {

	private static final long serialVersionUID = 7411687288236856665L;

	/**
	 * 实际平账金额。单位：元
	 */
	@ApiField("actual_amount")
	private String actualAmount;

	/**
	 * 实际平账币种
	 */
	@ApiField("actual_amount_currency")
	private String actualAmountCurrency;

	/**
	 * 申请平账金额。单位：元
	 */
	@ApiField("apply_amount")
	private String applyAmount;

	/**
	 * 申请平账币种
	 */
	@ApiField("apply_amount_currency")
	private String applyAmountCurrency;

	/**
	 * 还款渠道；
INITIATIVE_REPAY：主动还款 
TRADEDRIVE_REPAY：交易驱动
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 扩展预留
	 */
	@ApiField("ext_param")
	private ZmEpAePrepayExtParam extParam;

	/**
	 * 商家登陆id
	 */
	@ApiField("seller_login_id")
	private String sellerLoginId;

	/**
	 * 销账幂等单号
	 */
	@ApiField("write_off_apply_no")
	private String writeOffApplyNo;

	/**
	 * 销账订单列表
	 */
	@ApiListField("write_off_order_param_list")
	@ApiField("zmep_ae_prepay_write_off_detail_d_t_o")
	private List<ZmepAePrepayWriteOffDetailDTO> writeOffOrderParamList;

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

	public ZmEpAePrepayExtParam getExtParam() {
		return this.extParam;
	}
	public void setExtParam(ZmEpAePrepayExtParam extParam) {
		this.extParam = extParam;
	}

	public String getSellerLoginId() {
		return this.sellerLoginId;
	}
	public void setSellerLoginId(String sellerLoginId) {
		this.sellerLoginId = sellerLoginId;
	}

	public String getWriteOffApplyNo() {
		return this.writeOffApplyNo;
	}
	public void setWriteOffApplyNo(String writeOffApplyNo) {
		this.writeOffApplyNo = writeOffApplyNo;
	}

	public List<ZmepAePrepayWriteOffDetailDTO> getWriteOffOrderParamList() {
		return this.writeOffOrderParamList;
	}
	public void setWriteOffOrderParamList(List<ZmepAePrepayWriteOffDetailDTO> writeOffOrderParamList) {
		this.writeOffOrderParamList = writeOffOrderParamList;
	}

}
