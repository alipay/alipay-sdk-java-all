package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销海豚奖品信息模型
 *
 * @author auto create
 * @since 1.0, 2019-12-20 12:18:04
 */
public class KnPrizeInfo extends AlipayObject {

	private static final long serialVersionUID = 8732895717769818741L;

	/**
	 * 支付宝营销海豚奖品生效时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_begin")
	private String gmtBegin;

	/**
	 * 支付宝营销海豚奖品结束时间，格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 支付宝营销海豚奖品id
	 */
	@ApiField("prize_id")
	private String prizeId;

	/**
	 * 支付宝营销海豚奖品名称
	 */
	@ApiField("prize_name")
	private String prizeName;

	/**
	 * 支付宝营销海豚奖品子类型
	 */
	@ApiField("prize_sub_type")
	private String prizeSubType;

	/**
	 * 支付宝营销海豚奖品类型
	 */
	@ApiField("prize_type")
	private String prizeType;

	public String getGmtBegin() {
		return this.gmtBegin;
	}
	public void setGmtBegin(String gmtBegin) {
		this.gmtBegin = gmtBegin;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getPrizeName() {
		return this.prizeName;
	}
	public void setPrizeName(String prizeName) {
		this.prizeName = prizeName;
	}

	public String getPrizeSubType() {
		return this.prizeSubType;
	}
	public void setPrizeSubType(String prizeSubType) {
		this.prizeSubType = prizeSubType;
	}

	public String getPrizeType() {
		return this.prizeType;
	}
	public void setPrizeType(String prizeType) {
		this.prizeType = prizeType;
	}

}
