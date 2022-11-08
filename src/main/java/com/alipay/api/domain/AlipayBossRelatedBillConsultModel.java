package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关联交易账单咨询
 *
 * @author auto create
 * @since 1.0, 2022-06-06 21:30:50
 */
public class AlipayBossRelatedBillConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7388413538962269713L;

	/**
	 * 业务发生时间,格式为 2022-02-02
	 */
	@ApiField("biz_date")
	private String bizDate;

	/**
	 * 拓展信息:业务流水ID、产品码等，可不传。目前影响识别结果的Key有：salesProductCode、POINT_EXCHANGE_GOODS、relTradeSettleType、feeItemCode、oppositeAssetTypeCode、gfaIdentityId
	 */
	@ApiField("extra_infos")
	private String extraInfos;

	/**
	 * 咨询的关联方公司生效时间是否按照整月生效。
	 */
	@ApiField("is_whole_month_valid")
	private Boolean isWholeMonthValid;

	/**
	 * 账单对手方咨询值类型(付款身份)咨询类型：PID/UID/MID/CID/NAME/OU
	 */
	@ApiField("opposite_fund_type")
	private String oppositeFundType;

	/**
	 * 账单对手方咨询类型值(付款身份)咨询类型对应的值
	 */
	@ApiField("opposite_fund_value")
	private String oppositeFundValue;

	/**
	 * 账单对手方咨询值类型(结算身份)咨询类型：PID/UID/MID/CID/NAME/OU
	 */
	@ApiField("opposite_settle_type")
	private String oppositeSettleType;

	/**
	 * 账单对手方咨询类型值(结算身份)对应咨询值
	 */
	@ApiField("opposite_settle_value")
	private String oppositeSettleValue;

	/**
	 * 本方咨询类型：PID/UID/MID/CID
	 */
	@ApiField("self_type")
	private String selfType;

	/**
	 * 根据咨询类型传入相应的咨询值
	 */
	@ApiField("self_value")
	private String selfValue;

	public String getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getExtraInfos() {
		return this.extraInfos;
	}
	public void setExtraInfos(String extraInfos) {
		this.extraInfos = extraInfos;
	}

	public Boolean getIsWholeMonthValid() {
		return this.isWholeMonthValid;
	}
	public void setIsWholeMonthValid(Boolean isWholeMonthValid) {
		this.isWholeMonthValid = isWholeMonthValid;
	}

	public String getOppositeFundType() {
		return this.oppositeFundType;
	}
	public void setOppositeFundType(String oppositeFundType) {
		this.oppositeFundType = oppositeFundType;
	}

	public String getOppositeFundValue() {
		return this.oppositeFundValue;
	}
	public void setOppositeFundValue(String oppositeFundValue) {
		this.oppositeFundValue = oppositeFundValue;
	}

	public String getOppositeSettleType() {
		return this.oppositeSettleType;
	}
	public void setOppositeSettleType(String oppositeSettleType) {
		this.oppositeSettleType = oppositeSettleType;
	}

	public String getOppositeSettleValue() {
		return this.oppositeSettleValue;
	}
	public void setOppositeSettleValue(String oppositeSettleValue) {
		this.oppositeSettleValue = oppositeSettleValue;
	}

	public String getSelfType() {
		return this.selfType;
	}
	public void setSelfType(String selfType) {
		this.selfType = selfType;
	}

	public String getSelfValue() {
		return this.selfValue;
	}
	public void setSelfValue(String selfValue) {
		this.selfValue = selfValue;
	}

}
